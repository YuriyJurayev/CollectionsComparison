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
    private ListMethods list = new ListMethods();
    private SetMethods set = new SetMethods();
    private MapMethods map = new MapMethods();

    long addToListTime(List<Integer> l){
        start = System.currentTimeMillis();
        list.addElements(l);
        end = System.currentTimeMillis();
        return end - start;
    }

    long searchInListTime(List<Integer> l){
        start = System.currentTimeMillis();
        list.getElements(l);
        end = System.currentTimeMillis();
        return end - start;
    }

    long deleteFromListTime(List<Integer> l){
        start = System.currentTimeMillis();
        list.removeElements(l);
        end = System.currentTimeMillis();
        return end - start;
    }
    long addToSetTime(Set<String> s){
        start = System.currentTimeMillis();
        set.addElements(s);
        end = System.currentTimeMillis();
        return end - start;
    }

    long searchInSetTime(Set<String> s){
        start = System.currentTimeMillis();
        set.getElements(s);
        end = System.currentTimeMillis();
        return end - start;
    }

    long deleteFromSetTime(Set<String> s){
        start = System.currentTimeMillis();
        set.removeElements(s);
        end = System.currentTimeMillis();
        return end - start;
    }
    long addToMapTime(Map<Integer,String> m){
        start = System.currentTimeMillis();
        map.addElements(m);
        end = System.currentTimeMillis();
        return end - start;
    }

    long searchInMapTime(Map<Integer,String> m){
        start = System.currentTimeMillis();
        map.getElements(m);
        end = System.currentTimeMillis();
        return end - start;
    }

    long deleteFromMapTime(Map<Integer,String> m){
        start = System.currentTimeMillis();
        map.removeElements(m);
        end = System.currentTimeMillis();
        return end - start;
    }

}