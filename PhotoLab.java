import java.awt.image.BufferedImage;
import java.util.Scanner;

public class PhotoLab {
    public static BufferedImage  img = null;
    public static boolean Menu()
    {
        String choice;
        Scanner cin = new Scanner(System.in);
        PhotoCompare.TakeOldImage(img);
        boolean InApp=true;
        boolean ImageIsCropped =false;
        while(InApp)
        {
            System.out.println("Choose an action on your photo:");
            System.out.println("1.Apply Filter");
            System.out.println("2.Apply Adjustments");
            System.out.println("3.Crop photo");
            System.out.println("4.Add text");
            System.out.println("5.compare");
            System.out.println("6.Exit and Save");
            choice = cin.next();
            if (choice.equals("1"))
            {
                System.out.println("The Available Filters are:");
                System.out.println("1.Black & white");
                System.out.println("2.Blur");
                System.out.println("3.Fade");
                System.out.println("Enter your choice");
                choice = cin.next();
                if(choice.equals("1")) {
                    BlackAndWhite.Apply(PhotoLab.img);
                }
                else if (choice.equals("2"))
                {
                    Blur.Apply(PhotoLab.img);
                }
                else if (choice.equals("3"))
                {
                    Fade.Apply(PhotoLab.img);
                }
                else
                {
                    System.out.println("wrong choice");
                }

                System.out.println("filter applied");
            }
            else if (choice.equals("2")) {
                String Desired = null;
                System.out.println("The available Adjustments are:");
                System.out.println("1.Contrast");
                System.out.println("2.Brightness");
                System.out.println("3.Saturation");
                System.out.println("Enter your choice");
                Desired = cin.next();
                if (Desired.equals("1")) {
                    int value = 0;
                    boolean ValueInRange = false;
                    while (!ValueInRange) {
                        System.out.println("please enter decimal value between -100 and 100");
                        value = cin.nextInt();

                        if (value >= -100 && value <= 100) {
                            Contrast.Adjust(PhotoLab.img, value);
                            ValueInRange = true;
                        } else {
                            System.out.println("Value is out of range");
                        }
                    }
                } else if (Desired.equals("2")) {
                    float value = 0.0f;
                    boolean ValueInRange = false;
                    while (!ValueInRange) {
                        System.out.println("please enter decimal value between 0 and 2");
                        value = cin.nextFloat();

                        if (value >= 0.0f && value <= 2.0f) {
                            Brightness.Adjust(PhotoLab.img, value);
                            ValueInRange = true;
                        } else {
                            System.out.println("Value is out of range");
                            System.out.println("please enter decimal value between 0 and 2");
                        }
                    }
                } else if (Desired.equals("3")) {
                    boolean ValueInRange = false;
                    int value ;
                    while (!ValueInRange) {
                        System.out.println("please enter a value between 0 and 360");
                        value = cin.nextInt();
                        if (value >= 0 && value <= 360) {
                            Saturation.Adjust(PhotoLab.img, value);
                            ValueInRange = true;
                        } else {
                            System.out.println("Value is out of range");
                        }
                    }
                }

                                System.out.println("Adjustments applied");
            }
            else if (choice.equals("3"))
            {
                System.out.println("Please choose where to crop");
                System.out.println("1.Top Left");
                System.out.println("2.Top Right");
                System.out.println("3.Bottom Left");
                System.out.println("4.Bottom Right");
                String Desired;
                Desired=cin.next();

                if(Desired.equals("1"))
                {
                    SizeAdjustments.CropTo(img,0,0,img.getWidth()/2,img.getHeight()/2);
                }
                else if(Desired.equals("2"))
                {
                    SizeAdjustments.CropTo(img,img.getWidth()/2,0,img.getWidth()/2,img.getHeight()/2);
                }
                else if(Desired.equals("3"))
                {
                    SizeAdjustments.CropTo(img,0,img.getHeight()/2,img.getWidth()/2,img.getHeight()/2);
                }
                else if(Desired.equals("4"))
                {
                    SizeAdjustments.CropTo(img,img.getWidth()/2,img.getHeight()/2,img.getWidth()/2,img.getHeight()/2);
                }
                InApp=false;
                ImageIsCropped=true;

            }
            else if (choice.equals("4"))
            {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter the text to be added");
                String TextToAdd = input.nextLine();
                Text.AddText(TextToAdd,PhotoLab.img);
            }
            else if (choice.equals("5"))
            {
                PhotoCompare.Compare(img);
            }
            else if (choice.equals("6"))
            {
                InApp=false;
            }
            else
            {
                System.out.println("wrong choice");
            }
        }
        return ImageIsCropped;
    }
}