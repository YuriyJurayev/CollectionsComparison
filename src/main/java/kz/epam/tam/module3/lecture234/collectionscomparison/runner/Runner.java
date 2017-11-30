package kz.epam.tam.module3.lecture234.collectionscomparison.runner;

import kz.epam.tam.module3.lecture234.collectionscomparison.measurements.PerformanceComparator;

public class Runner {
    public static void main(String[] args){

        PerformanceComparator comparator = new PerformanceComparator();
        comparator.compareListsPerformance();
        comparator.compareSetsPerformance();
        comparator.compareMapsPerformance();
    }
}
