package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethods {


    public LinkedList<Integer> createLinkedList() {
        LinkedList<Integer> lList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            lList.add(i);
        }
        return lList;
    }
    public ArrayList<Integer> createArrayList() {
        ArrayList<Integer> lList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            lList.add(i);
        }
        return lList;
    }
    public void pickOperation(int operationType,List<Integer> a) {
        switch (operationType){
            case 1:
                addElements(a);
                break;
            case 2:
                getElements(a);
                break;
            case 3:
                removeElements(a);
                break;
        }
    }
    public void addElements(List<Integer> a) {
        for (int i = 0; i < 1000000; i++) {
            a.add(i);
        }
    }

    private void getElements(List<Integer> a){
        for (int i = 0;i < 10000; i++){
            a.get(i);
        }
    }

    private void removeElements(List<Integer> a){
        for (int i = 999999;i >= 0; i--){
            a.remove(i);
        }
    }

}
