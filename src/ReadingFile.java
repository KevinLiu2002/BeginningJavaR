
import java.io.*;
import java.util.*;
public class ReadingFile {
    public static void main(String[] args) throws IOException {
        File fileinput = new File("/Users/kevinliu/IdeaProjects/Diamond/src/input");
        Scanner input = new Scanner(fileinput);
        int count = 0;
        while (input.hasNextLine())
        {
            String lines = input.nextLine();
            Scanner line = new Scanner(lines);
            System.out.println(lines);
            while (line.hasNext()) {

                if (line.hasNextInt()) {
                    int word = line.nextInt();
                    count++;
                } else {
                    String word = line.next();
                }

                }
                System.out.println("There are " + count + "numbers");
            }
        }

    }

