package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods extends AbstractMethods<Map<Integer,String>>{

    public Map<Integer,String> createHashMap(){
        HashMap<Integer,String> hMap = new HashMap<>();
        for(int i = 0; i < 1000000; i++){
            hMap.put(i ,i + "1");
        }
        return hMap;
    }
    public Map<Integer,String> createTreeMap(){
        TreeMap<Integer,String> tMap = new TreeMap<>();
        for(int i = 0; i < 1000000; i++){
            tMap.put(i ,i + "1");
        }
        return tMap;
    }

    public void addElements(Map<Integer,String> m){
        for(int i = 0; i < 1000000; i++){
            m.put(i ,i + "1");
        }
    }

    public void getElements(Map<Integer,String> m){
        for(int i = 0; i < 1000000; i++){
            m.containsKey(i);
        }
    }
    public void removeElements(Map<Integer,String> m){
        for(int i = 0; i < 1000000; i++){
            m.remove(i);
        }
    }
}
