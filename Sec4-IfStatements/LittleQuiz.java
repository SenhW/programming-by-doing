/**
 * A Little Quiz
 * http://programmingbydoing.com/a/a-little-quiz.html
 * Write an interactive quiz. It should ask the user three multiple-choice or true/false questions about something. It
 * must keep track of how many they get wrong, and print out a "score" at the end.
 */

import java.util.Scanner;

public class LittleQuiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int answer1, answer2, answer3, score = 0;
        System.out.print("Are you ready for a quiz? ");
        keyboard.next();
        System.out.println("Okay, here it comes!");
        System.out.println();
        System.out.println("Q1) What is the capital of Alaska?");
        System.out.println("\t1) Melbourne");
        System.out.println("\t2) Anchorage");
        System.out.println("\t3) Juneau");
        System.out.println();
        System.out.print("> ");
        answer1 = keyboard.nextInt();
        System.out.println();
        if (answer1 == 3) {
            System.out.println("That's right!");
            score++;
        } else {
            System.out.println("Sorry, Juneau is the capital of Alaska.");
        }
        System.out.println();
        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
        System.out.println("\t1) yes");
        System.out.println("\t2) no");
        System.out.println();
        System.out.print("> ");
        answer2 = keyboard.nextInt();
        System.out.println();
        if (answer2 == 2) {
            System.out.println("That's right!");
            score++;
        } else {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
        }
        System.out.println();
        System.out.println("Q3) What is the result of 9+6/3?");
        System.out.println("\t1) 5");
        System.out.println("\t2) 11");
        System.out.println("\t3) 15/3");
        System.out.println();
        System.out.print("> ");
        answer3 = keyboard.nextInt();
        System.out.println();
        if (answer3 == 2) {
            System.out.println("That's correct!");
            score++;
        } else {
            System.out.println("Sorry, 11 is the result.");
        }
        System.out.println();
        System.out.println("Overall, you got " + score + " out of 3 correct.");
        System.out.println("Thanks for playing!");
    }
}