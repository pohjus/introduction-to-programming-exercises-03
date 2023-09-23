
import static java.lang.System.out;

public class Main {    
    public static void main(String [] args) {
        out.println("PALINDROME CHECKER");
        out.print("Give word, I will check if it is a palindrome: ");
        String word = System.console().readLine();

        boolean isPalindrome = true;

        // Let's use a faster way of checking palindrome 
        // (compared to reverse)

        for(int i = 0; i < word.length(); i++) {
            
            // saippuakauppxas
            // ^             ^  => if these are the same, let's leave isPalindrome to true

            // saippuakauppxas
            //  ^           ^   => if these are the same, let's leave isPalindrome to true

            // saippuakauppxas
            //   ^         ^    => isPalindrome is now set to false and with break we will
            //                     end the loop

            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break; // ends the for loop
            }
        }

        out.println(isPalindrome ? "It's palindrome!" : "It's not a palindrome");
    }
}