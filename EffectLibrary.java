
import java.util.HashMap;

public class EffectLibrary {
	
	private HashMap<String,Effect> EFFECTS;
	
	public void initialise(){
		
	}
	
	public boolean registerEffect(String name, Effect effect){
		if(EFFECTS.containsKey(name)){
			return false;
		}
		EFFECTS.put(name, effect);
		return true;
	}
	
	public boolean deregisterEffect(String name){
		if(!EFFECTS.containsKey(name)){
			return false;
		}
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
