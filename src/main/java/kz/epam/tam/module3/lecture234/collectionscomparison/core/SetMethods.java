package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.HashSet;
import java.util.TreeSet;

public class SetMethods {

    public void pickOperation(int operationType) {
        switch (operationType){
            case 1:
                addElementsToHashSet();
                break;
            case 2:
                addElementsToTreeSet();
                break;
            case 3:
                addElementsToHashSet().contains("element to find");
                break;
            case 4:
                addElementsToTreeSet().contains("element to find");
                break;
            case 5:
                addElementsToHashSet().remove("element to find");
                break;
            case 6:
                addElementsToTreeSet().remove("element to find");
                break;
        }
    }

    private HashSet<String> addElementsToHashSet(){

        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < 1000000; i++){
            set.add("1" + i);
        }
        set.add("element to find");
        return set;
    }

    private TreeSet<String> addElementsToTreeSet(){

        TreeSet<String> set = new TreeSet<>();
        for(int i = 0; i < 1000000; i++){
            set.add("1" + i);
        }
        set.add("element to find");
        return set;
    }
}
