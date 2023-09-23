import static java.lang.System.out;

/**
 * Santeri - game.
 *
 * @author Jussi Pohjolainen
 */
public class Main {
    /**
     * Size of the game board.
     */
    static final int BOARD_SIZE = 10;

    /**
     * Minimum valid position on the board.
     */
    static final int MIN_POSITION = 1;

    /**
     * Maximum valid position on the board.
     */
    static final int MAX_POSITION = 8;

    /**
     * Indicates a move upwards.
     */
    static final int MOVE_UP = 0;

    /**
     * Indicates a move to the left.
     */
    static final int MOVE_LEFT = 1;

    /**
     * Indicates a move downwards.
     */
    static final int MOVE_DOWN = 2;

    /**
     * Indicates a move to the right.
     */
    static final int MOVE_RIGHT = 3;

    /**
     * Number of possible moves for Mac.
     */
    static final int NUM_MAC_MOVES = 4;

    /**
     * Starting X-coordinate for Santeri.
     */
    static final int SANTERI_STARTING_X = 5;

    /**
     * Starting Y-coordinate for Santeri.
     */
    static final int SANTERI_STARTING_Y = 5;

    /**
     * Starting X-coordinate for Mac.
     */
    static final int MAC_STARTING_X = 2;

    /**
     * Starting Y-coordinate for Mac.
     */
    static final int MAC_STARTING_Y = 2;

    /**
     * The main entry point for the application.
     *
     * @param args Command-line arguments. Not used in this application.
     */
    public static void main(final String[] args) {

        int santeriX = SANTERI_STARTING_X;
        int santeriY = SANTERI_STARTING_Y;
        int macX = MAC_STARTING_X;
        int macY = MAC_STARTING_Y;

        while (true) {
            // Draw game
            for (int y = 0; y < BOARD_SIZE; y++) {
                for (int x = 0; x < BOARD_SIZE; x++) {
                    if (x == santeriX && y == santeriY) {
                        out.print("S");
                    } else if (x == macX && y == macY) {
                        out.print("M");
                    } else if (x == 0
                            || x == BOARD_SIZE - 1
                            || y == 0
                            || y == BOARD_SIZE - 1) {
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

            // NOTE: Single-line if-statements are used intentionally
            // here for brevity.
            if (move.equals("W") && santeriY > MIN_POSITION) santeriY--;
            if (move.equals("A") && santeriX > MIN_POSITION) santeriX--;
            if (move.equals("S") && santeriY < MAX_POSITION) santeriY++;
            if (move.equals("D") && santeriX < MAX_POSITION) santeriX++;

            // Mac's skills
            int macMove = (int) (Math.random() * NUM_MAC_MOVES);

            // NOTE: Single-line if-statements are used intentionally
            // here for brevity.
            if (macMove == MOVE_UP && macY > MIN_POSITION) macY--;
            if (macMove == MOVE_LEFT && macX > MIN_POSITION) macX--;
            if (macMove == MOVE_DOWN && macY < MAX_POSITION) macY++;
            if (macMove == MOVE_RIGHT && macX < MAX_POSITION) macX++;
        }
    }
}
