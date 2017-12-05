package kz.epam.tam.module3.lecture234.collectionscomparison.core;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods extends AbstractMethods<Set<String>>{

    public Set<String> createHashSet(){
        HashSet<String> hSet = new HashSet<>();
        for(int i = 0; i < 1000000; i++){
            hSet.add("1" + i);
        }
        return hSet;
    }
    public Set<String> createTreeSet(){
        TreeSet<String> tSet = new TreeSet<>();
        for(int i = 0; i < 1000000; i++){
            tSet.add("1" + i);
        }
        return tSet;
    }

    public void addElements(Set<String> s){
        for(int i = 0; i < 1000000; i++){
            s.add("1" + i);
        }
    }

    public void getElements(Set<String> s){
        for(int i = 0; i < 1000000; i++){
            s.contains("1" + i);
        }
    }

    public void removeElements(Set<String> s){
        for(int i = 0; i < 1000000; i++){
            s.remove("1" + i);
        }
    }
}
