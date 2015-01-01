/**
 * BMI Categories
 * http://programmingbydoing.com/a/bmi-categories.html
 * The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in
 * populations. It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of
 * their height in meters.
 * Start with the BMI Calculator you wrote previously (BMICalc.java). Then use some if statements to show the category
 * for a given BMI.
 * BMI	            category
 * less than 18.5	underweight
 * 18.5 to 24.9	    normal weight
 * 25.0 to 29.9	    overweight
 * 30.0 or more	    obese
 * Note: Although BMI is a very good estimate of human body fat, the formula doesn't work well for athletes with a lot
 * of muscle, or people who are extremely short or very tall. If you are concerned about your BMI, check with your
 * doctor.
 */

import java.util.Scanner;

public class BMICategories {

    public static void main(String[] args) {
        BMICalc();
        BMICalcBonus1();
        BMICalcBonus1FeetInches();
    }

    public static String BMICategory(double BMI) {
        if (BMI < 18.5) {
            return "underweight";
        }
        if (BMI >= 18.5 && BMI <= 24.9) {
            return "normal weight";
        }
        if (BMI >= 25.0 && BMI <= 29.9) {
            return "overweight";
        }
        if (BMI >= 30.0) {
            return "obese";
        }
        return null; // Should not reach there
    }

    /**
     * For +10 bonus points, use more if statements to show the ALL the BMI categories.
     * BMI	            category
     * less than 15.0	very severely underweight
     * 15.0 to 16.0	    severely underweight
     * 16.1 to 18.4	    underweight
     * 18.5 to 24.9	    normal weight
     * 25.0 to 29.9	    overweight
     * 30.0 to 34.9	    moderately obese
     * 35.0 to 39.9	    severely obese
     * 40.0 and up	    very severely (or "morbidly") obese
     */
    public static String BMIMoreCategories(double BMI) {
        if (BMI < 15.0) {
            return "very severely underweight";
        }
        if (BMI >= 15.0 && BMI <= 16.0) {
            return "severely underweight";
        }
        if (BMI >= 16.1 && BMI <= 18.4) {
            return "underweight";
        }
        if (BMI >= 18.5 && BMI <= 24.9) {
            return "normal weight";
        }
        if (BMI >= 25.0 && BMI <= 29.9) {
            return "overweight";
        }
        if (BMI >= 30.0 && BMI <= 34.9) {
            return "moderately obese";
        }
        if (BMI >= 35.0 && BMI <= 39.9) {
            return "severely obese";
        }
        if (BMI >= 40.0) {
            return "very severely (or \"morbidly\") obese";
        }
        return null; // Should not reach there
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
        System.out.println("BMI Category: " + BMICategory(BMI));
        System.out.println("BMI More Category: " + BMIMoreCategories(BMI));
    }

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
        System.out.println("BMI Category: " + BMICategory(BMI));
        System.out.println("BMI More Category: " + BMIMoreCategories(BMI));
    }

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
        System.out.println("BMI Category: " + BMICategory(BMI));
        System.out.println("BMI More Category: " + BMIMoreCategories(BMI));
    }
}