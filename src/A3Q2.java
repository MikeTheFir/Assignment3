
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // city and Robot
        City kw = new City();
        Robot mtf = new Robot(kw, 0, 2, Direction.WEST);

// walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.NORTH);

// go around the circle
        for (int counter = 0; counter < 24; counter++) {
            mtf.turnLeft();
            if (mtf.frontIsClear()) {
                mtf.move();
            } else if (!mtf.frontIsClear()) {
                mtf.turnLeft();
                mtf.turnLeft();
                mtf.turnLeft();
                mtf.move();
            }

        }


    }
}
