package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.core.ListMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.core.MapMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.core.SetMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.utils.PerformancePrinter;

import java.util.List;

class PerformanceMeasurer {

    private ListMethods list = new ListMethods();
    private List<Integer> coll;

    void measure(int collectionType, int operationType, String operation, String collectionName) {
        createCollections(collectionType,collectionName);
        long start = System.currentTimeMillis();
        switch (collectionType){
            case 1:
                list.pickOperation(operationType,coll);
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
        PerformancePrinter.printResult(operation,collectionName,difference);
    }

    private void createCollections(int collectionType,String collection){

        switch (collectionType){
            case 1:
                if(collection.equals("ArrayList"))
                    coll = list.createArrayList();
                else if(collection.equals("LinkedList")){
                    coll = list.createLinkedList();
                }
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
