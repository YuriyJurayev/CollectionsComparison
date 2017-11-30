package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.HashSet;
import java.util.TreeSet;

public class SetMethods {

    private HashSet<String> hSet = new HashSet<>();
    private TreeSet<String> tSet = new TreeSet<>();

    public void pickOperation(int operationType) {
        switch (operationType){
            case 1:
                addElementsToHashSet();
                break;
            case 2:
                addElementsToTreeSet();
                break;
            case 3:
                getElementsFromHashSet();
                break;
            case 4:
                getElementsFromTreeSet();
                break;
            case 5:
                removeElementsFromHashSet();
                break;
            case 6:
                removeElementsFromTreeSet();
                break;
        }
    }

    private void addElementsToHashSet(){
        for(int i = 0; i < 1000000; i++){
            hSet.add("1" + i);
        }
    }

    private void addElementsToTreeSet(){
        for(int i = 0; i < 1000000; i++){
            tSet.add("1" + i);
        }
    }
    private void getElementsFromHashSet(){
        addElementsToHashSet();
        for(int i = 0; i < 1000000; i++){
            hSet.contains("1" + i);
        }
    }

    private void getElementsFromTreeSet(){
        addElementsToTreeSet();
        for(int i = 0; i < 1000000; i++){
            tSet.contains("1" + i);
        }
    }
    private void removeElementsFromHashSet(){
        addElementsToHashSet();
        for(int i = 0; i < 1000000; i++){
            hSet.remove("1" + i);
        }
    }

    private void removeElementsFromTreeSet(){
        addElementsToTreeSet();
        for(int i = 0; i < 1000000; i++){
            tSet.remove("1" + i);
        }
    }
}
