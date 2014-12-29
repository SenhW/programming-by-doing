/** Modulus Animation (Example #1)
 * http://programmingbydoing.com/a/modulus-animation.html
 * In this program, you'll use a loop to draw a simple ASCII-based animation on the screen, and you will use modulus (%)
 * to determine which frame of the animation to show. (You will learn how to create your own loops later.)
 * Add several if statements in ModulusAnimation.java so that it draws a little animation of your choosing. You must
 * have a minimum of eight (8) different frames of animation, and it must loop smoothly.
 */

public class ModulusAnimationWorm {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 80; i++) {
            if (i % 16 == 0)
                System.out.print(" ********                 \r");
            else if (i % 16 == 1)
                System.out.print("   ********               \r");
            else if (i % 16 == 2)
                System.out.print("     ********             \r");
            else if (i % 16 == 3)
                System.out.print("       ********           \r");
            else if (i % 16 == 4)
                System.out.print("         ********         \r");
            else if (i % 16 == 5)
                System.out.print("           ********       \r");
            else if (i % 16 == 6)
                System.out.print("             ********     \r");
            else if (i % 16 == 7)
                System.out.print("               ********   \r");
            else if (i % 16 == 8)
                System.out.print("                 ******** \r");
            else if (i % 16 == 9)
                System.out.print("               ********   \r");
            else if (i % 16 == 10)
                System.out.print("             ********     \r");
            else if (i % 16 == 11)
                System.out.print("           ********       \r");
            else if (i % 16 == 12)
                System.out.print("         ********         \r");
            else if (i % 16 == 13)
                System.out.print("       ********           \r");
            else if (i % 16 == 14)
                System.out.print("     ********             \r");
            else if (i % 16 == 15)
                System.out.print("   ********               \r");

            Thread.sleep(200);
        }

    }
}