package GUI.GShapes;

import java.awt.*;

/**
 * Created by awad on 4/19/2016.
 */
public class HomeShape extends GShape
{
    private Graphics2D g2d;
    public HomeShape()
    {

    }
    public void setGraphics2d(Graphics2D g2d)
    {
        this.g2d = g2d;
    }

    public void draw()
    {
        g2d.setColor(new Color(23,139,68));
        g2d.fillRect(90,27,5,20);
        g2d.setColor(new Color(22,172,75));
        int x[] = {75,50,50,100,100,75};
        int y[] = {25,50,100,100,50,25};
        g2d.fillPolygon(x, y, x.length);
        g2d.setColor(Color.WHITE);
        g2d.fillRect(68,75,15,25);

    }
}
