/** Modulus Animation (Example #2)
 * http://programmingbydoing.com/a/modulus-animation.html
 * In this program, you'll use a loop to draw a simple ASCII-based animation on the screen, and you will use modulus (%)
 * to determine which frame of the animation to show. (You will learn how to create your own loops later.)
 * Add several if statements in ModulusAnimation.java so that it draws a little animation of your choosing. You must
 * have a minimum of eight (8) different frames of animation, and it must loop smoothly.
 */

public class ModulusAnimationSymbols {
    public static void main(String[] args) throws Exception {
        int repeats = 5;
        int steps_per_second = 10;

        for (int i = 0; i < repeats * 11; i++) {
            if (i % 11 == 0)
                System.out.print(" .oOo..... \r");
            else if (i % 11 == 1)
                System.out.print(" ..oOo.... \r");
            else if (i % 11 == 2)
                System.out.print(" ...oOo... \r");
            else if (i % 11 == 3)
                System.out.print(" ....oOo.. \r");
            else if (i % 11 == 4)
                System.out.print(" .....oOo. \r");
            else if (i % 11 == 5)
                System.out.print(" ......oOo \r");
            else if (i % 11 == 6)
                System.out.print(" .......oO \r");
            else if (i % 11 == 7)
                System.out.print(" o.......o \r");
            else if (i % 11 == 8)
                System.out.print(" Oo....... \r");
            else if (i % 11 == 9)
                System.out.print(" oOo...... \r");
            else if (i % 11 == 10)
                System.out.print(" .oOo..... \r");

            Thread.sleep(1000 / steps_per_second);
        }

    }
}