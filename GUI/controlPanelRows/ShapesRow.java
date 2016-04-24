package GUI.controlPanelRows;

import Controller.GraphicsController;
import GUI.GShapes.CarShape;
import GUI.GShapes.GoogleShape;
import GUI.GShapes.HomeShape;
import GUI.components.GComboBox;
import GUI.components.GLabel;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class ShapesRow extends ControlPanelRow
{
    private GLabel shapesLabel;
    private GComboBox shapesCombo;
    private String shapes[] = {"Car","Google","Home"};
    public ShapesRow()
    {
        super(new FlowLayout(FlowLayout.CENTER));
        buildShapesRow();
    }

    private void buildShapesRow()
    {
        shapesLabel = new GLabel("Shapes");
        shapesCombo = new GComboBox();

        shapesCombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
               String word =  e.getItem().toString().toLowerCase();

                if(word.equals("car"))
                {
                    GraphicsController.setDrawingPanelShape(new CarShape());
                }
                else if(word.equals("google"))
                {
                    GraphicsController.setDrawingPanelShape(new GoogleShape());
                }
                else if(word.equals("home"))
                {
                    GraphicsController.setDrawingPanelShape(new HomeShape());
                }
            }
        });

        for(String item : shapes)
            shapesCombo.addItem(item);
        add(shapesLabel);
        add(shapesCombo);

    }
}
