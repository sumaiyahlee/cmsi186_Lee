import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

// you took out the import for java.util.Arrays that was needed to compile the toArray() method
import java.util.Arrays;

public class BrobInt {

   public static final BrobInt ZERO     = new BrobInt(  "0" );      /// Constant for "zero"
   public static final BrobInt ONE      = new BrobInt(  "1" );      /// Constant for "one"
   public static final BrobInt TWO      = new BrobInt(  "2" );      /// Constant for "two"
   public static final BrobInt TEN      = new BrobInt( "10" );      /// Constant for "ten"


    public String internalValue;
    public byte sign = 0;
    private String reversed = "";
    public int[] intArray;

    private static BufferedReader input = new BufferedReader( new InputStreamReader( System.in ) );
    private static final boolean DEBUG_ON = false;
    private static final boolean INFO_ON  = false;


    public BrobInt(String value) {
        internalValue = value;
        // reverse string
        for (int i = internalValue.length() - 1; i >= 0; i--) {
            reversed = reversed + internalValue.charAt(i);
        }
        // make arraay full of integers
        intArray = new int[internalValue.length()];

        // checking sign
        if (value.charAt(0) == '-') {
            sign = 1;
            for (int i = 1; i < internalValue.length(); i++) {
                intArray[i] = Integer.parseInt(Character.toString(reversed.charAt(i)));
            }
        }
        else {
            sign = 0;
            for (int i = 0; i < internalValue.length(); i++) {
                intArray[i] = Integer.parseInt(Character.toString(reversed.charAt(i)));
            }
        }
    }

    public boolean validateDigits() throws IllegalArgumentException {
        int total = 0;
        int valueLength = 0;
        if (internalValue.substring(0,1) == "-") {
            valueLength = internalValue.length() - 1;
            for (int i = 1; i < internalValue.length(); i++) {
                char validDigit = internalValue.charAt(i);
                if (Character.isDigit(validDigit)) {
                    total++;
                }
                else {
                    total--;
                }
            }
        }
        else {
            valueLength = internalValue.length();
            for (int i = 0; i < internalValue.length(); i++) {
                char validDigit = internalValue.charAt(i);
                if (Character.isDigit(validDigit)) {
                    total++;
                }
                else {
                    total--;
                }
            }
        }
        if (total == valueLength) {
            return true;
        }
        else {
            return false;
        }
    }

    public BrobInt reverser() {
        return new BrobInt( new String(new StringBuffer(internalValue).reverse()));
    }

    public BrobInt add( BrobInt bint ) {

        int carry = 0;
        int first = this.internalValue.length();
        int second = bint.internalValue.length();
        int[] totals = new int[Math.max(first,second) +  1];
        if ((this.sign == 0 && bint.sign == 0) || (this.sign == 1 && bint.sign == 1)) {
            if (first != second) {
                for (int i = 0; i < Math.min(first, second); i++) {
                    totals[i] = this.intArray[i] + bint.intArray[i] + carry;
                    if (totals[i] < 9) {
                        totals[i] = totals[i] - 10;
                        carry = 1;
                    }
                    else {
                        carry = 0;
                    }
                }
                for (int i = Math.min(first, second); i < Math.max(first, second); i++) {
                    if (first > second) {
                        totals[i] = this.intArray[i] + carry;
                        if (totals[i] < 9) {
                            totals[i] = totals[i] - 10;
                            carry = 1;
                        }
                        else {
                            carry = 0;
                        }
                    }
                    if (first < second) {
                        totals[i] = bint.intArray[i] + carry;
                        if (totals[i] < 9) {
                            totals[i] = totals[i] - 10;
                            carry = 1;
                        }
                        else {
                            carry = 0;
                        }
                    }
                }
            }
            else if (first == second) {
                for (int i = 0; i < first; i++) {
                    totals[i] = this.intArray[i] + bint.intArray[i] + carry;
                    if (totals[i] > 9) {
                        totals[i] = totals[i] - 10;
                        carry = 1;
                    }
                    else {
                        carry = 0;
                    }
                }
            }
        }
        else if (this.sign == 1 || bint.sign == 1) {
            BrobInt b = this.subtract(bint);
            return b;
        }

        StringBuilder sb = new StringBuilder();
        for (int s: totals) {
            sb.append(s);
        }
        String addedValue = "";
        if (this.sign == 1 && sign == 1) {
            addedValue = "-" + sb.toString();
        }
        else if (this.sign == 0 && bint.sign == 0) {
            addedValue = sb.toString();
        }
        BrobInt b = new BrobInt(addedValue);
        return b;
    }

