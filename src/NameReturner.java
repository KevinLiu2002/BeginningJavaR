import java.util.*;
public class NameReturner {
    public static void main(String[] args) {
        String name;
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Your name is "+name);
    }
}
