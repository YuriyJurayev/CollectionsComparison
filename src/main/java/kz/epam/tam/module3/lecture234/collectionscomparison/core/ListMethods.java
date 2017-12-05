package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethods extends AbstractMethods<List<Integer>>{

    public LinkedList<Integer> createLinkedList() {
        LinkedList<Integer> lList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            lList.add(i);
        }
        return lList;
    }
    public ArrayList<Integer> createArrayList() {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            aList.add(i);
        }
        return aList;
    }

    public void addElements(List<Integer> l) {
        for (int i = 0; i < 1000000; i++) {
            l.add(i);
        }
    }

    public void getElements(List<Integer> l){
        for (int i = 0;i < 10000; i++){
            l.get(i);
        }
    }

    public void removeElements(List<Integer> l){
        for (int i = 999999;i >= 0; i--){
            l.remove(i);
        }
    }
}
