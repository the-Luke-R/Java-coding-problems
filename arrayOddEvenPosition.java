// PREMISE: print the string that are in odd/even positions

public class arrayOddEvenPosition {
    public static void main(String[] args) {
        String [] names = new String[] {"Alice", "Bailey", "Carl", "Dylan", "Elija", "Fred"};
        System.out.println("Array elements on odd position: ");
        for (int i = 0; i < names.length; i = i+2) {
            System.out.println(names[i]);
        }
    }
}

/* Let's discuss this code snippet, which serves the purpose of printing elements at odd positions within a sequence. If you wish to print elements at even positions instead, 
simply adjust the 'i' variable within the loop to start at 1 (keeping in mind that indexing starts at 0).

While this code functions correctly when the numbers are in ascending order, we should note that in cases where the numbers are not sorted and you intend to print all odd numbers 
from an array of integers based on their values, you would need to implement a loop that checks 'number % 2 != 0' to identify and print the odd values */
