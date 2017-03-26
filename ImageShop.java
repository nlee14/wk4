package workshop3;

import java.io.IOException;






public class ImageShop {
	
	private ImageDocument image;
	
	
	
	public static void main(String args[])throws IOException{

		    ImageShop is = new ImageShop();
	        is.processImage("beach.jpg", is.processTransforms(new String[]{"grayscale"}));
	        is.write("beachgray.jpg");
	}
	
	
	
	  private void write(String filename) throws IOException{
	        image.renderImage(filename);
	    }


	private  Effect[] processTransforms(String args[]) {
		Effect[] es = new Effect[args.length];
        for(int i=0;i<args.length;i++){
            es[i] = EffectLibrary.getEffect(args[i]);
        }
        return es;
		
	}
	
    private void  processImage(String image ,  Effect[] transforms) throws IOException{
    	   ImageLoader il = new ImageLoader(image);
           this.image = il.loadImage();
           this.image.addTransformations(transforms);		
	}

    
    
    
}
