import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Connect4Game implements KeyListener {
  
  private int p1score;        // Human player's score
  private int computerScore;  // Computer player's score
  
  private int whoseTurn;      // 0 = human's turn, 1 = computer's turn
  
  private int currentColumnPreview;   // The human's current column
                                      // (display a disk above it)
  
  private Display display;   // Reference to the game's display
  
  private Player ai;        // The computer AI
  
  /* Connect4Game Constructor
   * Assigned to: Kaleb
   */
  public Connect4Game() {
    display = new Display();
    display.addKeyListener(this); // So we can receive keyboard input
    
    // Continue here
    p1score = 0;
    computerScore = 0;
    currentColumnPreview = 0;
    ai = new ComputerPlayer();
    display.updateBoard();
    whoseTurn = (int)(Math.random()*2);
  } 
 
  /* Called after the human finishes his/her turn.
   * Needs to ask the computer player what column to 
   * drop a disk and handle updating the board and display.
   * Assigned to: Kaleb
   */
  public void takeComputerTurn() {
    while( whoseTurn == 1){
      ai.selectColumn();
      display.updateBoard();
    }
  }
  
  /* This handles keyboard input from the user.
   *  Left Arrow = decrease currentColumnPreview, then 
   *                call display.dropPreview(...)
   *  Right Arrow = increase currentColumnPreview, then
   *                 call display.dropPreview(...)
   *  Down Arrow = drop the disk in the current column
   *                then call display.updateBoard, then
   *                 update whoseTurn and call takeComputerTurn();
   * Assigned to: Alexis
   */  
  public void keyTyped(KeyEvent e) {
    if (e.getKeyText(e.getKeyCode()) == "Left") {
      
    }
    
  }
  
  // Done. Don't change these:
  public void keyPressed(KeyEvent e) {} // Do nothing
  public void keyReleased(KeyEvent e) {} // Do nothing
}