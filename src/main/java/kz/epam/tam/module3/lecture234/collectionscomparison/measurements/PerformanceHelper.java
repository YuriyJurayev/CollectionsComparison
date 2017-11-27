package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.utils.PerformancePrinter;

public class PerformanceHelper {

    public void compareListsPerformance(){
        PerformancePrinter.printAppStartMsg();
        PerformancePrinter.printPerfomanceType("List's");
        PerformancePrinter.printPerfomanceAction("Adding","list");
        ListPerformance listPerformance = new ListPerformance();
        listPerformance.executePerfomanceMeasurement(1,"Addition","ArrayList");
        listPerformance.executePerfomanceMeasurement(2,"Addition","LinkedList");
        PerformancePrinter.printPerfomanceAction("Searching","list");
        listPerformance.executePerfomanceMeasurement(3,"Search","ArrayList");
        listPerformance.executePerfomanceMeasurement(4,"Search","LinkedList");
        PerformancePrinter.printPerfomanceAction("Deleting","list");
        listPerformance.executePerfomanceMeasurement(5,"Deletion","ArrayList");
        listPerformance.executePerfomanceMeasurement(6,"Deletion","LinkedList");
    }
    public void compareSetsPerformance(){

        PerformancePrinter.printPerfomanceType("Set's");
        PerformancePrinter.printPerfomanceAction("Adding","set");
        SetPerformance setPerformance = new SetPerformance();
        setPerformance.executePerfomanceMeasurement(1,"Addition","HashSet");
        setPerformance.executePerfomanceMeasurement(2,"Addition","TreeSet");
        PerformancePrinter.printPerfomanceAction("Searching","set");
        setPerformance.executePerfomanceMeasurement(3,"Search","HashSet");
        setPerformance.executePerfomanceMeasurement(4,"Search","TreeSet");
        PerformancePrinter.printPerfomanceAction("Deleting","set");
        setPerformance.executePerfomanceMeasurement(5,"Deletion","HashSet");
        setPerformance.executePerfomanceMeasurement(6,"Deletion","TreeSet");

    }
    public void compareMapsPerformance(){
        PerformancePrinter.printPerfomanceType("Map's");
        PerformancePrinter.printPerfomanceAction("Adding","map");
        MapPerformance mapPerformance = new MapPerformance();
        mapPerformance.executePerfomanceMeasurement(1,"Addition","HashMap");
        mapPerformance.executePerfomanceMeasurement(2,"Addition","TreeMap");
        PerformancePrinter.printPerfomanceAction("Searching","map");
        mapPerformance.executePerfomanceMeasurement(3,"Search","HashMap");
        mapPerformance.executePerfomanceMeasurement(4,"Search","TreeMap");
        PerformancePrinter.printPerfomanceAction("Deleting","map");
        mapPerformance.executePerfomanceMeasurement(5,"Deletion","HashMap");
        mapPerformance.executePerfomanceMeasurement(6,"Deletion","TreeMap");
    }
}
