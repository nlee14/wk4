package week4;
import java.util.HashMap;

public class EffectLibrary {
	
	private HashMap<String,Effect> EFFECTS;
	
	public boolean registerEffect(String name, Effect effect){
		EFFECTS.put(name, effect);
		return true;
	}
	
	public boolean deregisterEffect(String name){
		EFFECTS.remove(name);
		return true;
	}
	
	public Effect getEffect(String name){
		return EFFECTS.get(name);
	}
	
	public String[] availableEffects(){
		String[] availableEffects;
		
		availableEffects = EFFECTS.keySet().toArray(new String[0]);
		
		return availableEffects;
	}

}
