import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MainProgLoopDemo{

   public static void main( String args[] ) {
      System.out.println( "\n   Welcome to the MainProgLoopDemo!!\n" );
      System.out.println( "     Press the 'q' key to quit the program." );

     // This line uses the two classes to assemble an "input stream" for the user to type
     // text into the program
      BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
      while( true ) {
        System.out.println("1. roll all dice");
        System.out.println("2. roll one die");
        System.out.println("3. calculate score");
        System.out.println("4. save score");
        System.out.println("5. display score");
        System.out.println("6. quit program");
        System.out.print( "\n   enter >>" );
        String inputLine = null;
        try {
            inputLine = input.readLine();
            if( 0 == inputLine.length() ) {
               System.out.println("enter some text!:");
               continue;
            }
            System.out.println( "   You typed: " + inputLine );
            if( 'q' == inputLine.charAt(0) ) {
               break;
            }         }
        catch( IOException ioe ) {
            System.out.println( "Caught IOException" );
         }
      }
   }
}