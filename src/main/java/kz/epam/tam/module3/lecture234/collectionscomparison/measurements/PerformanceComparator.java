package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.core.AbstractMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.core.ListMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.core.MapMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.core.SetMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.utils.PerformancePrinter;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PerformanceComparator {

    public void compareListsPerformance(){
        PerformancePrinter.printStartMsg();
        PerformancePrinter.printType("List's");
        PerformancePrinter.printAction("Adding","to","list");
        AbstractMethods<List<Integer>> list = new ListMethods();
        ListMethods methodL = new ListMethods();
        list.addition(methodL.createArrayList(), "Addition","ArrayList");
        list.addition(methodL.createLinkedList(), "Addition","LinkedList");
        PerformancePrinter.printAction("Searching","in","list");
        list.search(methodL.createArrayList(), "Search","ArrayList");
        list.search(methodL.createLinkedList(), "Search","LinkedList");
        PerformancePrinter.printAction("Deleting","from","list");
        list.deletion(methodL.createArrayList(), "Deletion","ArrayList");
        list.deletion(methodL.createLinkedList(), "Deletion","ArrayList");
    }
    public void compareSetsPerformance(){
        PerformancePrinter.printType("Set's");
        PerformancePrinter.printAction("Adding","to","set");
        AbstractMethods<Set<String>> set = new SetMethods();
        SetMethods methodS = new SetMethods();
        set.addition(methodS.createHashSet(), "Addition","HashSet");
        set.addition(methodS.createTreeSet(), "Addition","TreeSet");
        PerformancePrinter.printAction("Searching","in","set");
        set.search(methodS.createHashSet(), "Search","HashSet");
        set.search(methodS.createTreeSet(), "Search","TreeSet");
        PerformancePrinter.printAction("Deleting","from","set");
        set.deletion(methodS.createHashSet(), "Deletion","HashSet");
        set.deletion(methodS.createTreeSet(), "Deletion","TreeSet");
    }
    public void compareMapsPerformance(){
        PerformancePrinter.printType("Map's");
        PerformancePrinter.printAction("Adding","to","map");
        AbstractMethods<Map<Integer,String>> map = new MapMethods();
        MapMethods methodM = new MapMethods();
        map.addition(methodM.createHashMap(),"Addition","HashMap");
        map.addition(methodM.createTreeMap(),"Addition","TreeMap");
        PerformancePrinter.printAction("Searching","in","map");
        map.search(methodM.createHashMap(),"Search","HashMap");
        map.search(methodM.createTreeMap(),"Search","TreeMap");
        PerformancePrinter.printAction("Deleting","from","map");
        map.deletion(methodM.createHashMap(),"Deletion","HashMap");
        map.deletion(methodM.createTreeMap(),"Deletion","TreeMap");
    }
}
