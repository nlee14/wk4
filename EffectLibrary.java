import java.util.HashMap;

public class EffectLibrary {
	
	private HashMap<String,Effect> EFFECTS;
	
	public EffectLibrary()
	{
		EFFECTS = new HashMap<String,Effect>();
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
		String[] availableEffects = new String[EFFECTS.size()];
		
		availableEffects = EFFECTS.keySet().toArray(availableEffects);
		
		return availableEffects;
	}

}
