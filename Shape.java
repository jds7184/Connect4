//HIDE
import java.awt.Graphics2D;

/**
 * A shape that can be drawn on a canvas.
 */
public interface Shape
{
    /**
     * Gets the leftmost x-position of the shape.
     * @return the leftmost x-position
     */
    int getX();

    /**
     * Gets the topmost y-position of the shape.
     * @return the topmost y-position
     */
    int getY();

    /**
     * Gets the width of the shape.
     * @return the width
     */
    int getWidth();

    /**
     * Gets the height of the shape.
     * @return the height
     */
    int getHeight();
    
    /**
     * Sets the leftmost x-position of the shape.
     * @param x the leftmost x-position
     */
    void setX(int x);

    /**
     * Sets the topmost y-position of the shape.
     * @param y the topmost y-position
     */
    void setY(int y);

    /**
     * Sets the width of the shape.
     * @param width the width
     */
    void setWidth(int width);

    /**
     * Sets the height of the shape.
     * @param height the height
     */
    void setHeight(int height);

    /**
     * Paints the shape
     * @param g2 the graphics object
     */
    void paintShape(Graphics2D g2);
}
