package grayscale;

import javafx.scene.effect.Effect;

public class ImageShop {
	
	private ImageDocument image;
	
	
	public void MAIN(String args[]){
		
		Loader loader = new Loader(fileName);
		ImageDocument doc = loader.loadImage();
		
		EffectLibrary.initialise();
		Effect effect=EffectLibrary.getEffect("grayscale");
		
		image outputFile = output;
				
		doc.addTransform(effect);
		doc.renderImage(effect);
		
	}
	
	private Effect[] processTranstorms(String args[]){
		return null;
		
	}
	
    private void  processImage(String Image ,  Effect[] transforms){
		
	}

}