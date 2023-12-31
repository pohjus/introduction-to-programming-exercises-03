
import static java.lang.System.out;

/**
 * Exercises 14.
 * <p>
 * Toteuta sovellus jossa kysyt käyttäjältä salasanan.
 * <p>
 * Tarkista, että salasana on vähintään 8 merkkiä pitkä, sisältää ainakin
 * yhden numeron, yhden ison kirjaimen ja yhden pienen kirjaimen. Jos
 * salasana on kelvollinen, tulosta "Salasana hyväksytty", muuten tulosta syy
 * miksi ei hyväksytty.
 *
 * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * Minimum required length for the password.
     */
    static final int PASSWORD_LENGTH = 8;

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments. Not used in this application.
     */
    public static void main(final String[] args) {

        out.print("Give pw: ");

        // Returns an array full of characters
        char[] characters = System.console().readPassword();

        boolean isLengthOk = characters.length >= PASSWORD_LENGTH;
        boolean isLowerCaseOk = false;
        boolean isUpperCaseOk = false;
        boolean isDigitOk = false;

        for (int i = 0; i < characters.length; i++) {
            if (Character.isLowerCase(characters[i])) {
                isLowerCaseOk = true;
            }
            if (Character.isUpperCase(characters[i])) {
                isUpperCaseOk = true;
            }
            if (Character.isDigit(characters[i])) {
                isDigitOk = true;
            }

            // If all conditions are already ok, let's exit the loop.
            if (isLowerCaseOk && isUpperCaseOk && isDigitOk) {
                break;
            }
        }

        if (isDigitOk && isLowerCaseOk && isLengthOk && isUpperCaseOk) {
            out.println("Password ok.");
            return;
        }

        String errorMsg = "Problems with pw:\n";

        errorMsg += (!isLengthOk) ? "   Must be " + PASSWORD_LENGTH
                                                  + " or more chars.\n"
                                  : "";
        errorMsg += (!isLowerCaseOk) ? "   Must have lower case.\n" : "";
        errorMsg += (!isUpperCaseOk) ? "   Must have upper case.\n" : "";
        errorMsg += (!isDigitOk) ? "   Must have digit.\n" : "";

        out.println(errorMsg);
    }
}
