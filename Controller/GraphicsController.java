package Controller;

import GUI.GShapes.GShape;
import GUI.GUI;

public class GraphicsController
{
    public static GUI app;

    public static void run()
    {
        app = new GUI();
    }

    public static void repaintDrawingPanel()
    {
        app.repaintDrawingPanel();
    }

    public static void setDrawingPanelShape(GShape shape)
    {
        if(app != null)
        {
            app.setDrawingPanelShape(shape);
            repaintDrawingPanel();
        }

    }
}
