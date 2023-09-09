package fc.java.testmodel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class testimage {

    public static void main(String[] args) throws InterruptedException, AWTException {
        Thread.sleep(1000);
        try {
            BufferedImage image = ImageIO.read(new File("C:\\temp\\aaa0.png"));
            boolean isOnScreen = isOnScreen(image);
            System.out.print(isOnScreen);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isOnScreen(BufferedImage bi) throws AWTException {
        Robot r = new Robot();
        BufferedImage image = null;
        try {
            image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            BufferedImage image2 = new Robot().createScreenCapture(new Rectangle(1500, 890, 1512 - 1500, 905 - 890));
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int x = 0; x< image.getWidth();x++){
            for(int y = 0; y< image.getHeight();y++){

                boolean invalid = false;
                int k = x,l = y;
                for(int a = 0;a<bi.getWidth();a++){
                    l = y;
                    for(int b = 0;b<bi.getHeight();b++){
                        if(bi.getRGB(a, b) != image.getRGB(k, l)){
                            invalid = true;
                            break;
                        }
                        else{
                            l++;
                        }
                    }
                    if(invalid){
                        break;
                    }else{
                        k++;
                    }

                }

                if(!invalid){
                    r.mouseMove(x,y);
                    return true;
                }
            }
        }
        return false; //If no image is found

    }

}