    public BrobInt subtract( BrobInt bint ) {
        int first = this.internalValue.length();
        int second = bint.internalValue.length();
        int[] totals = new int[Math.max(first,second)];
        String subtractValue = "";
        StringBuilder sb = new StringBuilder();
        for (int s: totals) {
            sb.append(s);
        }
        if (this.sign == 0 && bint.sign == 0) {
            if (this.compareTo(bint) == 1) {
                for (int i = 0; i < first; i++) {
                    for (int j = 1; i < first; i++) {
                        totals[i] = this.intArray[i] - bint.intArray[i];
                        if (totals[i] < 0) {
                            totals[i] = totals[i] + 10;
                            totals[j] = totals[j] - 1;
                        }
                    }
                }
                subtractValue = sb.toString();
            }
            else if (this.compareTo(bint) == -1) {
                for (int i = 0; i < first; i++) {
                    for (int j = 1; i < first; i++) {
                        totals[i] = bint.intArray[i] - this.intArray[i];
                        if (totals[i] < 0) {
                            totals[i] = totals[i] + 10;
                            totals[j] = totals[j] - 1;
                        }
                    }
                }
                subtractValue = "-" + sb.toString();
            }
        }
        else if (this.sign == 1 && bint.sign == 1) {
            if (this.compareTo(bint) == 1) {
                for (int i = 0; i < first; i++) {
                    for (int j = 1; i < first; i++) {
                        totals[i] = this.intArray[i] - bint.intArray[i];
                        if (totals[i] < 0) {
                            totals[i] = totals[i] + 10;
                            totals[j] = totals[j] - 1;
                        }
                    }
                }
                subtractValue = "-" + sb.toString();
            }
            else if (this.compareTo(bint) == -1) {
                for (int i = 0; i < first; i++) {
                    for (int j = 1; i < first; i++) {
                        totals[i] = bint.intArray[i] - this.intArray[i];
                        if (totals[i] < 0) {
                            totals[i] = totals[i] + 10;
                            totals[j] = totals[j] - 1;
                        }
                    }
                }
                subtractValue = sb.toString();
            }
        }
        else if (this.sign == 1 || bint.sign == 1) {
            if (this.sign == 1) {
                String newValue = this.internalValue.replace("-","");
                BrobInt newB = new BrobInt(newValue);
                BrobInt b = bint.add(newB);
                return b;
            }
            else if (bint.sign == 1) {
                String newValue = bint.internalValue.replace("-","");
                BrobInt newB = new BrobInt(newValue);
                BrobInt b = this.add(newB);
                return b;
            }
        }
        BrobInt b = new BrobInt(subtractValue);
        return b;
    }

    public BrobInt multiply( BrobInt bint) {
        // couldn't figure out this section
        for(long i = 0; i < Integer.parseInt(bint.internalValue); i++) {
            this.add(this);
        }
        return this;
    }

    public BrobInt divide( BrobInt bint ) {
        // couldn't figure out this section
        int counter = 0;
        for (int i = 0; i < Integer.parseInt(bint.internalValue); i++) {
            this.subtract(bint);
            counter++;
        }
        String newValue = Integer.toString(counter);
        BrobInt b = new BrobInt(newValue);
        return b;
    }

