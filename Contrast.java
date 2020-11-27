import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

public class Contrast {
    public Contrast()
    {}
    public static void Adjust(BufferedImage image,int value)
    {
        RescaleOp rescaleOp = new RescaleOp(1f, value, null);
        rescaleOp.filter(image , image);
    }
}
