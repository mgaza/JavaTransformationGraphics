package GUI.controlPanelRows;

import GUI.components.ComponentsConstants;
import GUI.components.GButton;
import GUI.components.GLabel;
import GUI.components.GTextField;
import Model.RotateAction;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;


public class RotationRow extends ControlPanelRow
{
    private GLabel rLabels[] = new GLabel[3];
    private GTextField rfields[] = new GTextField[3];
    private GButton rotate;
    public RotationRow()
    {
        super(new FlowLayout(FlowLayout.CENTER));
        styleRotationRow();
        addComponentsToRotationRow();
    }

    private void addComponentsToRotationRow()
    {
        rLabels[0] = new GLabel("Alpha");
        rLabels[1] = new GLabel("Xr");
        rLabels[2] = new GLabel("Yr");
        for(int i=0;i<rLabels.length;i++)
        {
            add(rLabels[i]);
            rfields[i] = new GTextField();
            add(rfields[i]);
        }
        rotate = new GButton("Rotate");
        rotate.addActionListener(new RotateAction(rfields[0],rfields[1],rfields[2]));
        add(rotate);

    }

    private void styleRotationRow()
    {
        setBorder(new TitledBorder(new LineBorder(ComponentsConstants.TitleBorderColor),"Rotation"));
    }
}
