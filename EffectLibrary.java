package example1;

import java.util.HashMap;


public class EffectLibrary {
    private static final HashMap<String,Effect> EFFECTS;
    
    static {
        EFFECTS = new HashMap<>();
        registerEffect("grayscale",new GrayScaleEffect());
    }
    
    public static boolean registerEffect(String name, Effect effect){
        EFFECTS.put(name, effect);
        return true;
    }
    public static boolean deregisterEffect(String name){
        EFFECTS.remove(name);
        return true;
    }
    public static Effect getEffect(String name){
        return EFFECTS.get(name);
    }
    public static String[] availableEffects(){
        return EFFECTS.keySet().toArray(new String[0]);
    }
}