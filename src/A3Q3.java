
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // city and robot
        City kw = new City();
        RobotSE mtf = new RobotSE(kw, 0, 0, Direction.EAST);
// walls
        new Wall(kw, 0, 0, Direction.NORTH);
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 0, 3, Direction.EAST);
        new Wall(kw, 0, 3, Direction.NORTH);
        new Wall(kw, 0, 2, Direction.NORTH);
        new Wall(kw, 0, 1, Direction.NORTH);
// things
        new Thing(kw, 2, 0);
        new Thing(kw, 0, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 2, 3);

// move right and pick things up and turn down at wall
        while (mtf.frontIsClear()) {
            mtf.move();
            if (!mtf.frontIsClear() && mtf.getDirection() == Direction.EAST) {
                mtf.turnRight();
                if (mtf.frontIsClear()) {
                    mtf.move();
                }
                mtf.turnRight();
// move left and pick things and turn dwon at wall               
            } else if (!mtf.frontIsClear() && mtf.getDirection() != Direction.SOUTH) {
                mtf.turnLeft();
                if (mtf.frontIsClear()) {
                    mtf.move();
                }
                mtf.turnLeft();
            }
//return to 0, 0 and stop
            if(mtf.countThingsInBackpack() == 6){
                mtf.turnRight();
                mtf.move();
                mtf.move();
                mtf.turnLeft();
                mtf.move();
                mtf.move();
                mtf.turnAround();
                break;
                }
// pick things up
            if (mtf.canPickThing()) {
                mtf.pickThing();
            }

        }



    }
}

