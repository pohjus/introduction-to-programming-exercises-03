
import static java.lang.System.out;

public class Main {    
    public static void main(String [] args) {
        

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