package GrayScale;
	
import java.awt.*;

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
		
		ImageDocument img = Image.IO.read(filename);
		ImageDocument doc = new ImageDocument(img);
		return doc;
	}
}
