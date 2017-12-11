package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    private final int FIRST_INDEX = 0;
    private final int LAST_INDEX = 1000000;

    public Map<Integer,String> createHashMap(){
        HashMap<Integer,String> hMap = new HashMap<>();
        addElements(hMap);
        return hMap;
    }
    public Map<Integer,String> createTreeMap(){
        TreeMap<Integer,String> tMap = new TreeMap<>();
        addElements(tMap);
        return tMap;
    }

    public void addElements(Map<Integer,String> m){
        for(int i = FIRST_INDEX; i < LAST_INDEX; i++){
            m.put(i ,i + "1");
        }
    }

    public void getElements(Map<Integer,String> m){
        for(int i = FIRST_INDEX; i < LAST_INDEX; i++){
            m.containsKey(i);
        }
    }
    public void removeElements(Map<Integer,String> m){
        for(int i = FIRST_INDEX; i < LAST_INDEX; i++){
            m.remove(i);
        }
    }
}
