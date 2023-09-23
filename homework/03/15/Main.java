import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.io.File;
import static java.lang.System.out;

public class Main {
  public static void main(String [] args) throws IOException {
    // Set the file name from which to read lines
    String textFileName = "input.txt";
    // Read all lines from the file into a List
    List<String> allLines = Files.readAllLines(new File(textFileName).toPath(), Charset.defaultCharset());

    int currentNumber;
    int minNumber = 0;

    // Find the smallest (most negative) number in the list
    for(int i=0; i<allLines.size(); i++) {
        currentNumber = Integer.parseInt(allLines.get(i));
        if (currentNumber < minNumber) {
            minNumber = currentNumber;
        }
    }

    // Get the absolute value of the smallest number
    minNumber = Math.abs(minNumber);

    // Loop over all lines to print the graphical representation
    for(int i=0; i<allLines.size(); i++) {
        // Parse the integer value of the current line
        currentNumber = Integer.parseInt(allLines.get(i));

        // If the number is negative, print spaces and then minuses
        if (currentNumber < 0) {
            for (int c = 0; c < minNumber + currentNumber; c++) {
                out.print(" ");
            }
            for (int c = 0; c < Math.abs(currentNumber); c++) {
                out.print("-");
            }
        } else {
            // If the number is positive or zero, just print spaces
            for (int c = 0; c < minNumber; c++) {
                out.print(" ");
            }
        }

        // Print the middle bar
        out.print("|");

        // If the number is positive, print pluses
        if (currentNumber > 0) {
            for (int c = 0; c < currentNumber; c++) {
                out.print("+");
            }
        }

        // Move to the next line
        out.println();
    }
  }
}