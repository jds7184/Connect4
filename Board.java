public class Board {
  private static int boardRows = 6;
  private static int boardCols = 7;
  private static Board theBoard;
  
  private Disc[][] board;
  
  /* Board constructor.
   * NOTE: the constructor is private so that 
   * new boards cannot be constructed. Client code
   * will call Board.getInstance() to get a Board
   * object 
   * Assigned to: Mallie  
   */
  private Board(int rows, int cols) {
    // Add constructor code here
    // Initialize the board 2-D array
    board = new Disc [rows] [cols];
    
  }
    
  /* Adds the provided Disc into the specified 
   * column in the board 2-D array
   * Assigned to: Mallie
   */
  public void dropDisc(Disc a, int column) {
    for (int r = board.length - 1; r >= 0; r--) {
      if (board [r] [column] == null) {
        board [r] [column] = a;
        break; 
      }
    }
  }
  
  /* Resets the board 2-D array to start a new
   * game.  Set all Discs in the array to null.
   * Assigned to: Mallie
   */
  public void resetBoard() {
    
  }
  
  /* Checks the board to see if there are four
   * discs of the same color in a row.
   * Return -1 = no four in a row.
   *         Disc.RED = 4 red discs in a row.
   *         Disc.YELLOW = 4 yellow discs in a row.
   * Assigned to: Madison
   */
  public int checkForConnectFour() {
//<<<<<<< HEAD
    //horizontal
    for(int r=0; r<board.length; r++){
      int currentColor=-1;
      int numRow=0;
      for(int c=0; c<board[r].length; c++){
        if(board[r][c]!=null){
          if(currentColor==board[r][c].getColor()){
            numRow++;
          }else{
            currentColor=board[r][c].getColor();
            numRow=1;
          }
          if(numRow==4){
            return currentColor;
          }
        }else{
          currentColor=-1;
          numRow=0;
        }
      }
    } 
    //vertical
      for(int c=0; c<board.length; c++){
      int currentColor=-1;
      int numRow=0;
      for(int r=0; r<board[c].length; r++){
        if(board[r][c]!=null){
          if(currentColor==board[r][c].getColor()){
            numRow++;
          }else{
            currentColor=board[r][c].getColor();
            numRow=1;
          }
          if(numRow==4){
            return currentColor;
          }
        }else{
          currentColor=-1;
          numRow=0;
        }
      }
    }
//=======
    
     
//>>>>>>> d74f56cac0774c1af4be4a0d2a1dab2c48c495ec
    return -1;
  }
  
  
  
  // Connect4Game can call this before calling
  // getInstance to initialize the board size.
  // Done. Don't change this
  public void initBoardSize(int rows, int cols) {
    boardRows = rows;
    boardCols = cols;
  }
  
  // Done. Don't change this.
  public static Board getInstance() {
    if (theBoard == null) {
      theBoard = new Board(boardRows, boardCols);
    }
    return theBoard;
  }
  
  // Done. Don't change this.
  public Disc[][] getBoard() {
    return board;
  }
}