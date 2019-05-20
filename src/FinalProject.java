// Kevin Liu
// Program a text based hangman game

import java.util.*;
import java.io.*;
public class FinalProject {
    private static String[] wordbank = {"hello", "cupcake", "sugar", "java", "pizza", "notebook", "winner", "chicken", "dinner", "coffee", "jazz", "bird", "elephant","imagine","dragons", "snake", "worm", "backpack","world", "chocolate", "vanilla", "flower", "water", "bottle"  };
    private static String word = wordbank[(int) (Math.random() * wordbank.length)];
    // chooses a word from the word bank
    private static String stars = new String(new char[word.length()]).replace("\0", "*");
    // replaces each character in the word into an asterisk
    private static int counter = 0;

    public static void hangman(String guess) {
        String anotherstar = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                anotherstar = anotherstar + guess.charAt(0);
            } else if (stars.charAt(i) != '*') {
                anotherstar = anotherstar + word.charAt(i);
            } else {
                anotherstar = anotherstar +"*";
            }
        }
// reveals a letter if the guess is correct
        if (stars.equals(anotherstar)) {
            counter++;
            hangmangame();
        } else {
            stars = anotherstar;
        }
        if (stars.equals(word)) {
            System.out.println("Congratulations! You're a winner!");
        }
    }
    // gauges the number of characters in the word and replaces each one with an asterisk
    // the game starts when each character is replaced by an asterisk
    // if a letter is not revealed you lose a guess
    public static void hangmangame() {
        if (counter == 1) {
            System.out.println("Wrong guess, please try again. You have 5 guesses left.");

        }
        if (counter == 2) {
            System.out.println("Wrong guess, please try again. You have 4 guesses left.");

        }
        if (counter == 3) {
            System.out.println("Wrong guess, please try again. You have 3 guesses left.");

        }
        if (counter == 4) {
            System.out.println("Wrong guess, please try again. You have 2 guesses left");

        }
        if (counter == 5) {
            System.out.println("Wrong guess, please try again. You have 1 guess left.");

        }

        if (counter == 6) {
            System.out.println("Oh no! You lost!");
            System.out.println("The word was " + word);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> InputLetter = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        Scanner f = new Scanner(new File("/Users/kevinliu/IdeaProjects/Diamond/src/input"));
        Scanner numofLines = new Scanner(new File("/Users/kevinliu/IdeaProjects/Diamond/src/input"));
        Random rand = new Random();
        int lines = 0;
        while(numofLines.hasNextLine()) //Reads how many lines in the file
        {
            lines++;
            numofLines.nextLine();
        }
        int n = rand.nextInt(lines) + 1;
        String word = "";
        for (int i = n; i > 0; i--) {
            word = f.nextLine();
        }
        int wordLength = word.length();
        while (counter < 6 && stars.contains("*")) {
            System.out.println("Guess a letter in the word");
            System.out.println(stars);
            String guess = sc.next();
            hangman(guess);
        }
        // enters a guess into the game
        // exits the loop after you do 6 attempts
    }
}

