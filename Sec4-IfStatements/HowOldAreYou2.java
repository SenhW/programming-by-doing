/**
 * How Old Are You, Specifically?
 * http://programmingbydoing.com/a/how-old-are-you-elseif.html
 * Using if statements, else if, and else statements, make a program which displays a different message depending on
 * the age given.
 * - age less than 16, say "You can't drive."
 * - age between 16 to 17, say "You can drive but not vote."
 * - age between 18 to 24, say "You can vote but not rent a car."
 * - age 25 or older, say "You can do pretty much anything."
 * Note that unlike the original "How Old Are You" assignment, this program must only display exactly one message for a
 * given age and not multiple messages.
 * You can make up your own messages if you want, but you must have at least four messages, and you must use else if
 * statements to make sure only one of the messages is printed for any given age.
 */

import java.util.Scanner;

public class HowOldAreYou2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
        name = keyboard.next();
        System.out.print("Ok, " + name + ", how old are you? ");
        age = keyboard.nextInt();
        System.out.println();
        if (age < 16) {
            System.out.println("You can't drive, " + name + ".");
        } else if (age < 18) {
            System.out.println("You can drive but not vote, " + name + ".");
        } else if (age < 25) {
            System.out.println("You can vote but not rent a car, " + name + ".");
        } else if (age >= 25) {
            System.out.println("You can do pretty much anything, " + name + ".");
        }
    }
}