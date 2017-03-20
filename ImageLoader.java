public class ImageLoader 
{
	private String fileName;
	public String doc;
	
	public ImageLoader(String name)
	{
		fileName = name;
	}
	
	public void loadImage()
	{
		img = Image.IO.read(filename);
		doc = ImageDocument(img);
		return doc;
	}
}
