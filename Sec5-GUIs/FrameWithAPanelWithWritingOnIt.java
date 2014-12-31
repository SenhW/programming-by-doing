import javax.swing.*;
import java.awt.*;

public class FrameWithAPanelWithWritingOnIt {

    public static void main(String[] args) {
        // Initialize Frame613 object which inherits JFrame
        Frame613 f = new Frame613();
        // Set frame to close
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Shows window
        f.setVisible(true);
    }
}

class Frame613 extends JFrame {
    // Default constructor
    public Frame613() {
        // Set title name
        setTitle("613 rocks!");
        // Set the size of the window
        setSize(300, 200);
        // Set a component to that location
        setLocation(100, 200);

        // Initialize Panel613 object
        Panel613 panel = new Panel613();
        // Initialize an Abstract Window Toolkit component
        Container cp = getContentPane();
        // Add a panel component to container
        cp.add(panel);
    }
}

class Panel613 extends JPanel {
    // Override paintComponent to draw "Hi" on screen
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hi", 75, 100);
    }
}