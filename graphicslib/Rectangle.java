package graphicslib;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Rectangle implements Shape
{
    private Color color = Color.BLACK;
    private boolean filled = false;
    private double x;
    private double y;
    private double width;
    private double height;

    /**
       Constructs an empty rectangle.
    */
    public Rectangle()
    {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
        Canvas.getInstance().show(this);
    }       

    /**
       Constructs a rectangle.
       @param x the leftmost x-coordinate
       @param y the topmost y-coordinate
       @param width the width
       @param height the height
    */
    public Rectangle(double x, double y, double width, double height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        Canvas.getInstance().show(this);
    }

    /**
       Gets the leftmost x-position of this rectangle.
       @return the leftmost x-position
    */
    public int getX()
    {
        return (int) Math.round(x);
    }

    /**
       Gets the topmost y-position of this rectangle.
       @return the topmost y-position
    */
    public int getY()
    {
        return (int) Math.round(y);
    }

    /**
       Gets the width of this rectangle.
       @return the width
    */    
    public int getWidth()
    {
        return (int) Math.round(width);
    }

    /**
       Gets the height of this rectangle.
       @return the height
    */    
    public int getHeight()
    {
        return (int) Math.round(height);
    }

    /**
       Sets the leftmost x-position of this rectangle.
       @param x the leftmost x-position
    */
    public void setX(int x)
    {
        this.x = (double)x;
        Canvas.getInstance().repaint();
    }

    /**
       Sets the topmost y-position of this rectangle.
       @param y the topmost y-position
    */
    public void setY(int y)
    {
        this.y = (double)y;
        Canvas.getInstance().repaint();
    }

    /**
       Sets the width of this rectangle.
       @param width the width
    */    
    public void setWidth(int width)
    {
        this.width = width;
        Canvas.getInstance().repaint();
    }

    /**
       Sets the height of this rectangle.
       @param height the height
    */    
    public void setHeight(int height)
    {
        this.height = height;
        Canvas.getInstance().repaint();
    }
    
    /**
       Moves this rectangle by a given amount.
       @param dx the amount by which to move in x-direction
       @param dy the amount by which to move in y-direction
    */
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
        Canvas.getInstance().repaint();
    }

    /**
       Resizes this rectangle both horizontally and vertically.
       @param dw the amount by which to resize the width on each side
       @param dh the amount by which to resize the height on each side
    */
    public void grow(double dw, double dh)
    {
        width += 2 * dw;
        height += 2 * dh;
        x -= dw;
        y -= dh;
        Canvas.getInstance().repaint();
    }

    /**
       Sets the color of this rectangle.
       @param newColor the new color
    */
    public void setColor(Color newColor)
    {
        color = newColor;
        Canvas.getInstance().repaint();
    }

    /**
     * Fills this rectangle.
     * @param filled whether the shape will be filled
     */
    public void setFilled(boolean filled)
    {
        this.filled = filled;
        Canvas.getInstance().repaint();
    }

    public String toString()
    {
        return "Rectangle[x=" + getX() + ",y=" + getY() + ",width=" + getWidth() + ",height=" + getHeight() + "]";
    }

    public void paintShape(Graphics2D g2)
    {
        Rectangle2D.Double rect = new Rectangle2D.Double(getX(), getY(),
                getWidth(), getHeight());
        g2.setColor(new java.awt.Color((int) color.getRed(), (int) color.getGreen(), (int) color.getBlue()));
        if (filled)
        {
            g2.fill(rect);
        }
        else
        {
            g2.draw(rect);
        }
    }
}
