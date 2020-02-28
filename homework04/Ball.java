import java.text.DecimalFormat;

public class Ball {

   private static final double BALL_RADIUS          = 4.45;    // radius in inches as given by the problem
   private static final double BALL_WEIGHT          = 1.0;     // weight in pounds as given
   private static final double FRICTION_COEFFICIENT = 0.99;    // one percent slowdown per second due to friction
   public  static final int    X_INDEX              = 0;
   public  static final int    Y_INDEX              = 1;
   private static final int    TAB_OFFSET_INDEX     = 22;      // OCD move just to make output look lined up

   private boolean  isInBounds      = true;                    // all balls will start in bounds by default
   private double[] centerLocation  = new double[2];           // array containing both coordinate values
   private double[] currentSpeed    = new double[2];           // array containing both direction speed values
   private double   frictionValue   = FRICTION_COEFFICIENT;    // initialize for one secone default time slice
   private double[] poleLocation    = new double[2];           // array containing both coordinate values for pole
  /**
   * Constructor to make a new Ball, no parameters
   *  @param xLocation double-precision value of the X location of the ball
   *  @param yLocation double-precision value of the Y location of the ball
   *  @param xMovement double-precision value for the initial speed of the ball in X direction
   *  @param yMovement double-precision value for the initial speed of the ball in Y direction
   */
   public Ball( double xLocation, double yLocation, double xMovement, double yMovement ) {
      centerLocation[0] = xLocation;
      centerLocation[1] = yLocation;
      currentSpeed[0]   = xMovement;
      currentSpeed[1]   = yMovement;
   }

  /**
   *  method to fetch the current speed of the ball
   *  @return  double-precision two-element array of X and Y speed values
   */
   public double[] getCurrentSpeed() {
      return currentSpeed;
   }

  /**
   *  method to fetch the current position of the ball
   *  @return  double-precision two-element array of X and Y location values
   */
   public double[] getCurrentPosition() {
      return centerLocation;
   }

  /**
   *  method to determine if the ball is still moving
   *  @return  boolean true if ball is moving, false if at rest
   *  Note:    at rest is defined as speed <= 1.0 inch/second
   */
   public boolean isStillMoving() {
      double rest =  1/12;
      // absolute value of current speed ?
      if (Math.abs(currentSpeed[0]) <= rest && Math.abs(currentSpeed[1]) <= rest) {
         return false;
      }
      else {
         return true;
      }
   }

  /**
   *  method to flag the ball as "out of bounds" which will set its speed to zero and its
   *    "isInBounds" value to false so it will effectively no longer be in the simulation
   *  @param fieldWidth    double-precision value of 1/2 the designated field width
   *  @param fieldHeight   double-precision value of 1/2 the designated field height
   */
   public void setBallOutOfBounds( double fieldWidth, double fieldHeight ) {
      if (Math.abs(centerLocation[0]) > fieldWidth || Math.abs(centerLocation[1]) > fieldHeight) {
         isInBounds = false;
         currentSpeed[0] = 0;
         currentSpeed[1] = 0;
      }
   }

  /**
   *  method to update the speed of the ball for one slice of time
   *  @param timeSlice     double-precision value of time slice for simulation
   *  @return  double-precision two element array of new velocity values
   */
   public double[] updateSpeedsForOneTick( double timeSlice ) {
      currentSpeed[0] = currentSpeed[0] -(currentSpeed[0] * 0.01 * timeSlice);
      currentSpeed[1] = currentSpeed[1] - (currentSpeed[1] * 0.01 * timeSlice);
      return currentSpeed;
   }

