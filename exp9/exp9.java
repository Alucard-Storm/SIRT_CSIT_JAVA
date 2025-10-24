// Write a program to display "Hello World" in web browser using applet

import java.applet.Applet;
import java.awt.Graphics;
public class exp9 extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, World!", 20, 20);
    }
}

// Applet was deprecated in Java 9 and removed in Java 11, so this code is for educational purposes only.