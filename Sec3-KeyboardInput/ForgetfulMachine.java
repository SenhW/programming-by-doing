/**
 * The Forgetful Machine
 * http://programmingbydoing.com/a/the-forgetful-machine.html
 * Ask the user for two words and two numbers, and let the person at the keyboard type in some values, but don't bother
 * storing their responses into any variables.
 * Again, there is no need to create any variables, except for the Scanner variable typically named keyboard.
 */

import java.util.Scanner;

public class ForgetfulMachine {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Give me a word!");
        keyboard.next();
        System.out.println("Give me a second word!");
        keyboard.next();
        System.out.println();
        System.out.println("Great, now your favorite number?");
        keyboard.nextInt();
        System.out.println("And your second-favorite number...");
        keyboard.nextInt();
        System.out.println();
        System.out.println("Whew! Wasn't that fun?");
    }
}