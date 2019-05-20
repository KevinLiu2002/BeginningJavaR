import java.io.*;
import java.util.*;
public class testquestionone {
    public static void questionA() throws IOException {
        File fileinput = new File("/Users/kevinliu/IdeaProjects/Diamond/src/names.txt");
        Scanner input = new Scanner(fileinput);
        String name;

        Scanner nameScanner = new Scanner(System.in);
        System.out.println("Enter a name ");
        name = nameScanner.nextLine();

        while (input.hasNextLine()) {
            String lines = input.nextLine();
            Scanner line = new Scanner(lines);

            while (line.hasNext()) {

                String word = line.next();

                if (word.equals(name)) {
                    System.out.println(lines);
                } else break;

            }
        }
    }

    public static void questionB() throws IOException {
        File fileinput = new File("/Users/kevinliu/IdeaProjects/Diamond/src/names.txt");
        Scanner input = new Scanner(fileinput);

        while (input.hasNextLine()) {
            String lines = input.nextLine();
            Scanner line = new Scanner(lines);

            String name = line.next();
            float total = 0;
            int count = 0;

            while (line.hasNextInt()) {
                total = total + line.nextInt();
                count++;
            }
            System.out.println(name + "\t\t" + (int)(total / count + 0.5) + " babies/year");
        }
    }

    public static void questionD() throws IOException {
        File fileinput = new File("/Users/kevinliu/IdeaProjects/Diamond/src/names.txt");
        Scanner input = new Scanner(fileinput);
        String mostpopularname = "";
        int count = 0;

        while (input.hasNextLine()) {
            String lines = input.nextLine();
            Scanner line = new Scanner(lines);

            String name = line.next();
            if (mostpopularname.equals(""))
            {
                mostpopularname = name;
            }
            line.nextInt();
            line.nextInt();
            line.nextInt();
            line.nextInt();
            int value = line.nextInt();
            if (count < value)
            {
                mostpopularname = name;
                count = value;
            }
        }
        System.out.println("The most popular name during 1940 was " + mostpopularname);
    }

    public static void questionE() throws IOException {
        File fileinput = new File("/Users/kevinliu/IdeaProjects/Diamond/src/names.txt");
        Scanner input = new Scanner(fileinput);

        while (input.hasNextLine()) {
            String lines = input.nextLine();
            Scanner line = new Scanner(lines);
            String name = line.next();

            int value = line.nextInt();
            if (value == 58)
            {
                System.out.println("The name that had 58 babies in 1900 was " + name);
            }

        }
    }

    public static void main(String[] args) throws IOException {
        questionA();
        questionB();
        questionD();
        questionE();
    }
}