package GUI;

import GUI.GShapes.GShape;

import javax.swing.*;
import java.awt.*;


public class GUI extends JFrame
{
    private Container container;
    private FramePanel framePanel;
    private DrawingPanel drawingPanel;
    private ControlPanel controlPanel;

    public GUI()
    {
        super("Graphics");
        buildGUI();
        setSize(900,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(900,500));
        setVisible(true);
    }

    private void buildGUI()
    {
        container = getContentPane();
        framePanel = new FramePanel();
        drawingPanel = new DrawingPanel();
        controlPanel = new ControlPanel();
        framePanel.add(controlPanel);
        framePanel.add(drawingPanel);
        container.add(framePanel);
    }

    public void repaintDrawingPanel()
    {
        this.repaint();
    }

    public void setDrawingPanelShape(GShape shape)
    {
        this.drawingPanel.setShape(shape);
    }
}
