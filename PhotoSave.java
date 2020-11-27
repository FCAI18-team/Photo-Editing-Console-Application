import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class PhotoSave {

    public static void Export(BufferedImage image,String path)
    {
        try
        {
            File output_file = new File(path);
            ImageIO.write((RenderedImage) image, "png", output_file);

            System.out.println("Image saved");
        }
        catch(IOException e)
        {
            System.out.println("Error: "+e);
        }
    }
}
