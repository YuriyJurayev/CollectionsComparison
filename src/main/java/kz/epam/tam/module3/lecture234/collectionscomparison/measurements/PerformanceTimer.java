package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.core.ListMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.core.MapMethods;
import kz.epam.tam.module3.lecture234.collectionscomparison.core.SetMethods;

import java.util.List;
import java.util.Map;
import java.util.Set;

class PerformanceTimer {

    private long start;
    private long end;
    private long difference;
    private ListMethods list = new ListMethods();
    private SetMethods set = new SetMethods();
    private MapMethods map = new MapMethods();

    long addToList(List<Integer> l){
        start = System.currentTimeMillis();
        list.addElements(l);
        end = System.currentTimeMillis();
        difference = end - start;
        return difference;
    }

    long searchInList(List<Integer> l){
        start = System.currentTimeMillis();
        list.getElements(l);
        end = System.currentTimeMillis();
        difference = end - start;
        return difference;
    }

    long deleteFromList(List<Integer> l){
        start = System.currentTimeMillis();
        list.removeElements(l);
        end = System.currentTimeMillis();
        difference = end - start;
        return difference;
    }
    long addToSet(Set<String> s){
        start = System.currentTimeMillis();
        set.addElements(s);
        end = System.currentTimeMillis();
        difference = end - start;
        return difference;
    }

    long searchInSet(Set<String> s){
        start = System.currentTimeMillis();
        set.getElements(s);
        end = System.currentTimeMillis();
        difference = end - start;
        return difference;
    }

    long deleteFromSet(Set<String> s){
        start = System.currentTimeMillis();
        set.removeElements(s);
        end = System.currentTimeMillis();
        difference = end - start;
        return difference;
    }
    long addToMap(Map<Integer,String> m){
        start = System.currentTimeMillis();
        map.addElements(m);
        end = System.currentTimeMillis();
        difference = end - start;
        return difference;
    }

    long searchInMap(Map<Integer,String> m){
        start = System.currentTimeMillis();
        map.getElements(m);
        end = System.currentTimeMillis();
        difference = end - start;
        return difference;
    }

    long deleteFromMap(Map<Integer,String> m){
        start = System.currentTimeMillis();
        map.removeElements(m);
        end = System.currentTimeMillis();
        difference = end - start;
        return difference;
    }

}