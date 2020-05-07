/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * filename: BinaryClockSolver.java<br />
 * purpose : Simulates a binary clock given a time string.
 * <p>
 * @author : Sumaiyah Lee
 * @author : re-hosted by B.J. Johnson
 * @since  : 2020-05-04 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

/**
 * Simulates a binary clock given a time string.
 */
public class BinaryClockSolver {
    public void printUsage() {
        System.out.println ("\n\nError for input..." +
                                "\nUSAGE:\n" +
                                "   java BinaryClockSolver <timestring> \n" +
                                "     where: \n" +
                                "       <timestring> is 'HH:MM:SS' \n" +
                                "       all values must be two digits. \n\n" 
                                );
        System.exit(0);
    }
    public void parseAndCheck(String [] args) {
        if (args.length < 1) {
            printUsage();
        }
        else {
            try{
                int[] times = new int[3];
                times[0] = Integer.parseInt(args[0].substring(0,2));
                times[1] = Integer.parseInt(args[0].substring(3,5));
                times[2] = Integer.parseInt(args[0].substring(6));
                if ( (times[0] > 23) || (times[1] > 59) || (times[2] > 59) ||
                     (times[0] < 0)  || (times[1] < 0)  || (times[2] < 0) ) {
                        throw new IllegalArgumentException("Bad Time Input");
                }
                if( (args[0].charAt(2) != ':') || (args[0].charAt(5) != ':') ) {
                    throw new IllegalArgumentException("Bad Time Input");
                }
            }
            catch (NumberFormatException nfe) {
                printUsage();
            }
            catch (IllegalArgumentException iae) {
                printUsage();
            }
        }
    }
    public static void main (String [] args) {
        BinaryClockSolver bc = new BinaryClockSolver();
        bc.parseAndCheck(args);
        
        int hour = Integer.parseInt(args[0].substring(0,2));
        int minute = Integer.parseInt(args[0].substring(3,5));
        int second = Integer.parseInt(args[0].substring(6));
        
        String[] hourRow = {"o","o","o","o","o","o"};
        String[] minuteRow = {"o","o","o","o","o","o"};
        String[] secondRow = {"o","o","o","o","o","o"};

        // hour iteration
        if (hour == 0) {
            int j = 0;
        }
        else {
            int i = 0;
            int remainder = 0;
            while (remainder != 0) {
                int subtractValue = (int)(Math.pow(2,i));
                remainder = subtractValue - hour;
                if (remainder < 0) {
                    i++;
                }
                else if (remainder == 0) {
                    if (i == 0) { hourRow[5] = "*";}
                    else if (i == 1) { hourRow[4] = "*";}
                    else if (i == 2) { hourRow[3] = "*";}
                    else if (i == 3) { hourRow[2] = "*";}
                    else if (i == 4) { hourRow[1] = "*";}
                    else if (i == 5) { hourRow[0] = "*";}
                }
                else if (remainder > 0) {
                    if (i < 6) {
                        if (i == 0) { hourRow[5] = "*";}
                        else if (i == 1) { hourRow[4] = "*";}
                        else if (i == 2) { hourRow[3] = "*";}
                        else if (i == 3) { hourRow[2] = "*";}
                        else if (i == 4) { hourRow[1] = "*";}
                        else if (i == 5) { hourRow[0] = "*";}
                        hour = remainder;
                        i = 0;
                    }
                    if (i == 6) {
                        hourRow[0] = "*";
                        hour = hour - (int)(Math.pow(2,5));
                        i = 0;
                    }
                }
            }
        }
        // minute iteration
        if (minute == 0) {
            int j = 0;
        }
        else {
            int i = 0;
            int remainder = 0;
            while (remainder != 0) {
                int subtractValue = (int)(Math.pow(2,i));
                remainder = subtractValue - minute;
                if (remainder < 0) {
                    i++;
                }
                else if (remainder == 0) {
                    if (i == 0) { minuteRow[5] = "*";}
                    else if (i == 1) { minuteRow[4] = "*";}
                    else if (i == 2) { minuteRow[3] = "*";}
                    else if (i == 3) { minuteRow[2] = "*";}
                    else if (i == 4) { minuteRow[1] = "*";}
                    else if (i == 5) { minuteRow[0] = "*";}
                }
                else if (remainder > 0) {
                    if (i < 6) {
                        if (i == 0) { minuteRow[5] = "*";}
                        else if (i == 1) { minuteRow[4] = "*";}
                        else if (i == 2) { minuteRow[3] = "*";}
                        else if (i == 3) { minuteRow[2] = "*";}
                        else if (i == 4) { minuteRow[1] = "*";}
                        else if (i == 5) { minuteRow[0] = "*";}
                        minute = remainder;
                        i = 0;
                    }
                    if (i == 6) {
                        minuteRow[0] = "*";
                        minute = minute - (int)(Math.pow(2,5));
                        i = 0;
                    }
                }
            }
        }
        
        // second iteration
        if (second == 0) {
            int j = 0;
        }
        else {
            int i = 0;
            int remainder = 0;
            while (remainder != 0) {
                int subtractValue = (int)(Math.pow(2,i));
                remainder = subtractValue - second;
                if (remainder < 0) {
                    i++;
                }
                else if (remainder == 0) {
                    if (i == 0) { secondRow[5] = "*";}
                    else if (i == 1) { secondRow[4] = "*";}
                    else if (i == 2) { secondRow[3] = "*";}
                    else if (i == 3) { secondRow[2] = "*";}
                    else if (i == 4) { secondRow[1] = "*";}
                    else if (i == 5) { secondRow[0] = "*";}
                }
                else if (remainder > 0) {
                    if (i < 6) {
                        if (i == 0) { secondRow[5] = "*";}
                        else if (i == 1) { secondRow[4] = "*";}
                        else if (i == 2) { secondRow[3] = "*";}
                        else if (i == 3) { secondRow[2] = "*";}
                        else if (i == 4) { secondRow[1] = "*";}
                        else if (i == 5) { secondRow[0] = "*";}
                        second = remainder;
                        i = 0;
                    }
                    if (i == 6) {
                        secondRow[0] = "*";
                        second = second - (int)(Math.pow(2,5));
                        i = 0;
                    }
                }
            }
        }

        System.out.println("------");
        // hours
        for (int i = 0; i < hourRow.length; i++) {
            System.out.print(hourRow[i]);
        }
        System.out.println("");
        // minutes
        for (int i = 0; i < minuteRow.length; i++) {
            System.out.print(minuteRow[i]);
        }
        System.out.println("");
        // seconds
        for (int i = 0; i < secondRow.length; i++) {
            System.out.print(secondRow[i]);
        }
        System.out.println("");
        System.out.println("------");
    }
}