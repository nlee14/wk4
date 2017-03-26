package workshop3;

import java.util.HashMap;



public class EffectLibrary {
	
	private static HashMap<String,Effect> EFFECTS;
	
	 static {
		EFFECTS = new HashMap<>();
		registerEffect("grayscale",new GrayScaleEffect());
	}
	
	public static boolean registerEffect(String name, Effect effect){
		if(EFFECTS.containsKey(name)){
			return false;
		}
		EFFECTS.put(name, effect);
		return true;
	}
	
	public static boolean deregisterEffect(String name){
		if(!EFFECTS.containsKey(name)){
			return false;
		}
		EFFECTS.remove(name);
		return true;
	}
	
	public static Effect getEffect(String name){
		return EFFECTS.get(name);
	}
	
	public static String[] availableEffects(){
		String[] availableEffects = new String[EFFECTS.size()];
		
		availableEffects = EFFECTS.keySet().toArray(availableEffects);
		
		return availableEffects;
	}

}