
import static java.lang.System.out;

public class Main {    
    public static void main(String [] args) {
        // Exercise 12: 5 x [0, 1[ (double)
        out.println("EXERCISE 12\n**********");

        for(int i = 0; i < 5; i++) {
            out.println(Math.random());
        }


        // Exercise 13: 4 x [0, 4] (int)
        out.println("EXERCISE 12\n**********");

        for(int i = 0; i < 5; i++) {
            out.println((int) (Math.random() * 5));
        }

    }

}