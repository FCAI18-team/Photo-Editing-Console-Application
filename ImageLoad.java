import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoad
{

    public static BufferedImage BrowsePhoto(String PhotoPath)
    {
        int width = 963;
        int height = 640;
        BufferedImage image = null;
        try
        {
             File input_file = new File(PhotoPath);
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            image = ImageIO.read(input_file);
            System.out.println("Image Loaded");
        }
        catch(IOException e)
        {
            System.out.println("Error: "+e);
        }

        return image;
    }

}
