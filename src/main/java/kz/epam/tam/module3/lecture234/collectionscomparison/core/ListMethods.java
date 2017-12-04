package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMethods {


    public void pickOperation(int operationType,ArrayList<Integer> a,LinkedList<Integer> l) {
        switch (operationType){
            case 1:
                addElementsToArrayList();
                break;
            case 2:
                addElementsToLinkedList();
                break;
            case 3:
                getElementsFromArrayList(a);
                break;
            case 4:
                getElementsFromLinkedList(l);
                break;
            case 5:
                removeElementsFromArrayList(a);
                break;
            case 6:
                removeElementsFromLinkedList(l);
                break;
        }
    }
    public ArrayList<Integer> addElementsToArrayList() {
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            aList.add(i);
        }
        return aList;
    }

    public LinkedList<Integer> addElementsToLinkedList() {
        LinkedList<Integer> lList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            lList.add(i);
        }
        return lList;
    }

    private void getElementsFromArrayList(ArrayList<Integer> a){

        for (int i = 0;i < 10000; i++){
            a.get(i);
        }
    }
    private void getElementsFromLinkedList(LinkedList<Integer> l){
        for (int i = 0;i < 10000; i++){
            l.get(i);
        }
    }
    private void removeElementsFromArrayList(ArrayList<Integer> a){
        for (int i = 999999;i >= 0; i--){
            a.remove(i);
        }
    }
    private void removeElementsFromLinkedList(LinkedList<Integer> l){
        for (int i = 999999;i >= 0; i--){
            l.remove(i);
        }
    }

}
