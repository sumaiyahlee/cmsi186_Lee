import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HighRoll {

   public static void main( String args[] ) {
      System.out.println( "\n   Welcome to the MainProgLoopDemo!!\n" );
      System.out.println( "     Press the 'q' key to quit the program." );

     //
     //  Right here you need to call the DiceSet constructor to make a DiceSet for the
     //    game to operate with.  You'll need to get the two arguments from the command line
     //    so you know how many dice and how many sides for each die.  These are passed to
     //    the DiceSet constructor as arguments.
     //

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
        System.out.print( "\n   enter >> " );
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
            }

//
// Right here you need some "else-if" statements here to handle the other five options.
//   for example, if the user enters a '1' you need to call the "roll()" method from DiceSet
//   otherwise, the program won't play the game.  Be sure and display something to the user
//   after every option so she will know what's going on.
//

        }
        catch( IOException ioe ) {
            System.out.println( "Caught IOException" );
         }
      }
   }
}
