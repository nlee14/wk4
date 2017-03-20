public class ImageLoader 
{
	private String fileName;
	
	public ImageLoader(String name)
	{
		fileName = name;
	}
	
	public void loadImage()
	{
		String doc;
		
		img = Image.IO.read(filename);
		doc = ImageDocument(img);
		return doc;
	}
}
