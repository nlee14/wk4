package workshop3;


import java.awt.image.BufferedImage;


public class GrayScaleEffect implements Effect {
	

	
	public BufferedImage applyEffect(BufferedImage original) {
		
		BufferedImage newImage = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
		newImage.getGraphics().drawImage(original, 0, 0, null);
        return newImage;
		
	}
	
	

}
