package fc.java.test;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class ScreenShot {
    public static void main(String[] args) {
        try {
            int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            Robot robot = new Robot();
            BufferedImage bi=robot.createScreenCapture(new Rectangle(0, 0, width, height));
            ImageIO.write(bi, "gif", new File("C:\\fjava\\hello\\screenshot.gif"));
        } catch (AWTException |IOException e) {
            e.printStackTrace();
        }
    }
}
