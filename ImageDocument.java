package grayscale;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javafx.scene.effect.Effect;

public class ImageDocument {
	
	public BufferedImage image;
	public Effect[] transforms;
	public String outputFile;
	
	public ImageDocument(File img) throws IOException {
		this.image =ImageIO.read(img);
	}
	
	public boolean addTransform(Effect t) {
		transforms[transforms.length]=t;
		return true;
	}
	
	public boolean addTransformations(Effect[] trans) {
		transforms = trans;
		return true;
	}
	
	public void renderImage(Effect effect) throws IOException {
		effect.applyEffect(image);
		writeImage(image, outputFile);
	}
	
	public void writeImage(BufferedImage image, String output) throws IOException {
		File ouptut = new File("grayscale.jpg");
        ImageIO.write(image, "jpg", ouptut);
	}
	
	

}
