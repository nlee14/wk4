import java.io.IOException;

public class ImageShop 
{
	
	private ImageDocument image;
	
	
	public static void main(String args[]) throws IOException
	{
		
		ImageLoader loader = new ImageLoader("Image Loader");
		ImageDocument doc = loader.loadImage();
		EffectLibrary library = new EffectLibrary();
		
		GrayScaleEffect grayscale = new GrayScaleEffect();
		library.registerEffect("grayscale", grayscale);
		Effect effect = library.getEffect("grayscale");
		
		doc.addTransform(effect);
		doc.renderImage(effect);
	}
}
