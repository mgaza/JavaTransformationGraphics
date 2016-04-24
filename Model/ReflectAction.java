package Model;

import Controller.GraphicsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReflectAction implements ActionListener
{
    public static int REFLECT_X_MINUS = 1;
    public static int REFLECT_Y_MINUS = 1;
    public static boolean TargetAxis = true;

    public  boolean isXAxis = false;
    public ReflectAction(boolean isXAxis)
    {
       this.isXAxis = isXAxis;
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        if(isXAxis)
        {
            REFLECT_X_MINUS = REFLECT_X_MINUS * -1;
            TargetAxis = true;
        }
        else
        {
            REFLECT_Y_MINUS = REFLECT_Y_MINUS * -1;
            TargetAxis = false;
        }
        TransformationStatus.REFLECTION_TRANSFORMATION = true;
        GraphicsController.repaintDrawingPanel();
    }
}
