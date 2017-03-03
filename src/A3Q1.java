
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // make city and robot
        City kw = new City();
        Robot mtf = new Robot(kw, 2, 1, Direction.EAST);
        Robot mtf1 = new Robot(kw, 3, 1, Direction.EAST);

        // make things
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 6);

        // make walls
        new Wall(kw, 2, 5, Direction.WEST);
        new Wall(kw, 3, 5, Direction.EAST);

        // make robot stop at walls and things
        while (!mtf.canPickThing() && mtf.frontIsClear()) {
            mtf.move();
        }
        while (!mtf1.canPickThing() && mtf1.frontIsClear()) {
            mtf1.move();
        }
    }
}
