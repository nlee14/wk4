public class ImageLoader 
{
	private String fileName;
	
	public ImageLoader(String name)
	{
		fileName = name;
	}
	
	public ImageDocument loadImage()
	{
		String doc;
		
		ImageDocument img = Image.IO.read(filename);
		ImageDocument doc = new ImageDocument(img);
		return doc;
	}
}
