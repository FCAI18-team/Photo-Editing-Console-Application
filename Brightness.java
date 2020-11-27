import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

public class Brightness{
    public Brightness()
    {

    }
    public static void Adjust(BufferedImage image, float value)
    {
        RescaleOp rescaleOp = new RescaleOp(value , 0, null);
        rescaleOp.filter(image , image);
    }
}
