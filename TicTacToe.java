package groupproject;

/**
 *
 * @author Justin
 */
public class TicTacToe {

    public Player P1 = new Player(P1s);
    public Player P2 = new Player(P2s);
    public boolean playerturn = false;
    static String P1s = "X";
    static String P2s = "O";
    String[] board = new String[]{"", "", "", "", "", "", "", "", ""};
    String currentwinner = "";

    String[] getBoard() {
        return board;
    }

    Boolean determineWinner() {

        int[][] rows
                = {
                    {0, 1, 2},
                    {3, 4, 5},
                    {6, 7, 8},
                    {0, 3, 6},
                    {1, 4, 7},
                    {2, 5, 8},
                    {0, 4, 8},
                    {2, 4, 6}
                };

        String determine;
        int counter = 0;

        for (int i = 0; i < rows.length; i++) {
            determine = board[rows[i][0]];

            for (int j = 0; j < rows[0].length; j++) {
                if (board[rows[i][j]].equals(determine)) {
                    counter++;
                } else {
                }
            }
            if (counter == 3 && !board[rows[i][0]].equals("")) {
                if (P1s.equals(board[rows[i][0]])) {
                    P1.gamesWon++;
                    currentwinner = "Player one";

                } else {
                    P2.gamesWon++;
                    currentwinner = "Player two";
                }
                board = new String[]{"", "", "", "", "", "", "", "", ""};

                return true;
            } else {
                counter = 0;
            }

        }
        counter = 0;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (board[i * 3 + j].equals("")) {
                    counter++;
                }
                System.out.print(board[i * 3 + j] + "\t");
            }

            System.out.println();
        }
        if (counter < 1) {
            board = new String[]{"", "", "", "", "", "", "", "", ""};
        }
        return false;
    }

    String chooseSpace(String symbol, int place) {
        if (board[place].equals("")) {
            board[place] = symbol;
            return symbol;
        } else {
            return board[place];
        }
    }

    public void start() {

        System.out.println("");
        rollandhandleDie();

    }

    public void turn() {
        playerturn = !playerturn;
    }

    public void rollandhandleDie() {

        Dice myDice = new Dice();
        int dieoc = myDice.rollDie();
        System.out.println("Rolling die, Die = " + dieoc);
        switch (dieoc) {
            case 1:
            case 2:
                break;

            case 3:
                turn();
                break;

            case 4:
                //delete P1 symbol.
                for (int r = 0; r < 9; r++) {

                    if (P1s.equals(board[r])) {
                        board[r] = "";
                        P1.numDel++;
                        return;

                    }

                }

                break;
            case 5:
                //delete P2 symbol.
                for (int r = 0; r < 9; r++) {

                    if (P2s.equals(board[r])) {
                        board[r] = "";
                        P2.numDel++;
                        return;
                    }

                }
                break;
            case 6:
                rollandhandleDie();
                break;

        }
    }
}
