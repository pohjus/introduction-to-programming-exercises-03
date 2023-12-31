
import static java.lang.System.out;

/**
 * Exercises 08.
 * <p>
 * Toteuta sovellus, joka kysyy käyttäjältä merkkijonon.
 * Sovellus ilmoittaa oliko merkkijono palindromisana vai ei.
 *
 * @author Jussi Pohjolainen
 */
public class Main {
    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments. Not used in this application.
     */
    public static void main(final String[] args) {
        out.println("PALINDROME CHECKER");
        out.print("Give word, I will check if it is a palindrome: ");
        String word = System.console().readLine();

        boolean isPalindrome = true;

        // Let's use a faster way of checking palindrome
        // (compared to reverse)

        for (int i = 0; i < word.length(); i++) {

            // saippuakauppxas
            // ^             ^
            // => if these are the same, let's leave isPalindrome to true

            // saippuakauppxas
            //  ^           ^
            //  => if these are the same, let's leave isPalindrome to true

            // saippuakauppxas
            //   ^         ^
            //   => isPalindrome is now set to false and with break we will
            //      end the loop

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break; // ends the for loop
            }
        }

        out.println(isPalindrome ? "It's palindrome!"
                                 : "It's not a palindrome");
    }
}
