package GUI.controlPanelRows;

import GUI.components.ComponentsConstants;
import GUI.components.GButton;
import GUI.components.GLabel;
import GUI.components.GTextField;
import Model.TranslateAction;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;


public class TranslationRow extends ControlPanelRow
{
    private GLabel tLabels[] = new GLabel[2];
    private GTextField tfields[] = new GTextField[2];
    private GButton tranlate;
    public TranslationRow()
    {
        super(new FlowLayout(FlowLayout.CENTER));
        styleRotationRow();
        addComponentsToRotationRow();
    }

    private void addComponentsToRotationRow()
    {
        tLabels[0] = new GLabel("Tx");
        tLabels[1] = new GLabel("Ty");
        for(int i=0;i<tLabels.length;i++)
        {
            add(tLabels[i]);
            tfields[i] = new GTextField();
            add(tfields[i]);
        }
        tranlate = new GButton("Translate");
        tranlate.addActionListener(new TranslateAction(tfields[0],tfields[1]));
        add(tranlate);

    }

    private void styleRotationRow()
    {
        setBorder(new TitledBorder(new LineBorder(ComponentsConstants.TitleBorderColor),"Translation"));
    }
}
