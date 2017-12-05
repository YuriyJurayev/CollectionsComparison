package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import kz.epam.tam.module3.lecture234.collectionscomparison.utils.PerformancePrinter;

public abstract class AbstractMethods<T> {
    private long start;

    public abstract void addElements(T t);
    public abstract void getElements(T t);
    public abstract void removeElements(T t);

    public void addition(T t,String operation, String collectionName){
        start = System.currentTimeMillis();
        addElements(t);
        measureAndPrint(start,operation,collectionName);
    }

    public void search(T t,String operation, String collectionName){
        start = System.currentTimeMillis();
        getElements(t);
        measureAndPrint(start,operation,collectionName);
    }

    public void deletion(T t,String operation, String collectionName){
        start = System.currentTimeMillis();
        removeElements(t);
        measureAndPrint(start,operation,collectionName);
    }
    private void measureAndPrint(long start,String operation, String collectionName){
        long end = System.currentTimeMillis();
        long difference = end - start;
        PerformancePrinter.printResult(operation,collectionName,difference);
    }
}