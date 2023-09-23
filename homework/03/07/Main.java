
import static java.lang.System.out;

public class Main {    
    public static void main(String [] args) {
        String result = "";
        String name = "";

        boolean continueLoop = true;

        do {
            out.println("give name (write \"stop\" to end the program.)");
            name = System.console().readLine();

            // true if stop not given
            continueLoop = !name.equalsIgnoreCase("stop");

            // if continueloop is true, add name to the string, otherwise add "" 
            // to to the string
            result += continueLoop ? name : "";
            out.println(result);
            
        } while(continueLoop);
    }
}