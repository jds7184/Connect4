package graphicslib;

import java.awt.Dimension;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class Text implements Shape
{
    private Color color = Color.BLACK;
    private JLabel label = new JLabel();
    private double x;
    private double y;
    private double xGrow;
    private double yGrow;

    /**
     * Constructs a text at a given location.
     * @param x the leftmost x-position of the shape
     * @param y the topmost y-position of the shape
     * @param message the text string 
     */
    public Text(double x, double y, String message)
    {
        this.x = x;
        this.y = y;
        label.setText(message);
        Canvas.getInstance().show(this);
    }
      
    /**
     * Sets the text message
     * NOTE: the bounding box is not resized.
     * @param message the text to display
     */
    public void setText(String message) {
      label.setText(message);
      Canvas.getInstance().repaint();
    }
    
    /**
     * Gets the text message
     * @return the text displayed
     */
    public String getText() {
      return label.getText();
    }
    
    /**
     * Gets the leftmost x-position of the bounding box.
     * @return the leftmost x-position
     */
    public int getX()
    {
        return (int) Math.round(x) ;
    }

    /**
     * Gets the topmost y-position of the bounding box.
     * @return the topmost y-position
     */
    public int getY()
    {
        return (int) Math.round(y);
    }
    
    /**
     * Sets the leftmost x-position of the bounding box.
     * @param x the leftmost x-position
     */
    public void setX(int x)
    {
        this.x = x;
        Canvas.getInstance().repaint();
    }

    /**
     * Sets the topmost y-position of the bounding box.
     * @param y the topmost y-position
     */
    public void setY(int y)
    {
        this.y = y;
        Canvas.getInstance().repaint();
    }
    
    /**
     * Gets the width of the bounding box.
     * @return the width
     */
    public int getWidth()
    {
        return (int) Math.round(label.getPreferredSize().getWidth() + 2 * xGrow);
    }

    /**
     * Gets the height of the bounding box.
     * @return the height
     */
    public int getHeight()
    {
        return (int) Math.round(label.getPreferredSize().getHeight() + 2 * yGrow);
    }
    
    /**
     * Sets the width of the bounding box.
     * @param width the width
     */
    public void setWidth(int width)
    {
        xGrow = (width - label.getPreferredSize().getWidth()) / 2;
        Canvas.getInstance().repaint();
    }

    /**
     * Sets the height of the bounding box.
     * @param height the height
     */
    public void setHeight(int height)
    {
        yGrow = (height - label.getPreferredSize().getHeight()) / 2;
        Canvas.getInstance().repaint();
    }
    
    /**
     * Moves this text by a given amount.
     * @param dx the amount by which to move in x-direction
     * @param dy the amount by which to move in y-direction
     */
    public void translate(double dx, double dy)
    {
        x += dx;
        y += dy;
        Canvas.getInstance().repaint();
    }    
    
    /**
     * Resizes this text both horizontally and vertically.
     * @param dw the amount by which to resize the width on each side
     * @param dh the amount by which to resize the height on each side
     */
    public void grow(double dw, double dh)
    {
        xGrow += dw;
        yGrow += dh;
        x -= dw;
        y -= dh;
        Canvas.getInstance().repaint();
    }
    
    /**
     * Scales this text proportionally
     * @param factor the scale factor
     */
    public void scale(double factor) {
      setWidth((int)(getWidth()*factor));
      setHeight((int)(getHeight()*factor));
    }

    /**
     * Sets the color for drawing this text.
     * @param newColor the new color
     */
    public void setColor(Color newColor)
    {
        color = newColor;
        Canvas.getInstance().repaint();
    }

   
    public String toString()
    {
        return "Text[x=" + getX() + ",y=" + getY() + ",message=" + label.getText() + "]";
    }

    public void paintShape(Graphics2D g2)
    {
        if (color != null)
        {
            label.setForeground(new java.awt.Color((int) color.getRed(), (int) color.getGreen(), (int) color.getBlue()));
            Dimension dim = label.getPreferredSize();
            if (dim.width > 0 && dim.height > 0)
            {
                label.setBounds(0, 0, dim.width, dim.height);
                g2.translate(getX(), getY());
                g2.scale(getWidth() / dim.width, getHeight() / dim.height);
                label.paint(g2);
            }
        }
    }
}
