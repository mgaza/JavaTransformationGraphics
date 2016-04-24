package Model;

import java.awt.geom.AffineTransform;

public class TransformationStatus
{
    public static AffineTransform CURRENT_TRANSFORMATION = null;
    public static boolean TRANSLATION_TRANSFORMATION = false;
    public static boolean ROTATION_TRANSFORMATION = false;
    public static boolean SCALING_TRANSFORMATION = false;
    public static boolean REFLECTION_TRANSFORMATION = false;
}
