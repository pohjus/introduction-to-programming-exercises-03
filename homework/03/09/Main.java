
import static java.lang.System.out;


/**
 * Exercises 09.
 * <p>
 * Muokkaa edeltävää siten, että palindromisanat myös huomioidaan siten
 * että välilyönnit, välimerkit (, .)
 * jätetään pois ja isoilla ja pienillä kirjaimilla ei ole merkitystä
 * (equalsIgnoreCase).
 * Esim virke Nätin äänesi, sen äänitän katsotaan palindromiksi.
 * Älä käytä välilyöntien ja välimerkkien poistamiseen merkkijonon replaceAll
 * toimintoa vaan tee tämä käyttämällä ainoastaan charAt ja +
 * (merkkijonon yhdistäminen) toiminnallisuuksia.
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
        // turns everything to lowercase
        String originalWord = System.console().readLine().toLowerCase();

        String removedChars = "";

        // let's remove chars
        for (int i = 0; i < originalWord.length(); i++) {
            if (originalWord.charAt(i) != ' '
                    && originalWord.charAt(i) != ','
                    && originalWord.charAt(i) != '.') {
                removedChars += originalWord.charAt(i);
            }
        }


        boolean isPalindrome = true;

        for (int i = 0; i < removedChars.length(); i++) {
            if (removedChars.charAt(i)
                    != removedChars.charAt(removedChars.length() - 1 - i)) {
                isPalindrome = false;
                break; // ends the for loop
            }
        }

        out.println(isPalindrome ? "It's palindrome!"
                                 : "It's not a palindrome");
    }
}
