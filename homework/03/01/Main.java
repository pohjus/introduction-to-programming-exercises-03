// Tired of writing System.out.println?
// Use static import!

// System.out.println -> out.println!

import static java.lang.System.out;

/**
 * Exercise 01.
 * <p>
 * Toteuta sovellus, jossa kysyt käyttäjän nimen. Jos nimi on "Jussi",
 * tulosta ruudulle "onpas sinulla tyhmä nimi". Muussa tapauksessa
 * tulosta "onpas sinulla hieno nimi".
 *
 * @author Jussi Pohjolainen
 */
public class Main {
    public static void main(String[] args) {
        // Ask name, notice that because of static import
        // We do nat have to write System
        out.println("Give your name");

        // Ask the name
        String name = System.console().readLine();

        // You can use ternary operator instead of if!
        // If the condition is true, then output will have "Stupid name",
        // otherwise "Wonderful name"
        String output = name.equals("Jussi") ? "Stupid name" : "Wonderful name";

        out.println(output);
    }
}