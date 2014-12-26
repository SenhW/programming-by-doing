/**
 * How Old Are You?
 * http://programmingbydoing.com/a/how-old-are-you.html
 * Make a program which displays a different message depending on the age given. Here are the possible responses:
 * - age is less than 16, say "You can't drive."
 * - age is less than 18, say "You can't vote."
 * - age is less than 25, say "You can't rent a car."
 * - age is 25 or over, say "You can do anything that's legal."
 */

import java.util.Scanner;

public class HowOldAreYou {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Hey, what's your name? ");
        name = keyboard.next();
        System.out.println();
        System.out.print("Ok, " + name + ", how old are you? ");
        age = keyboard.nextInt();
        System.out.println();
        if (age < 16) {
            System.out.println("You can't drive, " + name + ".");
        }
        if (age < 18) {
            System.out.println("You can't vote, " + name + ".");
        }
        if (age < 25) {
            System.out.println("You can't rent a car, " + name + ".");
        }
        if (age >= 25) {
            System.out.println("You can do anything that's legal, " + name + ".");
        }
    }
}