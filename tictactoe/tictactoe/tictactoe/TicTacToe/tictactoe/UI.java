package tictactoe;
import java.util.Scanner;

/**
 * UI class
 */
public class UI
{

    Scanner scanner;

    public UI() {
        scanner = new Scanner(System.in);         
    }
    // Utility methods
    public String getXOrO(int whoseMove) {
        if (whoseMove == -1) {
            return "X";
        } else if (whoseMove == 1) {
            return "O";
        } else {
            return " ";
        }
    }

    public String getPlayerName(int whoseMove, String XName, String OName) {
        return (whoseMove == -1) ? XName : OName;
    }

    public boolean isLegalMove(State state, int row, int col) {
        return 1 <= row && row <= Constants.BOARD_SIZE &&
        1 <= col && col <= Constants.BOARD_SIZE &&
        state.getBoardCell(row-1, col-1) == Constants.BLANK;
    }

    // Prompt for input methods
    public String promptForName(String player) {
        System.out.printf(Constants.GET_PLAYER_NAME, player);
        return scanner.next();
    }

    public int getMoveRow(int whoseMove, String XName, String OName) {
        int row = 0;
        while (row <= 0 || row >= 4) {
            try {
                System.out.printf(Constants.GET_ROW_MOVE, getXOrO(whoseMove), getPlayerName(whoseMove,XName,OName));
                row = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(Constants.INVALID_ROW_OR_COLUMN);
            }
        }
        return row;
    }

    public int getMoveCol(int whoseMove, String XName, String OName) {
        int col = 0;
        while (col <= 0 || col >= 4) {
            try {
                System.out.printf(Constants.GET_COL_MOVE, getXOrO(whoseMove), getPlayerName(whoseMove, XName, OName));
                col = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(Constants.INVALID_ROW_OR_COLUMN);
            }
        }
        return col;
    }

    public boolean startNewGame() {
        System.out.println(Constants.START_NEW_GAME);
        String yesOrNo = scanner.next();
        return yesOrNo == "T";
    }

    // Printing text methods
    public void printWelcome() {
        System.out.println(Constants.TITLE);
    }

    public void printBoard(State state) {
        System.out.println(Constants.DIVIDER_STRING);
        for (int row = 0; row < Constants.BOARD_SIZE; row++) {
            System.out.printf(Constants.BOARD_STRING, getXOrO(state.getBoardCell(row, 0)), getXOrO(state.getBoardCell(row, 1)), getXOrO(state.getBoardCell(row, 2)));
            System.out.println();
            System.out.println(Constants.DIVIDER_STRING);
        }
    }

    public void printInvalidRowOrColumn(int rowOrCol) {
        System.out.printf(Constants.INVALID_ROW_OR_COLUMN, rowOrCol);
    }

    public void printInvalidMove(int row, int col) {
        System.out.printf(Constants.INVALID_MOVE_ERROR, row, col);
    }

    public void printMove(State state, int row, int col) {
        System.out.printf(Constants.PRINT_MOVE, getXOrO(state.getwhoseMove()), getPlayerName(state.getwhoseMove(), state.getXName(), state.getOName()), row, col);
    } 

    public void printWinner(State state) {
        System.out.println();
        System.out.printf(
        Constants.WINNER, 
        getXOrO(state.getwhoseMove()), 
        getPlayerName(state.getwhoseMove(), state.getXName(), state.getOName())
        );
        System.out.println();
    }

    public void printTieGame() {
        System.out.println(Constants.TIE_GAME);
    }
}

