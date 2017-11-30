package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMethods {

    private ArrayList<Integer> aList = new ArrayList<>();
    private LinkedList<Integer> lList = new LinkedList<>();

    public void pickOperation(int operationType) {
        switch (operationType){
            case 1:
                addElementsToArrayList();
                break;
            case 2:
                addElementsToLinkedList();
                break;
            case 3:
                getElementsFromArrayList();
                break;
            case 4:
                getElementsFromLinkedList();
                break;
            case 5:
                removeElementsFromArrayList();
                break;
            case 6:
                removeElementsFromLinkedList();
                break;
        }
    }
    private void addElementsToArrayList() {
        for (int i = 0; i < 1000000; i++) {
            aList.add(i);
        }
    }

    private void addElementsToLinkedList() {
        for (int i = 0; i < 1000000; i++) {
            lList.add(i);
        }
    }

    private void getElementsFromArrayList(){
        addElementsToArrayList();
        for (int i = 0;i < 10000; i++){
            aList.get(i);
        }
    }
    private void getElementsFromLinkedList(){
        addElementsToLinkedList();
        for (int i = 0;i < 10000; i++){
            lList.get(i);
        }
    }
    private void removeElementsFromArrayList(){
        addElementsToArrayList();
        for (int i = 999999;i >= 0; i--){
            aList.remove(i);
        }
    }
    private void removeElementsFromLinkedList(){
        addElementsToLinkedList();
        for (int i = 999999;i >= 0; i--){
            lList.remove(i);
        }
    }

}
