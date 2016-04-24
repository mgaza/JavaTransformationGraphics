package Model;

import Controller.GraphicsController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScaleAction implements ActionListener
{
    public static double SCALE_X = 1,SCALE_Y=1,SCALE_XF=0,SCALE_YF=0;
    private JTextField xField,yField,xfField,yfField;

    public ScaleAction(JTextField xField,JTextField yField,JTextField xfField,JTextField yfField)
    {
        this.xField = xField;
        this.yField = yField;
        this.xfField = xfField;
        this.yfField = yfField;
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        try
        {
            SCALE_X = Double.parseDouble(xField.getText());
            SCALE_Y = Double.parseDouble(yField.getText());
            SCALE_XF = Double.parseDouble(xfField.getText());
            SCALE_YF = Double.parseDouble(yfField.getText());
            TransformationStatus.SCALING_TRANSFORMATION = true;
            GraphicsController.repaintDrawingPanel();
        }
        catch (Exception err)
        {
            JOptionPane.showMessageDialog(null,"Wrong Values!","Error",JOptionPane.ERROR_MESSAGE);
        }

    }
}
