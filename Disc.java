public class Disc {
  public static final int RED = 0;
  public static final int YELLOW = 1;
  
  public int color; // Stores the disc's color
  
  public Disc(int color) {
    this.color = color;
  }
  
  public int getColor() {
    return color;
  }
  
  public boolean isRed() {
    return color == Disc.RED;
  }
  
  public boolean isYellow() {
    return color == Disc.YELLOW;
  }
}