package GUI.controlPanelRows;

import GUI.components.ComponentsConstants;
import GUI.components.GButton;
import GUI.components.GLabel;
import GUI.components.GTextField;
import Model.ScaleAction;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;


public class ScalingRow extends ControlPanelRow
{
    private GLabel sLabels[] = new GLabel[4];
    private GTextField sfields[] = new GTextField[4];
    private GButton scale;
    public ScalingRow()
    {
        super(new FlowLayout(FlowLayout.CENTER));
        styleRotationRow();
        addComponentsToRotationRow();
    }

    private void addComponentsToRotationRow()
    {
        sLabels[0] = new GLabel("Sx");
        sLabels[1] = new GLabel("Sy");
        sLabels[2] = new GLabel("Xf");
        sLabels[3] = new GLabel("Yf");

        for(int i=0;i<sLabels.length;i++)
        {
            add(sLabels[i]);
            sfields[i] = new GTextField();
            add(sfields[i]);
        }
        scale = new GButton("Scale");
        scale.addActionListener(new ScaleAction(sfields[0],sfields[1],sfields[2],sfields[3]));
        add(scale);

    }

    private void styleRotationRow()
    {
        setBorder(new TitledBorder(new LineBorder(ComponentsConstants.TitleBorderColor),"Scaling"));
    }
}
