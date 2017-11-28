package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.utils.PerformancePrinter;

public class PerformanceHelper {

    public void compareListsPerformance(){
        PerformancePrinter.printStartMsg();
        PerformancePrinter.printType("List's");
        PerformancePrinter.printAction("Adding","to","list");
        ListPerformance listPerformance = new ListPerformance();
        listPerformance.measure(1,"Addition","ArrayList");
        listPerformance.measure(2,"Addition","LinkedList");
        PerformancePrinter.printAction("Searching","in","list");
        listPerformance.measure(3,"Search","ArrayList");
        listPerformance.measure(4,"Search","LinkedList");
        PerformancePrinter.printAction("Deleting","from","list");
        listPerformance.measure(5,"Deletion","ArrayList");
        listPerformance.measure(6,"Deletion","LinkedList");
    }
    public void compareSetsPerformance(){

        PerformancePrinter.printType("Set's");
        PerformancePrinter.printAction("Adding","to","set");
        SetPerformance setPerformance = new SetPerformance();
        setPerformance.measure(1,"Addition","HashSet");
        setPerformance.measure(2,"Addition","TreeSet");
        PerformancePrinter.printAction("Searching","in","set");
        setPerformance.measure(3,"Search","HashSet");
        setPerformance.measure(4,"Search","TreeSet");
        PerformancePrinter.printAction("Deleting","from","set");
        setPerformance.measure(5,"Deletion","HashSet");
        setPerformance.measure(6,"Deletion","TreeSet");

    }
    public void compareMapsPerformance(){
        PerformancePrinter.printType("Map's");
        PerformancePrinter.printAction("Adding","to","map");
        MapPerformance mapPerformance = new MapPerformance();
        mapPerformance.measure(1,"Addition","HashMap");
        mapPerformance.measure(2,"Addition","TreeMap");
        PerformancePrinter.printAction("Searching","in","map");
        mapPerformance.measure(3,"Search","HashMap");
        mapPerformance.measure(4,"Search","TreeMap");
        PerformancePrinter.printAction("Deleting","from","map");
        mapPerformance.measure(5,"Deletion","HashMap");
        mapPerformance.measure(6,"Deletion","TreeMap");
    }
}
