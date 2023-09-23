
import static java.lang.System.out;

public class Main {    
    public static void main(String [] args) {
        out.print("Give Number 1: ");
        int number1 = Integer.parseInt(System.console().readLine());
        out.print("Give operator (+, -, /, x): ");
        String operator = System.console().readLine();
        out.print("Give Number 2: ");
        int number2 = Integer.parseInt(System.console().readLine());

        double result = 0.0;

        switch(operator) {
            case "+":   result = number1 + number2; break;
            case "-":   result = number1 - number2; break;                       
            case "x":   result = number1 / number2; break;
            case "/":   if(number2 == 0) {
                            out.println("do not divide with zero"); return; // end the app.
                        } else {
                            result = (double) number1 / number2; break;
                        } 
            default:   out.println("wrong operator"); return; // end the app.
        }

        out.println(result);
    }

}