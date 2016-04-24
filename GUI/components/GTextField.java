package GUI.components;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;


public class GTextField extends JTextField
{
    public GTextField()
    {
        super(5);
        setBorder(new CompoundBorder(new LineBorder(Color.GRAY),new EmptyBorder(2,2,2,2)));
    }
}
