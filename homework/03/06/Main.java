
import static java.lang.System.out;

/**
 * Exercises 06.
 * <p>
 * Mitä tapahtuu kun “lasket yhteen” seuraavat. Miksi? Kokeile ja perustele.
 * <p>
 * 1 + 2
 * "merkkijono1" + "merkkijono2"
 * "merkkijono1" + 2
 * "merkkijono1" + 3.3
 * 3.3 + "merkkijono" + 3.3
 * 2 + "merkkijono2"
 * "merkkijono1" + 'a'
 * 'a' + 'b'
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
        // NOTE: using "Magic numbers" intentionally because of the
        // exercise given.

        // calculates 1 + 2 => 3
        out.println(1 + 2);

        // Appends strings together
        out.println("merkkijono1" + "merkkijono2");

        // Creates one string from a string and an int
        out.println("merkkijono1" + 2);

        // Creates one string from a string and an double
        out.println("merkkijono1" + 3.3);

        // Creates one string from a double, string and double
        out.println(3.3 + "merkkijono" + 3.3);

        // Creates one string from an int and string
        out.println(2 + "merkkijono2");

        // Creates one string from an int and a char
        out.println("merkkijono1" + 'a');

        // calculates 97 + 97 => 194, uses character encoding numbers.
        out.println('a' + 'b');

    }
}
