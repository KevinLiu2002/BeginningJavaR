

import java.util.*;
import java.io.*;
public class Hangman2 {
    private static ArrayList<String> wordbank = new ArrayList<String>();
    private static String word;
    private static String stars;
    private static int counter = 0;

    public static void hangman(String guess) {
        String anotherstar = "";

        // reveals a letter if the guess is correct
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                anotherstar = anotherstar + guess.charAt(0);
            } else if (stars.charAt(i) != '*') {
                anotherstar = anotherstar + word.charAt(i);
            } else {
                anotherstar = anotherstar +"*";
            }
        }
        //checks to see if the guess is equal to a letter
        // if a letter is not revealed you lose a guess
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

    public static void hangmangame() {
        if (counter == 1) {
            System.out.println("Wrong guess, please try again. You have 6 guesses left.");

        }
        if (counter == 2) {
            System.out.println("Wrong guess, please try again. You have 5 guesses left.");

        }
        if (counter == 3) {
            System.out.println("Wrong guess, please try again. You have 4 guesses left.");

        }
        if (counter == 4) {
            System.out.println("Wrong guess, please try again. You have 3 guesses left");

        }
        if (counter == 5) {
            System.out.println("Wrong guess, please try again. You have 2  guess left.");

        }
        if (counter == 6) {
            System.out.println("Wrong guess, please try again. You have 1 guess left.");

        }
        if (counter == 7) {
            System.out.println("Oh no! You lost!");
            System.out.println("The word was " + word);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {

        //scans the file for a word to choose from
        File fileInput = new File("/Users/kevinliu/IdeaProjects/Diamond/src/input");
        Scanner input = new Scanner(fileInput);

        //replaces the array list the word bank from the file
        while (input.hasNextLine()) {
            String name = input.nextLine();
            wordbank.add(name);
        }
        //chooses a random word from the word bank
        word = wordbank.get((int) (Math.random() * wordbank.size()));

        //replaces each letter with an asterisk
        stars = new String(new char[word.length()]).replace("\0", "*");

        //inputs the letter into the program
        Scanner sc = new Scanner(System.in);

        //If you still have lives left and there are still hidden letter, ask for another guess
        while (counter < 7 && stars.contains("*")) {
            System.out.println("Guess a letter in the word");
            System.out.println(stars);
            String guess = sc.next();
            hangman(guess);
        }

    }
}