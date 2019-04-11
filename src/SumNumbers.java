import java.util.Scanner;

public class SumNumbers {
    public static void main(String [] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the lower number");
        int lower = input.nextInt();
        System.out.println("Enter the higher number");
        int higher = input.nextInt();
        int sum = 0;
        for (int i=lower; i<= higher; i++)
        {
            sum+=i;
        }
        System.out.println("The sum is "+sum);
    }
}
