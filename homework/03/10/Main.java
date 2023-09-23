
import static java.lang.System.out;

/**
 * Exercises 10.
 * <p>
 * Toteuta sovellus joka kysyy käyttäjältä kaksi kokonaislukua.
 * Ohjelma tulostaa kaikki luvut käyttäjän antamien lukujen välistä pienimmästä suurimpaan.
 *
 * @author Jussi Pohjolainen
 */
public class Main {
    public static void main(String[] args) {
        out.print("Give Number 1: ");
        int number1 = Integer.parseInt(System.console().readLine());
        out.print("Give Number 2: ");
        int number2 = Integer.parseInt(System.console().readLine());

        // get the min and max using Math.min and Math.max, you can do this also with
        // simple if...
        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);

        for (int i = min; i <= max; i++) {
            out.println(i);
        }
    }
}