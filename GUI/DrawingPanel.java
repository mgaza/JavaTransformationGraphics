package GUI;

import GUI.GShapes.CarShape;
import GUI.GShapes.GShape;
import GUI.components.ComponentsConstants;
import GUI.components.GPanel;
import Model.*;

import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.AffineTransform;


public class DrawingPanel extends GPanel
{
    private GShape shape;
    public DrawingPanel()
    {
        super(null);
        setBackground(ComponentsConstants.ControlPanelBackground);
        setBorder(new EmptyBorder(10,10,10,10));
      shape = new CarShape();

    }

    @Override
    public void paint(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        // check transformation matrix
        if(TransformationStatus.CURRENT_TRANSFORMATION == null)
        {
            g2d.translate(getWidth()/2-100,getHeight()/2-100);
        }
        else
        {
            g2d.setTransform(TransformationStatus.CURRENT_TRANSFORMATION);
        }

        // make Translation
        if(TransformationStatus.TRANSLATION_TRANSFORMATION)
        {
            g2d.translate(TranslateAction.TRANSLATE_X,TranslateAction.TRANSLATE_Y); // translate
            TransformationStatus.TRANSLATION_TRANSFORMATION = false;
        }

        // make rotation
        if(TransformationStatus.ROTATION_TRANSFORMATION)
        {
            g2d.rotate(Math.toRadians(RotateAction.ROTATE_ALPHA),RotateAction.ROTATE_X,
                    RotateAction.ROTATE_Y);
            TransformationStatus.ROTATION_TRANSFORMATION = false;
        }

        double scalebase_x = getWidth() + getWidth()/2-100;
        double scalebase_y = getHeight()/2-100;

        // make scaling
        if(TransformationStatus.SCALING_TRANSFORMATION)
        {
            // transformation
            AffineTransform scaleTransform = new AffineTransform(ScaleAction.SCALE_X,0,0,ScaleAction.SCALE_Y,
                    scalebase_x + ScaleAction.SCALE_XF *(1 - ScaleAction.SCALE_X), scalebase_y + ScaleAction.SCALE_YF * (1 - ScaleAction.SCALE_Y));
            g2d.setTransform(scaleTransform);

            TransformationStatus.SCALING_TRANSFORMATION = false;
        }

        // make reflection
        if(TransformationStatus.REFLECTION_TRANSFORMATION)
        {
                if(ReflectAction.TargetAxis)
                {
                    // reflection about x axis
                    g2d.setTransform(new AffineTransform(1,0,0,(ReflectAction.REFLECT_X_MINUS),scalebase_x,scalebase_y));
                }
                else
                {
                    // reflection about y axis
                    g2d.setTransform(new AffineTransform((ReflectAction.REFLECT_Y_MINUS), 0, 0, 1, scalebase_x, scalebase_y));
                }



            TransformationStatus.REFLECTION_TRANSFORMATION = false;
        }

        // save current Affine
        TransformationStatus.CURRENT_TRANSFORMATION = g2d.getTransform();
        shape.setGraphics2d(g2d);
        shape.draw();
    }

    public void setShape(GShape shape)
    {
        if(shape == null)
            this.shape = new CarShape();
        else
            this.shape = shape;

    }

}
