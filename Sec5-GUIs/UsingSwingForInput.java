/**
 * Using Swing for Input
 * http://programmingbydoing.com/a/using-swing-for-input.html
 * Type in the following code, and get it to compile. Run it, and see what it does.
 */

import javax.swing.*;

public class UsingSwingForInput {

    public static void main(String[] args) {
        // Open an input window to ask for name
        String name = JOptionPane.showInputDialog("What is your name?");

        // Open an input window to ask for age, convert input string to integer
        String input = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(input);

        // Print out results
        System.out.print("Hello, " + name + ". ");
        System.out.println("Next year, you'll be " + (age + 1));

        // Terminate program
        System.exit(0);
    }
}