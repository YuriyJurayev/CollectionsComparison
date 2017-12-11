package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethods {

    private final int FIRST_INDEX = 0;
    private final int LAST_INDEX = 10000;

    public LinkedList<Integer> createLinkedList() {
        LinkedList<Integer> lList = new LinkedList<>();
        addElements(lList);
        return lList;
    }
    public ArrayList<Integer> createArrayList() {
        ArrayList<Integer> aList = new ArrayList<>();
        addElements(aList);
        return aList;
    }

    public void addElements(List<Integer> l) {
        for (int i = FIRST_INDEX; i < 1000000; i++) {
            l.add(i);
        }
    }

    public void getElements(List<Integer> l){
        for (int i = FIRST_INDEX;i < LAST_INDEX; i++){
            l.get(i);
        }
    }

    public void removeElements(List<Integer> l){
        for (int i = FIRST_INDEX; i < LAST_INDEX; i++){
            l.remove(i);
        }
    }
}
