import java.util.*;
public class SkateRamp  {
    private double percentage = 1.0;

    public void printUsage() {
        System.out.println ("\n USAGE:\n" + 
                            "    java SkateRamp <function> <coeff1> <coeff2> ... <lower> <upper> [percent]\n" + 
                            "      where: \n" +
                            "        <function> is a mathematical function like 'poly' or 'sin'\n" +
                            "        <coeff[n]> is a coefficient for the function's X terms\n" + 
                            "        <lower> and <upper> are the lower and upper bounds of the function\n" + 
                            "        [percent] is an optional value for comparison");
        System.exit(0);
    }

    public static double calculateY( double[] coeffs, double midPoint ) {
        double yValue = 0.0;
        for( int i = 0; i < coeffs.length; i++ ) {
           yValue += coeffs[i] * Math.pow( midPoint, i );
        }g
        return yValue;
     }

    public static double integratePolynomial( double lb, double ub, double[] coefficients, int n ) {
       double midpt  = 0.0;
       double sum    = 0.0;
       double width  = ((ub - lb) / n);
       double yValue = 0.0;
       for( int j = 0; j < n; j++ ) {
           yValue = 0.0;
           midpt = lb + (width / 2.0) + (j * width);
           yValue = calculateY( coefficients, midpt );
           sum += yValue * width;
        }
        return sum;
    }

    public static double integrateSin(double lb, double ub, int n) {
        double width = ((ub - lb) / n);
        double midpt = 0.0;
        double yValue = 0.0;
        double sum = 0.0;
        for (int j = 0; j < n; j++) {
            yValue = 0.0;
            midpt = lb + (width / 2.0) + (j * width);
            yValue = Math.sin(midpt);
            sum += yValue * width;
        }
        return sum;
    }
    
    public static void main (String [] args) {
        // adding coefficients to arraylist
        ArrayList<Double> coefficients = new ArrayList<Double>();
        // converting arraylist to array
        double[] coeffs = new double[coefficients.size()];

        SkateRamp sr = new SkateRamp();
        if (0 == args.length) {
            sr.printUsage();
        } 
        else {
            for (int i = 1; i < (args.length - 2); i++) {
                coefficients.add(Double.parseDouble(args[i]));
            }
        }
        if (args[args.length -1].contains("%")) {
            sr.percentage = Double.parseDouble(args[args.length - 1].substring(0, args[args.length - 1].length() - 1));
            System.out.println("contains percent: " + sr.percentage);
        }
        System.out.println (args[0]);
        if (args[0].equals("poly")) {
            System.out.println(integratePolynomial(Double.parseDouble(args[args.length - 2]), Double.parseDouble(args[args.length - 1]), coeffs, 50));
        }
        else if (args[0].equals("sin")) {
            System.out.println(integrateSin(Double.parseDouble(args[1]), Double.parseDouble(args[2]), 50));
        }
        
    }

}
