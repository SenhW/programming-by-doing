/** Modulus Animation
 * http://programmingbydoing.com/a/modulus-animation.html
 * In this program, you'll use a loop to draw a simple ASCII-based animation on the screen, and you will use modulus (%)
 * to determine which frame of the animation to show. (You will learn how to create your own loops later.)
 * Add several if statements in ModulusAnimation.java so that it draws a little animation of your choosing. You must
 * have a minimum of eight (8) different frames of animation, and it must loop smoothly.
 */

public class ModulusAnimation {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 80; i++) {
            if (i % 10 == 0)
                System.out.print(" O          \r");
            else if (i % 10 == 1)
                System.out.print(" OO         \r");
            else if (i % 10 == 2)
                System.out.print(" OOO        \r");
            else if (i % 10 == 3)
                System.out.print(" OOOO       \r");
            else if (i % 10 == 4)
                System.out.print(" OOOOO      \r");
            else if (i % 10 == 5)
                System.out.print(" OOOOOO     \r");
            else if (i % 10 == 6)
                System.out.print(" OOOOOOO    \r");
            else if (i % 10 == 7)
                System.out.print(" OOOOOOOO   \r");
            else if (i % 10 == 8)
                System.out.print(" OOOOOOOOO  \r");
            else if (i % 10 == 9)
                System.out.print(" OOOOOOOOOO \r");

            Thread.sleep(200);
        }

    }
}