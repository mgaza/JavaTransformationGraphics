package Model;

import Controller.GraphicsController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TranslateAction implements ActionListener
{
    public static double TRANSLATE_X=0,TRANSLATE_Y=0;
    private JTextField xTranslate,yTranslate;

    public TranslateAction(JTextField xTranslate,JTextField yTranslate)
    {
        this.xTranslate = xTranslate;
        this.yTranslate = yTranslate;
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        try
        {
            TRANSLATE_X = Double.parseDouble(xTranslate.getText());
            TRANSLATE_Y = Double.parseDouble(yTranslate.getText());
            TransformationStatus.TRANSLATION_TRANSFORMATION =true;
            GraphicsController.repaintDrawingPanel();
        }
        catch (Exception err)
        {
            JOptionPane.showMessageDialog(null,"Wrong Values!","Error",JOptionPane.ERROR_MESSAGE);
        }

    }
}
