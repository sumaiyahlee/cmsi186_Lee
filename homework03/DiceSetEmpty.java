public class DiceSetEmpty {

    /**
     * private instance data
     */
     private int count;
     private int sides;
     private Die[] ds = null;
  
     // public constructor:
    /**
     * constructor
     * @param  count int value containing total dice count
     * @param  sides int value containing the number of pips on each die
     * @throws IllegalArgumentException if one or both arguments don't make sense
     * @note   parameters are checked for validity; invalid values throw "IllegalArgumentException"
     */
     public DiceSetEmpty( int icount, int isides ) {
         if(icount < isides) {
            throw new IllegalArgumentException("Must enter valid integers for count and sides.");
         }
         else {
            count = isides;
            sides = isides; 
         }
         ds = new Die[ icount ];
     }
  
    /**
     * @return the sum of all the dice values in the set
     */
     public int sum() {
        int num = 0;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            num = ds[i].roll();
            sum += num;
        }
        return sum;
     }
  
    /**
     * Randomly rolls all of the dice in this set
     *  NOTE: you will need to use one of the "toString()" methods to obtain
     *  the values of the dice in the set
     */
     public void roll() {
        for (int i = 0; i < count; i++) {
           ds[i].roll();
           ds[i].toString();
        }
     }
  
    /**
     * Randomly rolls a single die of the dice in this set indexed by 'dieIndex'
     * @param  dieIndex int of which die to roll
     * @return the integer value of the newly rolled die
     * @trhows IllegalArgumentException if the index is out of range
     */
     public int rollIndividual( int dieIndex ) {
      // not sure how to add an element to an array at a specific position
      return 0;
     }
  
    /**
     * Gets the value of the die in this set indexed by 'dieIndex'
     * @param  dieIndex int of which die to roll
     * @trhows IllegalArgumentException if the index is out of range
     */
     public int getIndividual( int dieIndex ) {
        int value;
        value = ds[dieIndex].getValue();
        return value;
     }
  
    /**
     * @return Public Instance method that returns a String representation of the DiceSet instance
     */
     public String toString() {
        String result = "";
        return result;
     }
  
    /**
     * @return Class-wide version of the preceding instance method
     */
     public static String toString( DiceSetEmpty ds ) {
        return "";
     }
  
    /**
     * @return  tru iff this set is identical to the set passed as an argument
     */
     public boolean isIdentical( DiceSetEmpty ds ) {
        return true;
     }
    /**
     * A little test main to check things out
     */
     public static void main( String[] args ) {
        // You do this part!
     }
  
  }