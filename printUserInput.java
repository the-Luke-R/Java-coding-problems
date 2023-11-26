// HackerRank coding problem
// PREMISE: write a code that can print a string a double and a int

import java.util.Scanner;

public class printUserInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();

        scan.nextLine();

        String s = scan.nextLine();
        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

/* Once again Java surprises me, when we use scanner we have to be aware that when we type our input
 * we press ENTER, this creates a newline character at the end of our input (something that we don't
 * have to worry about in Python) this can cause errors in our code. So to avoid this we use scan.nextLine
 * to "consume" the newline character so that we can deal with other types of data. How amusing.
*/