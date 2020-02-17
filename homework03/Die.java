public class Die {

    /**
     * private instance data
     */
     private static int sides;
     private int pips;
     private final int MINIMUM_SIDES = 4;
  
     // public constructor:
    /**
     * constructor
     * @param nSides int value containing the number of sides to build on THIS Die
     * @throws       IllegalArgumentException
     * Note: parameter must be checked for validity; invalid value must throw "IllegalArgumentException"
     */
     public Die( int isides ) {
        if(isides < MINIMUM_SIDES) {
           throw new IllegalArgumentException("Not enough sides");
        }
        else {
           sides = isides;
        }
      
     }
  
    /**
     * Roll THIS die and return the result
     * @return  integer value of the result of the roll, randomly selected
     */
     public int roll() {
        pips = (int)(Math.random() * sides) + 1;
        int num = pips;
        return num;
     }
  
    /**
     * Get the value of THIS die to return to the caller; note that the way
     *  the count is determined is left as a design decision to the programmer
     *  For example, what about a four-sided die - which face is considered its
     *  "value"?
     * @return the pip count of THIS die instance
     */
     public int getValue() {
        return pips;
     }
  
    /**
     * Public Instance method that returns a String representation of THIS die instance
     * @return String representation of this Die
     */
     public String toString() {
        return "[" + pips + "]";
     }
  
    /**
     * Class-wide method that returns a String representation of THIS die instance
     * @return String representation of this Die
     */
     public static String toString( Die d ) {
        return "" + d.toString();
     }
  
    /**
     * A little test main to check things out
     */
     public static void main( String[] args ) {
        System.out.println( "Hello world from the Die class..." );
     }
  
  }