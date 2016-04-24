package GUI;

import GUI.components.ComponentsConstants;
import GUI.components.GPanel;
import GUI.controlPanelRows.*;

import javax.swing.border.EmptyBorder;
import java.awt.*;


public class ControlPanel extends GPanel
{
    ControlPanelRow rows[] = new ControlPanelRow[5];
    public ControlPanel()
    {
        super(new GridLayout(6,1));
        buildControlPanel();
        styleControlPanel();
    }

    private void buildControlPanel()
    {
        rows[0] = new ShapesRow();
        add(rows[0]);
        rows[1] = new RotationRow();
        add(rows[1]);
        rows[2] = new TranslationRow();
        add(rows[2]);
        rows[3] = new ScalingRow();
        add(rows[3]);
        rows[4] = new ReflectionRow();
        add(rows[4]);
    }

    private void styleControlPanel()
    {
        setBorder(new EmptyBorder(20,10,10,10));
        setBackground(ComponentsConstants.ControlPanelBackground);
    }

}
