package workshop3;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




public class ImageDocument {
	
	public BufferedImage image;
	public List<Effect> transforms;
	public String outputFile;
	
	public ImageDocument(BufferedImage img) throws IOException {
		this.image = img;
		transforms = new ArrayList<>();
	}
	
	public boolean addTransform(Effect t) {
		
		return transforms.add(t) ;
	}
	
	public boolean addTransformations(Effect[] trans) {
		
		return transforms.addAll(Arrays.asList(trans));
	}
	
	public void renderImage(String outFile) throws IOException {
		
		  BufferedImage current = image;
	        for(Effect e : transforms){
	            current = e.applyEffect(current);
	        }
	        ImageLoader.writeImage(current, outFile);
		//effect.applyEffect(image);
		//writeImage(image, outputFile);
	}

}