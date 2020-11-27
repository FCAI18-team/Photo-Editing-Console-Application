import java.awt.image.BufferedImage;
import java.util.Scanner;

public class SizeAdjustments {

    public SizeAdjustments()
    {}
   public static boolean CropTo(BufferedImage image,int x,int y, int width, int height)
    {
        Scanner cin = new Scanner(System.in);
       BufferedImage img1 =image.getSubimage(x,y,width,height);
        System.out.println("Please enter the path to export the image");
        String path;
        path = cin.nextLine();
        PhotoSave.Export(img1, path);
    return true;
    }
}
