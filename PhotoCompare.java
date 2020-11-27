import java.awt.image.BufferedImage;

public class PhotoCompare {
    public PhotoCompare()
    {

    }
    private static BufferedImage oldimage=null;
    public static void TakeOldImage( BufferedImage IMG)
    {
        oldimage= new BufferedImage(IMG.getWidth(),IMG.getHeight(),BufferedImage.TYPE_INT_ARGB);
        oldimage= IMG;
        PhotoSave.Export(oldimage,"C:\\Users\\"+System.getProperty("user.name")+"\\Pictures\\Screenshots\\compare\\Screenshot (33).png");
    }
    public static void Compare(BufferedImage NewImage)
    {
        PhotoSave.Export(NewImage,"C:\\Users\\"+System.getProperty("user.name")+"\\Pictures\\Screenshots\\compare\\compared.png");
    }
}