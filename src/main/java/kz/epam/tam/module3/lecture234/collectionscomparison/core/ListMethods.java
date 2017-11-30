package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMethods {

    public void pickOperation(int operationType) {
        switch (operationType){
            case 1:
                addElementsToArrayList();
                break;
            case 2:
                addElementsToLinkedList();
                break;
            case 3:
                addElementsToArrayList().get(1000000);
                break;
            case 4:
                addElementsToLinkedList().get(1000000);
                break;
            case 5:
                addElementsToArrayList().remove(1000000);
                break;
            case 6:
                addElementsToLinkedList().remove(1000000);
                break;
        }
    }
    private ArrayList<String> addElementsToArrayList() {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add("1" + i);
        }
        list.add("element to find");
        return list;
    }


    private LinkedList<String> addElementsToLinkedList() {

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add("1" + i);
        }
        list.add("element to find");
        return list;
    }
}
