
import static java.lang.System.out;

/**
 * Exercises 07.
 * <p>
 * Toteuta sovellus, joka kysyy käyttäjältä nimiä.
 * Nimien kysyminen lopetaan kun käyttäjä antaa merkkijonon lopeta.
 * Ohjelma tulostaa jokaisella kierroksella kaikki siihen mennessä
 * annetut nimet yhdellä rivillä
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
        String result = "";
        String name = "";

        boolean continueLoop = true;

        do {
            out.println("give name (write \"stop\" to end the program.)");
            name = System.console().readLine();

            // true if stop not given
            continueLoop = !name.equalsIgnoreCase("stop");

            // if continueloop is true, add name to the string,
            // otherwise add "" to the string
            result += continueLoop ? name : "";
            out.println(result);

        } while (continueLoop);
    }
}
