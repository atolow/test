package fc.java.testmodel;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.InputEvent;

public class IsKeyPressed {
    public static void main(String[] argv) throws Exception {
        JFrame myJFrame = new JFrame();
        Robot r = new Robot();
        PointerInfo pt = MouseInfo.getPointerInfo();

        myJFrame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_UP) {
                    PointerInfo pt = MouseInfo.getPointerInfo();
                    System.out.println(pt.getLocation());
                    System.out.println("Up Arrrow-Key is pressed!");
                }
                else if (keyCode == KeyEvent.VK_DOWN) {
                    PointerInfo pt = MouseInfo.getPointerInfo();
                    System.out.println(pt.getLocation());
                    System.out.println("Down Arrrow-Key is pressed!");
                }
                else if (keyCode == KeyEvent.VK_LEFT) {
                    System.out.println("Left Arrrow-Key is pressed!");
                }
                else if (keyCode == KeyEvent.VK_RIGHT) {
                    System.out.println("Right Arrrow-Key is pressed!");
                }
            }
        });

        myJFrame.setVisible(true);
    }
}