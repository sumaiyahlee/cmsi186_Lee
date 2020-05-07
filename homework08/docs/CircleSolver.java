/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * filename: CircleSolver.java<br />
 * purpose : Detects whether or not two circles intersect given their center points and radius.
 * <p>
 * @author : Sumaiyah Lee
 * @author : re-hosted by B.J. Johnson
 * @since  : 2020-05-04 
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

/**
 * CircleSolver detects whether or not two circles intersect given their center points and radius.
 */
public class CircleSolver {
    /**
     * Informs the user of the correct way to run the program when they have made an entry error.
     * It also exits the program, assuming that the user error will cause an un-runnable condition.
    */
    public void printUsage () {
        System.out.println ("\n\nError for input..." +
                                "\nUSAGE:\n" +
                                "   java CircleSolver <x1> <y1> <radius1> <x2> <y2> <radius2>\n" +
                                "     where: \n" +
                                "       <x1> <y1> coordinates for center of first circle \n" +
                                "       <radius1> radius of first circle \n" +
                                "       <x2> <y2> coordinates for center of second circle \n" +
                                "       <radius2> radius of second circle \n\n" 
                                );
        System.exit(0);
    }
    /**
     * Parses through and checks arguments
     * @param args String array passed directly from main()
    */
    public void parseAndCheck (String [] args) {
        if (args.length != 6) {
            printUsage();
        }
        else {
            try {
                int[] argsChecker = new int[6];
                if (Integer.parseInt(args[2]) < 1 || Integer.parseInt(args[5]) < 1) {
                    argsChecker[0] = 5 / 0;
                }

            }
            catch (ArithmeticException ae) {
                printUsage();
            }
            catch (IllegalArgumentException iae) {
                printUsage();
            }
        }
    }
    /**
     * This is the main part of the program. It first verifies the arguments
     * from the command line by calling the <code>parseAndCheck()</code> method.  
     * @param args six are used: [0] = first x-coordinate, [1] = first y-coordinate,
     * [2] = first radius, [3] = second x-coordinate, [4] = second y-coordinate, [5] = second radius
     */
    public static void main (String [] args) {
        CircleSolver c = new CircleSolver();
        c.parseAndCheck(args);

        double distance = (Math.pow((Integer.parseInt(args[3]) - Integer.parseInt(args[0])), 2) + Math.pow((Integer.parseInt(args[4]) - Integer.parseInt(args[1])), 2));
        double radDistance = Math.pow((Integer.parseInt(args[5]) + Integer.parseInt(args[2])), 2);
        System.out.println("Circle 1: \n" + "Center => " + "(" + Integer.parseInt(args[0]) + "," + Integer.parseInt(args[1]) + ") \n" + "Radius => " + Integer.parseInt(args[2]) + "\n");
        System.out.println("Circle 2: \n" + "Center => " +"(" + Integer.parseInt(args[3]) + "," + Integer.parseInt(args[4]) + ") \n" + "Radius => " + Integer.parseInt(args[5]) + "\n");
        if (distance == radDistance) {
            System.out.println("Your circles intersect at one point.");
        }
        else if (distance > radDistance){
            System.out.println("Your circles did not intersect.");
        }
        else {
            System.out.println("Your circles intersect at multiple points.");
        }
    }

}