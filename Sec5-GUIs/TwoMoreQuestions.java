/**
 * Two More Questions
 * http://programmingbydoing.com/a/two-more-questions.html
 * Using if statements with compound conditions (like &&), make a guessing game of two questions similar to the Twenty
 * Questions assignment.
 * However, this time you must accomplish it using if statements with compound conditions and you must not use else if
 * or else or nested ifs.
 * - Question 1: Does it belong inside or outside or both?
 * - Question 2: Is it alive?
 * Again, here are some sample responses, for the non-creative among you.
 * 	            inside	        outside	    both
 * alive	    houseplant	    bison	    dog
 * not alive	shower curtain	billboard	cell phone
 */

import java.util.Scanner;

public class TwoMoreQuestions {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String insideOutside, alive;
        System.out.println("TWO MORE QUESTIONS, BABY!");
        System.out.println();
        System.out.println("Think of something and I'll try to guess it!");
        System.out.println();
        System.out.print("Question 1) Does it stay inside or outside or both? ");
        insideOutside = keyboard.next();
        System.out.print("Question 2) Is it a living thing? ");
        alive = keyboard.next();
        System.out.println();
        if(insideOutside.equalsIgnoreCase("inside") && alive.equalsIgnoreCase("yes")) {
            System.out.println("You must be thinking of a houseplant, right?");
        }
        if(insideOutside.equalsIgnoreCase("inside") && alive.equalsIgnoreCase("no")) {
            System.out.println("Tell me that you are thinking of a shower curtain. Don't lie.");
        }
        if(insideOutside.equalsIgnoreCase("outside") && alive.equalsIgnoreCase("yes")) {
            System.out.println("Then what else could you be thinking of besides a bison?!?");
        }
        if (insideOutside.equalsIgnoreCase("outside") && alive.equalsIgnoreCase("no")) {
            System.out.println("I believe you have a billboard on your mind.");
        }
        if(insideOutside.equalsIgnoreCase("both") && alive.equalsIgnoreCase("yes")) {
            System.out.println("I am certain the thing you have on your mind is a dog.");
        }
        if(insideOutside.equalsIgnoreCase("both") && alive.equalsIgnoreCase("no")) {
            System.out.println("Obviously the nonliving, inside/outside thing on your mind is a cell phone!");
        }
    }
}