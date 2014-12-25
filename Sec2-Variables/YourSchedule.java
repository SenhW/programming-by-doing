/**
 * Your Schedule
 * http://programmingbydoing.com/a/your-schedule.html
 * Use several variables to store the names of your classes and their teachers. Then, display a nice little table
 * displaying your schedule. Just FYI, my column of courses has a width of 26 characters, and the teacher column has
 * a width of 15. The first and last lines are a plus sign, fifty dashes (a.k.a. minus signs) and another plus sign.
 * Your table doesn't need to look exactly like this, or even line up. I used a total of sixteen variables (course1,
 * course2, ... course8, teacher1, teacher2, etc.). You should do the same.
 */

public class YourSchedule {

    public static void main(String[] args) {
        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Information Systems";
        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";
        System.out.println("+------------------------------------------------------------+");
        System.out.println("| 1 |                          " + course1 + " |       " + teacher1 + " |");
        System.out.println("| 2 |                          " + course2 + " |     " + teacher2 + " |");
        System.out.println("| 3 |                         " + course3 + " |       " + teacher3 + " |");
        System.out.println("| 4 |                        " + course4 + " |      " + teacher4 + " |");
        System.out.println("| 5 |           " + course5 + " |      " + teacher5 + " |");
        System.out.println("| 6 |                             " + course6 + " |    " + teacher6 + " |");
        System.out.println("| 7 |                        " + course7 + " | " + teacher7 + " |");
        System.out.println("| 8 |" + course8 + " |       " + teacher8 + " |");
        System.out.println("+------------------------------------------------------------+");
    }
}
