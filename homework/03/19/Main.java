import java.io.Console;
import static java.lang.System.out;

/**
 * Exercises 19: Sakari hunts Mac - game.
 * 
 * @author Jussi Pohjolainen
 */
public class Main {
    public static void main(String[] args) {

        int santeriX = 5, santeriY = 5;
        int macX = 2, macY = 2;
        
        while (true) {
            // Draw game
            for (int y = 0; y < 10; y++) {
                for (int x = 0; x < 10; x++) {
                    if (x == santeriX && y == santeriY) {
                        System.out.print("S");
                    } else if (x == macX && y == macY) {
                        System.out.print("M");
                    } else if (x == 0 || x == 9 || y == 0 || y == 9) {
                        System.out.print("#");
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            
            // Check victory
            if (santeriX == macX && santeriY == macY) {
                System.out.println("You won!");
                break;
            }
            
            // Santeri's skills
            System.out.println("Liiku (W/A/S/D): ");
            String move = System.console().readLine().toUpperCase();
            
            // Omitting { } and put everything on one line
            if (move.equals("W") && santeriY > 1) santeriY--;
            if (move.equals("A") && santeriX > 1) santeriX--;
            if (move.equals("S") && santeriY < 8) santeriY++;
            if (move.equals("D") && santeriX < 8) santeriX++;
            
            // Mac's skills
            int macMove = (int) (Math.random() * 5);
            
            // Omitting { } and put everything on one line
            if (macMove == 0 && macY > 1) macY--;
            if (macMove == 1 && macX > 1) macX--;
            if (macMove == 2 && macY < 8) macY++;
            if (macMove == 3 && macX < 8) macX++;
        }
    }
}