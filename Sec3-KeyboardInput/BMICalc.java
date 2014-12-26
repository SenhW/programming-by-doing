/**
 * BMI Calculator
 * http://programmingbydoing.com/a/bmi-calculator.html
 * The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in
 * populations.
 * It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height
 * in meters.
 */

import java.util.Scanner;

public class BMICalc {

    public static void main(String[] args) {
        BMICalc();
        BMICalcBonus1();
        BMICalcBonus1FeetInches();
    }

    public static void BMICalc() {
        Scanner keyboard = new Scanner(System.in);
        double height, weight, BMI;
        System.out.print("Your height in m: ");
        height = keyboard.nextDouble();
        System.out.print("Your weight in kg: ");
        weight = keyboard.nextDouble();
        BMI = weight / (height * height);
        System.out.println();
        System.out.println("Your BMI is " + BMI);
    }

    // For +10 bonus points, input their weight and height using pounds and inches, and convert to kilograms and meters
    // to figure the BMI.
    public static void BMICalcBonus1() {
        Scanner keyboard = new Scanner(System.in);
        double height, weight, BMI;
        System.out.print("Your height in inches: ");
        height = keyboard.nextDouble();
        System.out.print("Your weight in pounds: ");
        weight = keyboard.nextDouble();
        BMI = weight * (703 / (height * height));
        System.out.println();
        System.out.println("Your BMI is " + BMI);
    }

    // For an extra +3 bonus points (+13 total), input their height in feet and inches.
    public static void BMICalcBonus1FeetInches() {
        Scanner keyboard = new Scanner(System.in);
        double height, heightFeet, heightInches, weight, BMI;
        System.out.print("Your height (feet only): ");
        heightFeet = keyboard.nextDouble();
        System.out.print("Your height (inches): ");
        heightInches = keyboard.nextDouble();
        System.out.print("Your weight in pounds: ");
        weight = keyboard.nextDouble();
        height = heightFeet * 12 + heightInches;
        BMI = weight * (703 / (height * height));
        System.out.println();
        System.out.println("Your BMI is " + BMI);
    }
}
