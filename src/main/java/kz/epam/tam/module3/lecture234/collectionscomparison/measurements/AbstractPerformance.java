package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.utils.PerformancePrinter;

abstract class AbstractPerformance {

    abstract void switchStatement(int operationType);

    void executePerfomanceMeasurement(int operationType,String operation,String collection) {
        long start = System.currentTimeMillis();
        switchStatement(operationType);
        long end = System.currentTimeMillis();
        long difference = end - start;
        PerformancePrinter.printResult(operation,collection,difference);
    }
}
