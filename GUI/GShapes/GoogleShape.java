package GUI.GShapes;

import java.awt.*;

/**
 * Created by awad on 4/19/2016.
 */
public class GoogleShape extends GShape
{
    private Graphics2D g2d;
    public GoogleShape()
    {

    }

    public void setGraphics2d(Graphics2D g2d)
    {
        this.g2d = g2d;
    }

    public void draw()
    {
        // g
        g2d.setColor(new Color(66, 133, 244));
        g2d.setStroke(new BasicStroke(4));
        g2d.drawArc(50,50,50,50,60,300);
        g2d.drawLine(100,75,75,75);
        // o
        g2d.setColor(new Color(234,67,53));
        g2d.drawArc(110,75,20,20,0,360);
        // o
        g2d.setColor(new Color(251,188,5));
        g2d.drawArc(140,75,20,20,0,360);
        // g
        g2d.setColor(new Color(66, 133, 244));
        g2d.drawArc(170,75,20,20,0,360);
        g2d.drawLine(190,75,190,100);
        g2d.drawArc(170,90,20,20,180,180);
        // l
        g2d.setColor(new Color(52,168,83));
        g2d.drawLine(200,50,200,100);
        // e
        g2d.setColor(new Color(234,67,53));
        g2d.drawArc(210,75,20,20,60,300);
        g2d.drawLine(225,77,210,85);
    }
}
