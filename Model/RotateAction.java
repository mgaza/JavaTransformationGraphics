package Model;

import Controller.GraphicsController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RotateAction implements ActionListener
{
    public static double ROTATE_ALPHA = 0,ROTATE_X = 0,ROTATE_Y = 0;
    private JTextField alphaTextField, xTextField, yTextField;

    public RotateAction(JTextField alphaTextField,JTextField xTextField,JTextField yTextField)
    {
        this.alphaTextField = alphaTextField;
        this.xTextField = xTextField;
        this.yTextField = yTextField;
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        try
        {
            ROTATE_ALPHA = Double.parseDouble(alphaTextField.getText());
            ROTATE_X = Double.parseDouble(xTextField.getText());
            ROTATE_Y = Double.parseDouble(yTextField.getText());
            TransformationStatus.ROTATION_TRANSFORMATION = true;
            GraphicsController.repaintDrawingPanel();

        }
        catch (Exception err)
        {
            JOptionPane.showMessageDialog(null,"Wrong Values!","Error",JOptionPane.ERROR_MESSAGE);
        }


    }
}
