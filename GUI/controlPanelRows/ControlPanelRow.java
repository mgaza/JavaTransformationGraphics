package GUI.controlPanelRows;

import GUI.components.ComponentsConstants;
import GUI.components.GPanel;

import java.awt.*;


abstract public class ControlPanelRow extends GPanel
{
    public ControlPanelRow(LayoutManager layoutManager)
    {
        super(layoutManager);
        setBackground(ComponentsConstants.ControlPanelBackground);
    }

}
