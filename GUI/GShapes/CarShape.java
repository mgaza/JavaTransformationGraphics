package GUI.GShapes;

import java.awt.*;

/**
 * Created by awad on 4/19/2016.
 */
public class CarShape extends GShape
{
    private Graphics2D g2d;

    public CarShape()
    {

    }
    public void setGraphics2d(Graphics2D g2d)
    {
        this.g2d = g2d;
    }

    public void draw()
    {
        g2d.setStroke(new BasicStroke(3));
        g2d.drawLine(50,50,80,50);
        g2d.drawArc(80,35,70,30,0,180);
        g2d.drawLine(150,50,180,50);
        g2d.drawLine(180,50,180,80);
        g2d.drawLine(180,80,160,80);
        g2d.drawArc(140,70,20,20,0,180);
        g2d.drawLine(140,80,90,80);
        g2d.drawArc(70,70,20,20,0,180);
        g2d.drawLine(70,80,50,80);
        g2d.drawLine(50,80,50,50);
        // wheels
        g2d.setColor(new Color(0,0,0));
        g2d.fillArc(143,72,14,14,0,360);
        g2d.fillArc(73,72,14,14,0,360);


    }
}
