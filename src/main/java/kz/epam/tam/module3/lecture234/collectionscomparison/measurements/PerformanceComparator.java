package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.utils.PerformancePrinter;

public class PerformanceComparator {

    private PerformanceMeasurer measurer = new PerformanceMeasurer();

    public void compareListsPerformance(){
        PerformancePrinter.printStartMsg();
        PerformancePrinter.printType("List's");
        PerformancePrinter.printAction("Adding","to","list");
        measurer.measure(1,1,"Addition","ArrayList");
        measurer.measure(1,2,"Addition","LinkedList");
        PerformancePrinter.printAction("Searching","in","list");
        measurer.measure(1,3,"Search","ArrayList");
        measurer.measure(1,4,"Search","LinkedList");
        PerformancePrinter.printAction("Deleting","from","list");
        measurer.measure(1,5,"Deletion","ArrayList");
        measurer.measure(1,6,"Deletion","LinkedList");
    }
    public void compareSetsPerformance(){

        PerformancePrinter.printType("Set's");
        PerformancePrinter.printAction("Adding","to","set");
        measurer.measure(2,1,"Addition","HashSet");
        measurer.measure(2,2,"Addition","TreeSet");
        PerformancePrinter.printAction("Searching","in","set");
        measurer.measure(2,3,"Search","HashSet");
        measurer.measure(2,4,"Search","TreeSet");
        PerformancePrinter.printAction("Deleting","from","set");
        measurer.measure(2,5,"Deletion","HashSet");
        measurer.measure(2,6,"Deletion","TreeSet");

    }
    public void compareMapsPerformance(){
        PerformancePrinter.printType("Map's");
        PerformancePrinter.printAction("Adding","to","map");
        measurer.measure(3,1,"Addition","HashMap");
        measurer.measure(3,2,"Addition","TreeMap");
        PerformancePrinter.printAction("Searching","in","map");
        measurer.measure(3,3,"Search","HashMap");
        measurer.measure(3,4,"Search","TreeMap");
        PerformancePrinter.printAction("Deleting","from","map");
        measurer.measure(3,5,"Deletion","HashMap");
        measurer.measure(3,6,"Deletion","TreeMap");
    }
}
