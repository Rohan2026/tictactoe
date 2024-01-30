package tictactoe;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    
    public int getwhoseMove() {
        return this.whoseMove;
    }
    
    public void setwhoseMove() {
        this.whoseMove = whoseMove;
    }
    
    //public boolean isWinner() {
        //e
   // }
    
    //public boolean isTie() {
        //e
    //}
}

