package fc.java.testmodel;

import java.awt.*;
import java.awt.event.InputEvent;

public class Coordinate{

    public static void main(String[] args) throws AWTException {
        Robot r = new Robot();
        PointerInfo pt = MouseInfo.getPointerInfo();
        while(true) {
            pt = MouseInfo.getPointerInfo();

            System.out.println(pt.getLocation()); // x,y
            r.delay(1000);
            System.out.println(pt.getLocation().x);// x 좌표
            r.delay(1000);
            System.out.println(pt.getLocation().y); // y 좌표
            r.delay(1000);
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            r.delay(1000);
        }
    }
}