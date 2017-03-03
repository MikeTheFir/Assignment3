
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // city and robot
        City kw = new City();
        Robot mtf = new Robot(kw, 1, 1, Direction.EAST);

        //show amount of things
        kw.showThingCounts(true);

        // things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        // pick thing up, move, drop thing, move, pick up repeat and then stop
        while (mtf.canPickThing()) {
            mtf.pickThing();
            mtf.move();
            mtf.putThing();
            mtf.turnLeft();
            mtf.turnLeft();
            mtf.move();
            mtf.turnLeft();
            mtf.turnLeft();
        }
        mtf.move();
    }
}
