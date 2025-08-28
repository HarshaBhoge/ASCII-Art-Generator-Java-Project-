import javax.imageio.ImageIO; // for reading image files
import java.awt.*;
import java.awt.image.BufferedImage;// for image processing
import java.io.File;  // for file handling
import java.io.IOException; // for file handling exceptions

public class code {

    public static void main(String[] args) {

        //It will run the try block until it found the error .. if error found then it jump to catch i,e it will show an error
        try {
            // Step 1: we want to read the file and save it as an image
            BufferedImage image = ImageIO.read(new File("sample3.png"));

            // reassign the width
            int newWidth=80;
            // (int) newHeight= newWidth/oldWidth * oldHeight
            int newHeight= (int) Math.round((double)newWidth/image.getWidth() * image.getHeight());

            // blank canvas
            BufferedImage resizedImage=new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
            resizedImage.getGraphics().drawImage(image.getScaledInstance(newWidth, newHeight, BufferedImage.SCALE_SMOOTH), 0,0,null);

            convertImageToAscii(resizedImage);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    private static void convertImageToAscii(BufferedImage image){
        int width = image.getWidth();
        int height = image.getHeight();

        char[] asciiChar = {' ', '.', '*', ':', 'o', '&', '8', '#', '@'};




        // nested loop that iterates through every pixel in the image

        //first we fill 1st row and then jump to next row
        for (int col=0;col<height;col+=2){
            for ( int row=0; row<width;row++){
              int pixel=image.getRGB(row,col); //Red top 8 bits, green middle 8 bits, blue lower 8 bits
              int grayscale = getGrayscale(pixel);

              // map the grayscale to an Ascii character
                int index = (int) Math.round((double)(grayscale/255.0) * (asciiChar.length-1));
                System.out.print(asciiChar[index]);
            }
            System.out.println();// print a new line after every row
        }
    }
    private static int getGrayscale(int pixel){
        Color color = new Color(pixel);
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();

        //0xff = 11111111
        red = (pixel >> 16) & 0xff;
        green = (pixel >> 8) & 0xff;
        blue = pixel & 0xff;

        // Luminosity Method
        return (int)  (0.21 * red + 0.72 * green + 0.07 * blue);
    }
}

