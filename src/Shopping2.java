import java.io.IOException;
import java.util.*;
import java.io.File;

public class Shopping2 {
    public static void main(String[] args) throws IOException {
        File fileinput = new File("/Users/kevinliu/IdeaProjects/Diamond/src/Shopping");
        Scanner input = new Scanner(fileinput);

        while (input.hasNextLine())
        {
            String line = input.nextLine();
            Scanner lineBreaker = new Scanner(line);
            String product = lineBreaker.next();
            double total = 0;
            int count = 0;
            while (lineBreaker.hasNextDouble())
            {
                total = total + lineBreaker.nextDouble();
                count++;
            }
            System.out.printf("The average price of %s is %.2f \n",product, total/count);
        }
    }
}