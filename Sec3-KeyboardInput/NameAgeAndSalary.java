/**
 * Name, Age, and Salary
 * http://programmingbydoing.com/a/name-age-and-salary.html
 * Ask the user for their name. Then display their name to prove that you can recall it. Ask them for their age. Then
 * display that. Finally, ask them for how much they make and display that. You should use the most appropriate data
 * type for each variable.
 */

import java.util.Scanner;

public class NameAgeAndSalary {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        double salary;
        System.out.println("Hello. What is your name?");
        name = keyboard.next();
        System.out.println();
        System.out.println("Hi, " + name + "! How old are you?");
        age = keyboard.nextInt();
        System.out.println();
        System.out.println("So you're " + age + ", eh? That's not old at all!");
        System.out.println("How much do you make, " + name + "?");
        salary = keyboard.nextDouble();
        System.out.println();
        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
    }
}
