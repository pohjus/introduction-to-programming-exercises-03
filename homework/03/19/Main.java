import static java.lang.System.out;

public class Main {
    static final int BOARD_SIZE = 10;
    static final int MIN_POSITION = 1;
    static final int MAX_POSITION = 8;
    
    static final int MOVE_UP = 0;
    static final int MOVE_LEFT = 1;
    static final int MOVE_DOWN = 2;
    static final int MOVE_RIGHT = 3;
    static final int NUM_MAC_MOVES = 4;

    public static void main(String[] args) {

        int santeriX = 5;
        int santeriY = 5;
        int macX = 2;
        int macY = 2;

        while (true) {
            // Draw game
            for (int y = 0; y < BOARD_SIZE; y++) {
                for (int x = 0; x < BOARD_SIZE; x++) {
                    if (x == santeriX && y == santeriY) {
                        out.print("S");
                    } else if (x == macX && y == macY) {
                        out.print("M");
                    } else if (x == 0 || x == BOARD_SIZE - 1 || y == 0 || y == BOARD_SIZE - 1) {
                        out.print("#");
                    } else {
                        out.print("-");
                    }
                }
                System.out.println();
            }

            // Check victory
            if (santeriX == macX && santeriY == macY) {
                out.println("You won!");
                break;
            }

            // Santeri's skills
            out.println("Move (W/A/S/D): ");
            String move = System.console().readLine().toUpperCase();

            // NOTE: Single-line if-statements are used intentionally here for brevity.
            if (move.equals("W") && santeriY > MIN_POSITION) santeriY--;
            if (move.equals("A") && santeriX > MIN_POSITION) santeriX--;
            if (move.equals("S") && santeriY < MAX_POSITION) santeriY++;
            if (move.equals("D") && santeriX < MAX_POSITION) santeriX++;

            // Mac's skills
            int macMove = (int) (Math.random() * NUM_MAC_MOVES);

            // NOTE: Single-line if-statements are used intentionally here for brevity.
            if (macMove == MOVE_UP && macY > MIN_POSITION) macY--;
            if (macMove == MOVE_LEFT && macX > MIN_POSITION) macX--;
            if (macMove == MOVE_DOWN && macY < MAX_POSITION) macY++;
            if (macMove == MOVE_RIGHT && macX < MAX_POSITION) macX++;
        }
    }
}