package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {

    private final int FIRST_INDEX = 0;
    private final int LAST_INDEX = 1000000;
    private final String numberOne = "1";

    public Set<String> createHashSet(){
        HashSet<String> hSet = new HashSet<>();
        addElements(hSet);
        return hSet;
    }
    public Set<String> createTreeSet(){
        TreeSet<String> tSet = new TreeSet<>();
        addElements(tSet);
        return tSet;
    }

    public void addElements(Set<String> s){
        for(int i = FIRST_INDEX; i < LAST_INDEX; i++){
            s.add(numberOne + i);
        }
    }

    public void getElements(Set<String> s){
        for(int i = FIRST_INDEX; i < LAST_INDEX; i++){
            s.contains(numberOne + i);
        }
    }

    public void removeElements(Set<String> s){
        for(int i = FIRST_INDEX; i < LAST_INDEX; i++){
            s.remove(numberOne + i);
        }
    }
}
