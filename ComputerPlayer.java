public class ComputerPlayer implements Player {
  
  // The computer's Disc color is yellow.
  // The human player will be red.
  private int myColor = Disc.YELLOW;
  
  // Constructor. Done for now.
  public ComputerPlayer() {
    
  }
  
  /* Chooses a column to play a Disc into.
   * Return the COLUMN index.
   * Assigned to: Michael
   * 
   */
  
  
  public int selectColumn() {
    Disc[][] board = Board.getInstance().getBoard();
    /*for now, this simply drops a disc at a random column
    *check for the next move by the player being a connect four 4 with a connect 4 method. 
    *would be a simple as crtl c ctrl v the connect 4 method - 1 to their checks
    *if that returns true, the computer then drops the disc where the connect four would be
    *if false drop the disc on a dics that is mine or on the side of mine
    *if their is none, drop a disc at a random location
    */
    //attempt to check for 3 in a row, any direction
    for (int r = 0; r < 6; r++){
      for (int c = 0; c < 7; c++){
        //if(board[i][a].getColor())
      }
    }
    
    for (int i = 0; i < 6; i++){//if no 3 in a row, puts a disc on one that is already plaed and is my color
      for (int a = 0; a < 7; a++){
        if(board[i][a].isYellow() && i != 6)
          return a;
      }
    }
    return (int)Math.random()*6;//if all else fails, places disc in a random place.
    
  }
}