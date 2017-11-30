package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.HashMap;
import java.util.TreeMap;

public class MapMethods {
    private HashMap<Integer,String> hMap = new HashMap<>();
    private TreeMap<Integer,String> tMap = new TreeMap<>();

    public void pickOperation(int operationType) {
        switch (operationType){
            case 1:
                addElementsToHashMap();
                break;
            case 2:
                addElementsToTreeMap();
                break;
            case 3:
                getElementsFromHashMap();
                break;
            case 4:
                getElementsFromTreeMap();
                break;
            case 5:
                removeElementsFromHashMap();
                break;
            case 6:
                removeElementsFromTreeMap();
                break;
        }
    }
    private void addElementsToHashMap(){
        for(int i = 0; i < 1000000; i++){
            hMap.put(i ,i + "1");
        }
    }

    private void addElementsToTreeMap(){
        for(int i = 0; i < 1000000; i++){
            tMap.put(i ,i + "1");
        }
    }
    private void getElementsFromHashMap(){
        addElementsToHashMap();
        for(int i = 0; i < 1000000; i++){
            hMap.containsKey(i);
        }
    }

    private void getElementsFromTreeMap(){
        addElementsToTreeMap();
        for(int i = 0; i < 1000000; i++){
            tMap.containsKey(i);
        }
    }
    private void removeElementsFromHashMap(){
        addElementsToHashMap();
        for(int i = 0; i < 1000000; i++){
            hMap.remove(i);
        }
    }

    private void removeElementsFromTreeMap(){
        addElementsToTreeMap();
        for(int i = 0; i < 1000000; i++){
            tMap.remove(i);
        }
    }
}
