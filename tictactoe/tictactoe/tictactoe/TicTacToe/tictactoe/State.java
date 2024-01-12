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
 
public boolean isWinner() {
    
}
   
public int getGameState() {
  return this.gameState;
}

public void setGameState(int gameState) {
  this.gameState = gameState;
}

public int getwhoseMove() {
    return this.whoseMove;
}
    
public void setwhoseMove(int whoseMove) {
    this.whoseMove = whoseMove;
}
    
public String getxName(){
    return this.xName;
}
    
public void setxName(String xName) {
    this.xName = xName;
}
    
public String getoName() {
    return this.oName;
}
    
public void setoName(String oName) {
    this.oName = oName;
}

//Board

public int getBoardCell(int row, int col) {
        return this.board[row][col];
}

public void setBoardCell(int row, int col, int value) {
        this.board[row][col] = value;
}
}



