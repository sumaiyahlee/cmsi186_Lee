import java.util.*;
public class SoccerSim {

    public static void main (String [] args) {
        int size = args.length/4;
        List<Ball> balls = new ArrayList<Ball>();
        if (args.length % 4 == 1) {   
            for (int i = 0; i < args.length; i++) {
                for (int j = 1; j < size + 1; j++) {
                    Ball b = new Ball(Integer.parseInt(args[i]), Integer.parseInt(args[i+1]), Integer.parseInt(args[i+2]), Integer.parseInt(args[i+3]));
                    balls.add(b);
                    i = j * 4;
                }
            }
        }
        else if (args.length == 0){
            throw new IllegalArgumentException("You must enter the location and velocity for each ball, as well as the time slice.");
        }
        else {
            throw new IllegalArgumentException("You must enter the location and velocity for each ball, as well as the time slice.");
        }
        System.out.println ();
        System.out.println("Initial Balls in Array: ");
        System.out.println();
        for (int i = 0; i < balls.size(); i++) {
            System.out.println("Ball #" + (i+1) + ": " + balls.get(i));
        }
        
        System.out.println();
        System.out.println ("Balls after Time Slice:");
        System.out.println();
        for (int i = 0; i < balls.size(); i++) {
            for (int j = balls.size() - 1; j > 0; j--) {
                balls.get(i).move(Integer.parseInt(args[args.length - 1]));
                balls.get(i).setBallOutOfBounds(500,500);
                System.out.println("Ball #" + (i+1) + ": \n" +balls.get(i).toString());
                if(balls.get(i).setPole() == balls.get(i).getCurrentPosition()) {
                    break;
                }
                else if (Math.hypot(balls.get(i).getCurrentPosition()[0] - balls.get(j).getCurrentPosition()[0],
                balls.get(i).getCurrentPosition()[1] - balls.get(j).getCurrentPosition()[1]) < 4.45) {
                    System.out.println ("Ball #" + (i+1) + " collided with Ball #" + j);
                }
                else if (balls.get(i).isStillMoving()) {
                    System.out.println();
                }
                else if (balls.get(i).getCurrentSpeed()[0] < 1/12 || balls.get(i).getCurrentSpeed()[1] < 1/12) {
                    System.out.println("Ball #" + (i+1) + " has stopped moving.");
                }
            }
        }
    }
}
