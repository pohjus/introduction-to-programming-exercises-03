import static java.lang.System.out;


/**
 * Exercises 16.
 * <p>
 * Toteuta nyt sovellus joka kysyy käyttäjältä nimen.
 * <pre>
 * anna nimi:
 * seppo
 * </pre>
 * Tämän jälkeen ohjelma tulostaa annetun nimen siten että sen
 * kirjaimet ovat satunnaisesti sekoitetut, esim:
 * <pre>
 * oepps
 * </pre>
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
        // Prompt the user for a string
        System.out.print("Enter a string: ");
        String input = System.console().readLine();

        // Initialize an empty string to hold the shuffled characters
        String shuffled = "";

        // Continue until all characters from the input are moved to the
        // shuffled string
        while (input.length() > 0) {
            // Randomly select an index from the remaining characters in input
            int index = (int) (Math.random() * input.length());
            // Get the character at the randomly selected index
            char ch = input.charAt(index);
            // Append the selected character to the shuffled string
            shuffled += ch;

            // Initialize an empty string to rebuild the remaining input
            String temp = "";
            // Loop through all characters in the input string
            for (int i = 0; i < input.length(); i++) {
                // Skip the character at the randomly selected index
                if (i != index) {
                    // Append all other characters to the new input string
                    temp += input.charAt(i);
                }
            }
            // Update the input string to the remaining characters
            input = temp;
        }

        // Print the shuffled string
        out.println("Shuffled string: " + shuffled);
    }
}
