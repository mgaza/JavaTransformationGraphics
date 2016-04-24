package GUI.controlPanelRows;

import GUI.components.ComponentsConstants;
import GUI.components.GButton;
import Model.ReflectAction;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;


public class ReflectionRow extends ControlPanelRow
{
    private GButton reflectionAboutX;
    private GButton reflectionAboutY;
    public ReflectionRow()
    {
        super(new FlowLayout(FlowLayout.CENTER));
        styleReflectionRow();
        addComponentsToReflectionRow();
    }

    private void addComponentsToReflectionRow()
    {
        reflectionAboutX = new GButton("Reflect about X-axis");
        reflectionAboutY = new GButton("Relect about Y-axis");
        reflectionAboutX.addActionListener(new ReflectAction(true));
        reflectionAboutY.addActionListener(new ReflectAction(false));
        add(reflectionAboutX);
        add(reflectionAboutY);
    }

    private void styleReflectionRow()
    {
        setBorder(new TitledBorder(new LineBorder(ComponentsConstants.TitleBorderColor),"Reflection"));
    }
}