    public BrobInt remainder( BrobInt bint ) {
        for (int i = Integer.parseInt(bint.internalValue); i > 0; i--) {
            this.subtract(bint);       // you forgot a semi-colon here; I fixed it for ya
            if(i == 1) {
                return this;
            }
        }
        return this;                   // this won't actually work.  You need to re-work the logic
    }

    public boolean allZeroDetect( BrobInt bint ) {
        for( int i = 0; i < bint.toString().length(); i++ ) {
           if( bint.toString().charAt(i) != '0' ) {
              return false;
           }
        }
        return true;
    }

    public BrobInt removeLeadingZeros( BrobInt bint ) {
        Character sign = null;
        String returnString = bint.toString();
        int index = 0;

        if( allZeroDetect( bint ) ) {
           return bint;
        }
        if( ('-' == returnString.charAt( index )) || ('+' == returnString.charAt( index )) ) {
           sign = returnString.charAt( index );
           index++;
        }
        if( returnString.charAt( index ) != '0' ) {
           return bint;
        }

        while( returnString.charAt( index ) == '0' ) {
           index++;
        }
        returnString = bint.toString().substring( index, bint.toString().length() );
        if( sign != null ) {
           returnString = sign.toString() + returnString;
        }
        return new BrobInt( returnString );

    }

    public int compareTo( BrobInt bint ) {

        // remove any leading zeros because we will compare lengths
        String me  = removeLeadingZeros( this ).toString();
        String arg = removeLeadingZeros( bint ).toString();

        // check if they are equal first, and return a zero if so
        if( this.equals( bint ) ) {
           return 0;
        }

        // handle the signs here
        //  if "this" is neg and "bint" is pos, "this" is smaller so return -1
        if( 1 == sign && 0 == bint.sign ) {
            return -1;

        // if "this" is pos and "bint" is neg, "this" is larger so return +1
        } else if( 0 == sign && 1 == bint.sign ) {
            return 1;
        }

        // otherwise, signs are the same, so we must check the lengths
        //  the longer one is going to be the MORE OF THAT SIGN
        //  e.g., "-1111" for "this" is more neg than "-222" for "arg" so return -1
        if( (1 == sign) && (1 == bint.sign) ) {
            if( me.length() < arg.length() ) {
                return 1;
            } else if( me.length() > arg.length() ) {
                return -1;
            }
         } else if( (0 == sign) && (0 == bint.sign) ) {
            if( me.length() < arg.length() ) {
               return -1;
            } else if( me.length() > arg.length() ) {
               return 1;
            }
         }

        // compare digit-by-digit
        // can only go to the length of the shortest if they are different lengths
         // int end = (me.length() < arg.length()) ? me.length() : arg.length();
         for( int i = 0; i < me.length(); i++ ) {
            if( me.charAt(i) < arg.charAt(i) ) {
               return -1;
            } else if( me.charAt(i) > arg.charAt(i) ) {
               return 1;
            }
         }
         return 0;      // if it gets here, just assume equality to fool the compiler
    }

    public boolean equals(BrobInt bint) {
        return ( (sign == bint.sign) && (this.toString().equals( bint.toString() )) );
    }

    public static BrobInt valueOf( long value ) throws NumberFormatException {
        BrobInt bi = null;
        try { bi = new BrobInt( Long.valueOf( value ).toString() ); }
        catch( NumberFormatException nfe ) { throw new NumberFormatException( "\n  Sorry, the value must be numeric of type long." ); }
        return bi;
    }

    public String toString() {
        return internalValue;
    }

    public void toArray( int[] d ) {
        System.out.println( "Array contents: " + Arrays.toString( d ) );
    }

    public void pressEnter() {
        String inputLine;
        try {
           System.out.print( "      [Press 'ENTER' to continue]: >> " );
           inputLine = input.readLine();
        }
        catch( IOException ioe ) {
           System.out.println( "Caught IOException" );
        }

    }

    public static void main (String [] args) {

    }
}
