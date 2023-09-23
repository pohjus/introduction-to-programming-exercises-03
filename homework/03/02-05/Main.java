
import static java.lang.System.out;

public class Main {    
    public static void main(String [] args) {
        // Exercise 2: variables
        out.println("EXERCISE 02\n**********");
        out.println("jack".charAt(0));     // outputs first char 'j'
        out.println("jack".length());      // outputs the length of the String
        out.println("   jack   ".trim());  // removes whitespaces

        // Exercise 3: Ask name and output each char
        out.println("EXERCISE 03\n**********");
        out.println("Give your name");
        String name = System.console().readLine();
        for(int i = 0; i < name.length(); i++) {
            out.println(name.charAt(i));
        }

        // Exercise 4: Same but backwards
        out.println("EXERCISE 04\n**********");
        for(int i = name.length() - 1; i >= 0; i--) {
            out.println(name.charAt(i));
        }

        // Exercise 5: Every other char
        out.println("EXERCISE 05\n**********");
        for(int i = name.length() - 1; i >= 0; i -= 2) {
            out.println(name.charAt(i));
        }
    }
}