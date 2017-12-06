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
        PerformancePrinter.printResult("Addition","ArrayList", performanceTimer.addToList(array));
        PerformancePrinter.printResult("Addition","LinkedList", performanceTimer.addToList(linked));
        PerformancePrinter.printAction("Searching","in","list");
        PerformancePrinter.printResult("Search","ArrayList", performanceTimer.searchInList(array));
        PerformancePrinter.printResult("Search","LinkedList", performanceTimer.searchInList(linked));
        PerformancePrinter.printAction("Deleting","from","list");
        PerformancePrinter.printResult("Deletion","ArrayList", performanceTimer.deleteFromList(array));
        PerformancePrinter.printResult("Deletion","LinkedList", performanceTimer.deleteFromList(linked));
    }
    public void compareSetsPerformance(){
        PerformancePrinter.printType("Set's");
        PerformancePrinter.printAction("Adding","to","set");
        SetMethods set = new SetMethods();
        Set<String> hash = set.createHashSet();
        Set<String> tree = set.createTreeSet();
        PerformancePrinter.printResult("Addition","HashSet", performanceTimer.addToSet(hash));
        PerformancePrinter.printResult("Addition","TreeSet", performanceTimer.addToSet(tree));
        PerformancePrinter.printAction("Searching","in","set");
        PerformancePrinter.printResult("Search","HashSet", performanceTimer.searchInSet(hash));
        PerformancePrinter.printResult("Search","TreeSet", performanceTimer.searchInSet(tree));
        PerformancePrinter.printAction("Deleting","from","set");
        PerformancePrinter.printResult("Deletion","HashSet", performanceTimer.deleteFromSet(hash));
        PerformancePrinter.printResult("Deletion","TreeSet", performanceTimer.deleteFromSet(tree));

    }
    public void compareMapsPerformance(){
        PerformancePrinter.printType("Map's");
        PerformancePrinter.printAction("Adding","to","map");
        MapMethods map = new MapMethods();
        Map<Integer,String> hash = map.createHashMap();
        Map<Integer,String> tree = map.createTreeMap();
        PerformancePrinter.printResult("Addition","HashMap", performanceTimer.addToMap(hash));
        PerformancePrinter.printResult("Addition","TreeSet", performanceTimer.addToMap(tree));
        PerformancePrinter.printAction("Searching","in","map");
        PerformancePrinter.printResult("Search","HashMap", performanceTimer.searchInMap(hash));
        PerformancePrinter.printResult("Search","TreeMap", performanceTimer.searchInMap(tree));
        PerformancePrinter.printAction("Deleting","from","map");
        PerformancePrinter.printResult("Deletion","HashMap", performanceTimer.deleteFromMap(hash));
        PerformancePrinter.printResult("Deletion","TreeMap", performanceTimer.deleteFromMap(tree));
    }
}
