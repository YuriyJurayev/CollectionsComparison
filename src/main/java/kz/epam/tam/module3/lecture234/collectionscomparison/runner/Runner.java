package kz.epam.tam.module3.lecture234.collectionscomparison.runner;

import kz.epam.tam.module3.lecture234.collectionscomparison.measurements.PerformanceComparator;
import kz.epam.tam.module3.lecture234.collectionscomparison.utils.PerformancePrinter;

public class Runner {
    public static void main(String[] args){

        PerformancePrinter.printStartMsg();
        PerformanceComparator comparator = new PerformanceComparator();
        comparator.compareListsPerformance();
        comparator.compareSetsPerformance();
        comparator.compareMapsPerformance();
    }
}
