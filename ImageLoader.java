import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageLoader 
{
	private String fileName;
	
	public ImageLoader(String name)
	{
		fileName = name;
	}
	
	public ImageDocument loadImage()
	{
		ImageDocument doc;
		
		File img = new File(fileName);
		
		try {
			doc = new ImageDocument(img);
		}
		catch(Exception e) {
			System.out.println("error");
			return null;
		}
		
		return doc;
	}
}
