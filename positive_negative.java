import java.util.Scanner;
public class positive_negative {
    public static void main(String[] args)
    {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        number = scan.nextInt();
        scan.close();
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither negative nor positive");
        }
    }
}
