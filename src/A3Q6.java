
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // city and robot
        City kw = new City();
        Robot mtf = new Robot(kw, 0, 1, Direction.SOUTH);

        // show amount of things
        kw.showThingCounts(true);

        // things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        //move, pick things up and drop them in lines
        mtf.move();
        while (true) {
            while (mtf.canPickThing() && mtf.getAvenue() == 1) {
                mtf.pickThing();
            }

            mtf.turnLeft();
            while (mtf.countThingsInBackpack() > 0) {
                mtf.putThing();
                mtf.move();

                if (mtf.countThingsInBackpack() == 0 && mtf.getAvenue() > 1) {
                    mtf.turnLeft();
                    mtf.turnLeft();
                    while (mtf.getAvenue() != 1) {
                        mtf.move();
                    }
                }
            }
            // when done stop
            if (mtf.getAvenue() == 1 && !mtf.canPickThing()) {
                break;
            }
        }


    }
}
