package workshop3;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;





public class ImageLoader 
{
	private String fileName;
	
	public ImageLoader(String file)
	{
		this.fileName = file;
	}
	
	public ImageDocument loadImage()throws IOException{
		 BufferedImage bufferedImage;
		 bufferedImage = ImageIO.read(new File(fileName));
	     return new ImageDocument(bufferedImage);
	}
	
	public static void writeImage(BufferedImage img, String outputFile)throws IOException{
		File out = new File(outputFile);
        String type = "jpg";
        int dot = outputFile.lastIndexOf('.');
        if(dot!=-1){
            type = outputFile.substring(dot+1);
        }
        ImageIO.write(img, type, out);
    }
		
		

	

}