import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.color.*;

public class Saturation {
    public Saturation()
    {

    }
    public static void Adjust(BufferedImage image,int iHUE)
    {
        int width = image.getWidth();
        int height = image.getHeight();
        float hue = iHUE/360.0f;
        for(int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int RGB = image.getRGB(x,y);
                int R = (RGB >> 16) & 0xff;
                int G = (RGB >> 8) & 0xff;
                int B = (RGB) & 0xff;
                float HSV[]=new float[3];
                Color.RGBtoHSB(R,G,B,HSV);
                image.setRGB(x,y, Color.getHSBColor(hue,HSV[1],HSV[2]).getRGB());
            }
            }
        }
    }




