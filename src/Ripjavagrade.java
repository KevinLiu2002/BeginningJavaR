//Write a program that asks for a prcie and outputs the total price and the number of items
//Kevin Liu
import java.util.Scanner;

public class Ripjavagrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total=0;
        int items= 0;
        String answer;
        System.out.println("Do you have any items to scan? Yes or No");
        answer = input.next();
        double price=0;
        do {System.out.print("price of item--->");
        price = input.nextDouble();
        total = total + price;
        items++;
        System.out.println("Do you have another item to scan? Yes or No");
        answer= input.next();}
        while (answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("y"));
        System.out.println("You purchased "+items+" items and the total is $" +total);
    }

}
