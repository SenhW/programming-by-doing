/**
 * Age Messages 3
 * http://programmingbydoing.com/a/age-messages-3.html
 * Using if statements with compound conditions (like &&), make a program that displays a single message depending on
 * the age given.
 * - age less than 16, say "You can't drive."
 * - age between 16 to 17, say "You can drive but not vote."
 * - age between 18 to 24, say "You can vote but not rent a car."
 * - age 25 or older, say "You can do pretty much anything."
 * This output of this assignment is identical to the "How Old Are You, Specifically" assignment. However, this time you
 * must accomplish it using if statements with compound conditions and you must not use else if or else.
 * You can make up your own messages if you want, but you must have at least four messages, and you must use &&
 * statements to make sure only one of the messages is printed for any given age.
 */

import java.util.Scanner;

public class AgeMessages3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Your name: ");
        name = keyboard.next();
        System.out.print("Your age: ");
        age = keyboard.nextInt();
        System.out.println();
        if (age < 16) {
            System.out.println("You can't drive, " + name + ".");
        }
        if (age >= 16 && age <= 17) {
            System.out.println("You can drive but not vote, " + name + ".");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("You can vote but not rent a car, " + name + ".");
        }
        if (age >= 25) {
            System.out.println("You can do pretty much anything, " + name + ".");
        }
    }
}