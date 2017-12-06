package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.core.ListMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.core.MapMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.core.SetMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.utils.PerformancePrinter;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PerformanceComparator {

    private PerformanceTimer performanceTimer = new PerformanceTimer();

    public void compareListsPerformance(){
        PerformancePrinter.printType("List's");
        PerformancePrinter.printAction("Adding","to","list");
        ListMethods list = new ListMethods();
        List<Integer> array = list.createArrayList();
        List<Integer> linked = list.createLinkedList();
        PerformancePrinter.printResult("Addition","ArrayList", performanceTimer.addToListTime(array));
        PerformancePrinter.printResult("Addition","LinkedList", performanceTimer.addToListTime(linked));
        PerformancePrinter.printAction("Searching","in","list");
        PerformancePrinter.printResult("Search","ArrayList", performanceTimer.searchInListTime(array));
        PerformancePrinter.printResult("Search","LinkedList", performanceTimer.searchInListTime(linked));
        PerformancePrinter.printAction("Deleting","from","list");
        PerformancePrinter.printResult("Deletion","ArrayList", performanceTimer.deleteFromListTime(array));
        PerformancePrinter.printResult("Deletion","LinkedList", performanceTimer.deleteFromListTime(linked));
    }
    public void compareSetsPerformance(){
        PerformancePrinter.printType("Set's");
        PerformancePrinter.printAction("Adding","to","set");
        SetMethods set = new SetMethods();
        Set<String> hash = set.createHashSet();
        Set<String> tree = set.createTreeSet();
        PerformancePrinter.printResult("Addition","HashSet", performanceTimer.addToSetTime(hash));
        PerformancePrinter.printResult("Addition","TreeSet", performanceTimer.addToSetTime(tree));
        PerformancePrinter.printAction("Searching","in","set");
        PerformancePrinter.printResult("Search","HashSet", performanceTimer.searchInSetTime(hash));
        PerformancePrinter.printResult("Search","TreeSet", performanceTimer.searchInSetTime(tree));
        PerformancePrinter.printAction("Deleting","from","set");
        PerformancePrinter.printResult("Deletion","HashSet", performanceTimer.deleteFromSetTime(hash));
        PerformancePrinter.printResult("Deletion","TreeSet", performanceTimer.deleteFromSetTime(tree));

    }
    public void compareMapsPerformance(){
        PerformancePrinter.printType("Map's");
        PerformancePrinter.printAction("Adding","to","map");
        MapMethods map = new MapMethods();
        Map<Integer,String> hash = map.createHashMap();
        Map<Integer,String> tree = map.createTreeMap();
        PerformancePrinter.printResult("Addition","HashMap", performanceTimer.addToMapTime(hash));
        PerformancePrinter.printResult("Addition","TreeSet", performanceTimer.addToMapTime(tree));
        PerformancePrinter.printAction("Searching","in","map");
        PerformancePrinter.printResult("Search","HashMap", performanceTimer.searchInMapTime(hash));
        PerformancePrinter.printResult("Search","TreeMap", performanceTimer.searchInMapTime(tree));
        PerformancePrinter.printAction("Deleting","from","map");
        PerformancePrinter.printResult("Deletion","HashMap", performanceTimer.deleteFromMapTime(hash));
        PerformancePrinter.printResult("Deletion","TreeMap", performanceTimer.deleteFromMapTime(tree));
    }
}
