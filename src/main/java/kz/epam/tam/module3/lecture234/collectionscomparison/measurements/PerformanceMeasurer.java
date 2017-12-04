package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.core.ListMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.core.MapMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.core.SetMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.utils.PerformancePrinter;

import java.util.ArrayList;
import java.util.LinkedList;

class PerformanceMeasurer {

    void measure(int collectionType,int operationType,String operation,String collection) {
        ListMethods list = new ListMethods();
        ArrayList<Integer> aList = list.addElementsToArrayList();
        LinkedList<Integer> lList = list.addElementsToLinkedList();
        long start = System.currentTimeMillis();
        switch (collectionType){
            case 1:
                list.pickOperation(operationType,aList,lList);
                break;
            case 2:
                SetMethods set = new SetMethods();
                set.pickOperation(operationType);
                break;
            case 3:
                MapMethods map = new MapMethods();
                map.pickOperation(operationType);
                break;
        }
        long end = System.currentTimeMillis();
        long difference = end - start;
        PerformancePrinter.printResult(operation,collection,difference);
    }
}
