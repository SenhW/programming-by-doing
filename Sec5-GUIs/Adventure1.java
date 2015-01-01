/**
 * Choose Your Own Adventure!
 * http://programmingbydoing.com/a/choose-your-own-short-adventure.html
 * Make a short "Choose Your Own Adventure" game. It should feature two options after the first page, two options for
 * each of the two second-level pages, and two options for each of the four third-level pages, for a total of eight
 * possible destinations.
 */

import java.util.Scanner;

public class Adventure1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstOption, secondOption, thirdOption;
        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
        System.out.println();
        System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the");
        System.out.println("\"kitchen\"?");
        System.out.print("> ");
        firstOption = keyboard.next();
        System.out.println();
        if (firstOption.equalsIgnoreCase("kitchen")) {
            System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side");
            System.out.println("there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"");
            System.out.println("or look in a \"cabinet\".");
            System.out.print("> ");
            secondOption = keyboard.next();
            System.out.println();
            if (secondOption.equalsIgnoreCase("refrigerator")) {
                System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty.");
                System.out.println("Would you like to eat some of the food? (\"yes\" or \"no\")");
                System.out.print("> ");
                thirdOption = keyboard.next();
                System.out.println();
                if (thirdOption.equalsIgnoreCase("yes")) {
                    System.out.println("You eat the food and develop a stomach ache.");
                } else {
                    System.out.println("You die of starvation... eventually.");
                }
            } else {
                System.out.println("You died. You triggered a bomb inside the cabinet.");
            }
        } else {
            System.out.println("Upstairs you see a hallway. At the end of the hallway is the master");
            System.out.println("\"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like");
            System.out.println("to go?");
            System.out.print("> ");
            secondOption = keyboard.next();
            System.out.println();
            if (secondOption.equalsIgnoreCase("bedroom")) {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The");
                System.out.println("bed is unmade. In the back of the room, the closet door is ajar. Would you");
                System.out.println("like to open the door? (\"yes\" or \"no\")");
                System.out.print("> ");
                thirdOption = keyboard.next();
                System.out.println();
                if (thirdOption.equalsIgnoreCase("yes")) {
                    System.out.println("You open the door and see a pot of gold! You instantly become a millionaire! ");
                } else {
                    System.out.println("Well, then I guess you'll never know what was in there. Thanks for playing,");
                    System.out.println("I'm tired of making nested if statements.");
                }
            } else {
                System.out.println("You are inside the bathroom and you see a shower curtain covering a bathtub.");
                System.out.println("Do you want to uncover the shower curtain and check? (\"yes\" or \"no\")");
                System.out.print("> ");
                thirdOption = keyboard.next();
                System.out.println();
                if (thirdOption.equalsIgnoreCase("yes")) {
                    System.out.println("You uncover the shower curtain and take a shower. You win!");
                } else {
                    System.out.println("You try to head back but it's too late! There was someone inside the bathtub");
                    System.out.println("that snuck up on you and shot you with a gun. Sorry, you lose.");
                }
            }
        }
    }
}