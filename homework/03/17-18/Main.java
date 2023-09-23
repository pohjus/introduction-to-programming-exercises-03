import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


/**
 * Exercises 17 - 18: Hangman game.
 *
 * @author Jussi Pohjolainen
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // Attempt to read lines from the words.txt file
        List<String> words = Files.readAllLines(Path.of("words.txt"));

        // Generate a random index based on the size of the word list
        int index = (int) (Math.random() * words.size());
        // Select a random word based on the generated index
        String selectedWord = words.get(index);

        // Initialize a string with '-' characters to represent the guessed word
        String guessedWord = "";
        for (int i = 0; i < selectedWord.length(); i++) {
            guessedWord += "-";
        }

        // Boolean flag to keep track of game status
        boolean gameActive = true;

        // Game loop
        while (gameActive) {
            // Prompt the user to guess the word
            System.out.println("Guess Word");
            System.out.println(guessedWord);

            // Read a line from the console
            String input = System.console().readLine();

            // Initialize guessed character
            char guess = ' ';

            // Validate if input length is exactly 1 character
            if (input.length() == 1) {
                guess = input.charAt(0);
            }

            // Initialize a new guessed word string
            String newGuessedWord = "";

            // Loop through each character in the selected word
            for (int i = 0; i < selectedWord.length(); i++) {
                char currentChar = selectedWord.charAt(i);

                // If the guessed character matches the current character, update the new guessed word
                if (currentChar == guess) {
                    newGuessedWord += guess;
                } else {
                    newGuessedWord += guessedWord.charAt(i) != '-' ? guessedWord.charAt(i) : '-';
                }
            }

            // Update the guessed word
            guessedWord = newGuessedWord;

            // Check if the entire word has been guessed correctly
            if (guessedWord.equals(selectedWord)) {
                System.out.println("Correct!");
                gameActive = false;  // End the game
            }
        }
    }
}