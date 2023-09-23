
import static java.lang.System.out;


/**
 * Exercises 12-13.
 * <p>
 * 12: Toteuta Java-sovellus joka tulostaa 5 kertaa satunnaisen luvun
 * väliltä `[0, 1[`.
 *
 * 13: Toteuta nyt sovellus joka tulostaa viisi kpl satunnaisia kokonaislukuja
 * väliltä 0 - 4
 *
 * @author Jussi Pohjolainen
 */
public class Main {

    /**
     * Number of rounds the random numbers will be generated for.
     */
    static final int NUMBER_OF_ROUNDS = 5;

    /**
     * Upper limit for random integers generated in Exercise 13.
     */
    static final int MAX_RANDOM = 5;

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments. Not used in this application.
     */
    public static void main(final String[] args) {

        // Exercise 12: 5 x [0, 1[ (double)
        out.println("EXERCISE 12\n**********");

        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            out.println(Math.random());
        }


        // Exercise 13: 4 x [0, 4] (int)
        out.println("EXERCISE 12\n**********");


        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            out.println((int) (Math.random() * MAX_RANDOM));
        }
    }
}
