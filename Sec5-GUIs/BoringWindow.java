/**
 * Boring Window
 * http://programmingbydoing.com/a/boring-window.html
 * Type in the following code, and get it to compile. Run it, and see what it does.
 */

import javax.swing.*;

public class BoringWindow extends JFrame {

    public static void main(String[] args) {
        //Initialize JFrame object
        JFrame f = new BoringWindow();
        // Set frame to close
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Size of window
        f.setSize(300, 200);
        // Shows window
        f.setVisible(true);
    }
}