/**
 * @ Sumaiyah Lee
 * @ PiSolver.java
 * @ 01/27/2020
 */

public class PiSolver {
    public static double estimate(int darts) {
        int inCircle = 0;
        if (darts < 1) {
            throw new IllegalArgumentException("You need at least 1 dart.");
        }
        else {
            for(int i = 0; i <= darts; i++) {
                double one = Math.random();
                double two = -Math.random();
                double chooseQuad = Math.random();  
                if (chooseQuad < 0.25) {
                    if(Math.hypot(one,one) <= 1) {
                        inCircle++;
                    }
                }
                else if (chooseQuad < 0.50) {
                    if(Math.hypot(two,one) <= 1) {
                        inCircle++;
                    }
                }
                else if (chooseQuad < 0.75) {
                    if(Math.hypot(two,two) <= 1) {
                        inCircle++;
                    }
                }
                else {
                    if (Math.hypot(one,two) <= 1) {
                        inCircle++;
                    }
                }
            }
        }
        double percentage, pi = 0;
        percentage = (double)inCircle / darts;
        pi = 4.0 * percentage;
        return pi;
    }
    public static void main (String [] args) {
        if (args.length == 0) {
            System.out.println("You must input a number.");
        }
        int darts = Integer.parseInt(args[0]);
        System.out.println(estimate(darts));
    }
}