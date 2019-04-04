public class Circle extends Ellipse {
  
  /**
   * Circle constructor
   * @param xc the x-coordinate of the circle center
   * @param yc the y-coordinate of the circle center
   * @param r the radius of the circle
   */
  public Circle(int xc, int yc, int r) {
    super(xc-r, yc-r, 2*r, 2*r);
  }
  
  /**
   * Gets the circle's radius
   * @return the radius of the circle
   */
  public int getRadius() {
    return getWidth()/2;
  }
  
  /**
   * Sets the circle's radius
   * @param r the radius of the circle
   */
  public void setRadius(int r) {
    setWidth(2*r);
    setHeight(2*r);
  }
  
  /**
   * Gets the x-coordinate of the circle center
   * @return the x-coordinate of the center of the cirle
   */
  public int getCenterX() {
    return getX()+getRadius();
  }
  
  /**
   * Gets the y-coordinate of the circle center
   * @return the y-coordinate of the center of the cirle
   */
  public int getCenterY() {
    return getY()+getRadius();
  }
  
  /**
   * Sets the x-coordinate of the circle center
   * @param xc the x-coordinate of the center of the cirle
   */
  public void setCenterX(int xc) {
    setX(xc-getRadius());
  }
  
  /**
   * Sets the y-coordinate of the circle center
   * @param yc the y-coordinate of the center of the cirle
   */
  public void setCenterY(int yc) {
    setY(yc-getRadius());
  }
  
  /**
   * Sets the coordinates of the circle's center
   * @param xc the x-coordinate of the center of the cirle
   * @param yc the y-coordinate of the center of the cirle
   */
  public void setCenter(int xc, int yc) {
    setX(xc-getRadius());
    setY(yc-getRadius());
  }
}