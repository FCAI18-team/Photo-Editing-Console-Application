import java.awt.Graphics;
import java.awt.image.BufferedImage;
public class Text {

    //we will use a library for font and color

   public Text()
    {

    }
    public static void AddText(String text,BufferedImage image)
    {
        Graphics g = image.getGraphics();
        g.setFont(g.getFont().deriveFont(30f));
        g.drawString(text, image.getHeight()/2, image.getWidth()/2);
        g.dispose();
    }
}