  /**
   *  method to update the ball's position and velocity
   *  @param timeSlice     double-precision value of time slice for simulation
   */
   public void move( double timeSlice ) {
      centerLocation[0] += currentSpeed[0] * timeSlice * frictionValue;
      centerLocation[1] += currentSpeed[1] * timeSlice * frictionValue;

      currentSpeed[0] = currentSpeed[0] -(currentSpeed[0] * 0.01 * timeSlice);
      currentSpeed[1] = currentSpeed[1] - (currentSpeed[1] * 0.01 * timeSlice);
   }
   /**
    * method to set pole's location randomly
    * @return double-precision two element array of new position coordinate values
    */
   public double[] setPole() {
        
      double x = Math.random() * 1000 + 1;
      double y = Math.random() * 1000 + 1;
      if (x < 500) {
          x = x - (2 * x);
      }
      if (y < 500) {
          y = y - (2 * x);
      }
      if (x >= 500) {
          x = x - 500;
      }
      if (y >= 500) {
          y = y - 500;
      }
      poleLocation[0] = x;
      poleLocation[1] = y;
      return poleLocation;
  }

  /**
   * our venerable "toString()" representation
   *  @return  String-y version of what this Ball is
   */
   public String toString() {


      String positionString = "(";
      positionString += this.getCurrentPosition()[0] + ", " + this.getCurrentPosition()[1] + ")";


      String speedString = "(";
      speedString += this.getCurrentSpeed()[0] + ", " + this.getCurrentSpeed()[1] + ")";

      String output = "Position => " + positionString + ", Velocity => " + speedString;
      return output;
   }

  /**
   * a main method for testing -- pretty simple
   *  @param args[] String array of command line arguments
   */
   public static void main( String args[] ) {
      System.out.println( "\n   Testing the Ball class................" );
      Ball b1 = new Ball( 10.0, 50.0, 2.0, 6.0 );
      Ball b2 = new Ball( 20.0, 60.0, 3.0, 7.0 );
      Ball b3 = new Ball( 30.0, 70.0, 4.0, 8.0 );
      Ball b4 = new Ball( 40.0, 80.0, 5.0, 9.0 );
      System.out.println( "Ball b1: " + b1.toString() );
      System.out.println( "Ball b2: " + b2.toString() );
      System.out.println( "Ball b3: " + b3.toString() );
      System.out.println( "Ball b4: " + b4.toString() );
      System.out.println();
      System.out.println("Time Slice: 1.0");
      b1.move( 1.0 );
      b2.move( 1.0 );
      b3.move( 1.0 );
      b4.move( 1.0 );
      System.out.println( "Ball b1: " + b1.toString() );
      System.out.println( "Ball b2: " + b2.toString() );
      System.out.println( "Ball b3: " + b3.toString() );
      System.out.println( "Ball b4: " + b4.toString() );
      System.out.println();
      System.out.println("Time Slice: 0.1");
      b1.move( 0.1 );
      b2.move( 0.1 );
      b3.move( 0.1 );
      b4.move( 0.1 );
      System.out.println( "Ball b1: " + b1.toString() );
      System.out.println( "Ball b2: " + b2.toString() );
      System.out.println( "Ball b3: " + b3.toString() );
      System.out.println( "Ball b4: " + b4.toString() );
      System.out.println();
      System.out.println("Time Slice: 2.0");
      b1.move( 2.0 );
      b2.move( 2.0 );
      b3.move( 2.0 );
      b4.move( 2.0 );
      System.out.println( "Ball b1: " + b1.toString() );
      System.out.println( "Ball b2: " + b2.toString() );
      System.out.println( "Ball b3: " + b3.toString() );
      System.out.println( "Ball b4: " + b4.toString() );
      System.out.println();
      System.out.println("For Loop: ");
      b1.setBallOutOfBounds( 30.0, 30.0 );
      for( int i = 0; i < 250; i++ ) {
         b1.move( 2.0 );
         b2.move( 2.0 );
         b3.move( 2.0 );
         b4.move( 2.0 );
         System.out.println( "Ball b1: " + b1.toString() );
         System.out.println( "Ball b2: " + b2.toString() );
         System.out.println( "Ball b3: " + b3.toString() );
         System.out.println( "Ball b4: " + b4.toString() );

         if( b1.isStillMoving() || b2.isStillMoving() || b3.isStillMoving() || b4.isStillMoving() ) {
            System.out.println();
         } else {
            break;
         }
      }
   }

}