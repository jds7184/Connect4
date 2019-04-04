import java.awt.event.KeyListener;
import graphicslib.*;

public class Display {
  
  public static final int bDispWidth = 600; // Width of the board display
  public static final int bDispHeight = 400; // Height of the board display
  public static final int bDispMargins = 20; // Margins around board display
  
  Canvas canvas;
  
  Rectangle[][] spaces;
  
  Circle[][] gamePieces;
  
  Circle previewDisc;
  
  /* Display constructor (change/modify this as you wish)
   * Assigned to: Colson
   */
  public Display() {
    canvas = Canvas.getInstance();
    
    Disc[][] board = Board.getInstance().getBoard();
    
    spaces = new Rectangle[board.length][board[0].length];
    
    // Determine how big to make the squares of the board
    int squareSize = Math.min(bDispWidth / board[0].length,
                        bDispHeight / (board.length+1));
    
    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[0].length; c++) {
        spaces[r][c] = new Rectangle(
                          bDispMargins + c*squareSize+1, // x
                          bDispMargins + (1+r)*squareSize+1, // y
                          squareSize-2,   // width
                          squareSize-2);  // height
      }
    }

    
    // TODO: Initialize an array of circles for discs (initially empty)
    //       Initialize a cirle used for the preview
    //       Draw a scoreboard somewhere.
  }
  
  /* Updates the scores displayed on the screen
   * Assigned to: Colson
   */
  public void updateScore(int p1score, int p2score) {
    
  }
    
  /* Updates how the discs are displayed on the screen
   * based on what's currently in the board 2-D array
   * Assigned to: Niyah
   */
  public void updateBoard() {
    Disc[][] board = Board.getInstance().getBoard();
    
    
  }
  
  /* Drop preview - moves the preview disc
   * of the provided color above the given column
   * Assigned to: Niyah
   */
  public void dropPreview(int color, int column) {
    
  }
  
  // Done. Don't change this.
  public void addKeyListener(KeyListener k) {
    canvas.addKeyListener(k);
  }
  
}