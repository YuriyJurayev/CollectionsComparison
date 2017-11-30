package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.HashMap;
import java.util.TreeMap;

public class MapMethods {

    public void pickOperation(int operationType) {
        switch (operationType){
            case 1:
                addElementsToHashMap();
                break;
            case 2:
                addElementsToTreeMap();
                break;
            case 3:
                addElementsToHashMap().containsValue("element to find");
                break;
            case 4:
                addElementsToTreeMap().containsValue("element to find");
                break;
            case 5:
                addElementsToHashMap().remove(1000000, "element to find");
                break;
            case 6:
                addElementsToTreeMap().remove(1000000, "element to find");
                break;
        }
    }
    private HashMap<Integer,String> addElementsToHashMap(){

        HashMap<Integer,String> map = new HashMap<>();
        for(int i = 0; i < 1000000; i++){
            map.put(i ,i + "1");
        }
        map.put(1000000,"element to find");
        return map;
    }


    private TreeMap<Integer,String> addElementsToTreeMap(){

        TreeMap<Integer,String> map = new TreeMap<>();
        for(int i = 0; i < 1000000; i++){
            map.put(i ,i + "1");
        }
        map.put(1000000,"element to find");
        return map;
    }
}
