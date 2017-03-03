
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // city and robot
        City kw = new City();
        RobotSE mtf = new RobotSE(kw, 2, 2, Direction.SOUTH);
        
        // walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);

        //move if the front is clear, if not turn and move
        while (mtf.frontIsClear()) {
            mtf.move();
            while (!mtf.frontIsClear()) {
                mtf.turnLeft();
                mtf.move();
                mtf.turnRight();
                if (!mtf.frontIsClear()) {
                    mtf.turnLeft();
                }
            }
        }
    }
}
