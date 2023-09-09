package fc.java.test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class imagetest {
    public static void main(String[] args) throws IOException {
        File logoFile = new File("C:\\fjava\\hello\\shop.png");

        Image logoBufferImg = ImageIO.read(logoFile);
    }
}
