import java.awt.image.BufferedImage;
import java.util.Scanner;
public class ImageProcessingApp{
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        BufferedImage img = null;
        System.out.println("please enter path to load the image");
        String photopath;
        photopath = cin.nextLine();
        img = ImageLoad.BrowsePhoto(photopath);
        PhotoLab.img = img;
        if (!PhotoLab.Menu())
        {
            System.out.println("Please enter the path to export the image");
            String path;
            path = cin.nextLine();
            PhotoSave.Export(img, path);
        }
    }

    }


