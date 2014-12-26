/**
 * Dumb Calculator
 * http://programmingbydoing.com/a/a-dumb-calculator.html
 * Make a simple numeric calculator. It should prompt the user for three numbers. Then add the numbers together and
 * divide by 2. Display the result. Your program must support numbers with decimals and not just integers.
 */

import java.util.Scanner;

public class DumbCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double firstNumber, secondNumber, thirdNumber, result;
        System.out.print("What is your first number? ");
        firstNumber = keyboard.nextDouble();
        System.out.print("What is your second number? ");
        secondNumber = keyboard.nextDouble();
        System.out.print("What is your third number? ");
        thirdNumber = keyboard.nextDouble();
        System.out.println();
        result = (firstNumber + secondNumber + thirdNumber) / 2;
        System.out.println("( " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " ) / 2 is... " + result);
    }
}