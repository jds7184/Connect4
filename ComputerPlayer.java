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
    
    /*for now, this simply drops a disc at a random column
    *check for the next move by the player being a connect four 4 with a connect 4 method. 
    *would be a simple as crtl c ctrl v the connect 4 method - 1 to their checks
    *if that returns true, the computer then drops the disc where the connect four would be
    *if false drop the disc on a dics that is mine or on the side of mine
    *if their is none, drop a disc at a random location
    */
    Board.getInstance().getBoard();
    return (int)Math.random()*6;
    
  }
}