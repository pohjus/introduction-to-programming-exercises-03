
import static java.lang.System.out;

/**
 * Exercises 11.
 * <p>
 * Toteuta laskin sovellus. Ohjelma kysyy kaksi kokonaisluku ja operaattorin.
 * Ohjelma tulostaa laskutoimituksen tuloksen.
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
        out.print("Give Number 1: ");
        int number1 = Integer.parseInt(System.console().readLine());
        out.print("Give operator (+, -, /, x): ");
        char operator = System.console().readLine().charAt(0);
        out.print("Give Number 2: ");
        int number2 = Integer.parseInt(System.console().readLine());

        if (number2 == 0 && operator == '/') {
            out.println("do not divide with zero");
            return; // end the app.
        }

        double result = 0.0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case 'x':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                out.println("wrong operator");
                return; // end the app.
        }

        out.println(result);
    }
}
