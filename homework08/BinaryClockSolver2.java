/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    * filename: BinaryClockSolver2<br />
    * purpose : Outputs a clock input as a binary output that simulates a clock.
    * <p>
    * @author : Sureena Hukkoo
    * @since  : 2020-04-20
* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
/**
 * Gets a clock input separated by ":" and turns it into binary output
 * <p>
 * The binary output is outputted to look like a clock.
 */
public class BinaryClockSolver2 {
/**
 * Gets the string input and outputs an array of strings
 *
 * @param  input A string that is formatted with colons
 * @return String array with the values of the hour minute and second at each index.
 */
 public static String[] split(String input){
   String [] split = input.split(":");
   return split;
 }
 /**
   * Gets the string array input and changes each index to binary.
   *
   * @param  ss A string array that has hour, minute, and second times at each input
   * @return String array with the binary values of the hour minute and second at each index.
   */
 public static String[] changeToBinary(String [] ss){
   String [] binary = new String[ss.length];
   for(int i = 0; i< ss.length; i++){
     int temp = Integer.parseInt(ss[i]);
     String strBinary = Integer.toBinaryString(temp);
     binary[i] = strBinary;
   }
   return binary;
 }
 /**
   * Changes the binary value to an output that can be read on screen.
   * has a lowercase o for 0 and a star for 1.
   *
   * @param  bs A string array that contains the binary values for the hour, minute and second of the clock
   * @return String array with the values of the hour minute and second at each index that the user sees.
   */
 public static String[] binaryClock(String [] bs){
   String [] output = new String[bs.length];
   for(int i = 0; i<bs.length; i++){
     String temp = "";
     for(int j=0; j < bs[i].length(); j++){
       if(bs[i].charAt(j) == '0') {
         temp = temp + "o";
       }
       else {
         temp = temp + "*";
       }
     }
     output[i] = temp;
   }
   return output;
 }
 /**
  * Informs the user of the correct way to run the program when they have made an entry error.
  *   It also exits the program, assuming that the user error will cause an un-runnable condition.
  */
 public static void printUsage(){
   System.out.println("Please enter an actual time");
   System.out.println("The hour has to be less than 24, and the minutes and seconds have to be less than 60");
   System.exit(0);
 }
 /**
  * This is the main method of the program.  It first verifies the arguments from
  *  the command line, and splits the string using the <code>split</code> method.
  *  After that, it calls the <code>changeToBinary</code> method and the <code>binaryClock</code>
  *  then displays the results using a for loop.
  *
  * @param args 1 is used: [0] = the time, using : to separate hours, minutes, and seconds.
  */
 public static void main(String[] args){
   String [] splitString = null;
   String [] binaryString = null;
   String [] outputString = null;
   try{
     splitString = split(args[0]);
     int hour = Integer.parseInt(splitString[0]);
     int minutes = Integer.parseInt(splitString[1]);
     int seconds = Integer.parseInt(splitString[2]);
     if(hour > 24 || minutes > 59|| seconds > 59){
       printUsage();
     }
     if(hour < 0 || minutes < 0 || seconds < 0){
       printUsage();
     }
   }
   catch(NumberFormatException nfe){
     printUsage();
   }
   binaryString = changeToBinary(splitString);
   outputString = binaryClock(binaryString);
   for(int i =0; i<outputString.length; i++){
     System.out.println(outputString[i]+ "\n");
   }
 }
}