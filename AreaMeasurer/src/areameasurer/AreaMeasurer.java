import java.awt.Rectangle;
package areameasurer;

/**
   Objects of this class measure rectangle by area
 */
public class AreaMeasurer implements Measurer
{
    public double measure(Object anObject)
    {
        Rectangle aRectangle = (Rectangle) anObject;
        double area = aRectangle.getWidth() * aRectangle.getHeight();
        return area;
    }
}
