package kz.epam.tam.module3.lecture234.collectionscomparison.utils;

public class PerformancePrinter {

    public static void printStartMsg(){
        System.out.println("Performance measurement is started!");
    }
    public static void printType(String collection){
        System.out.println("==================================================");
        System.out.println("Compare "+ collection +" performance!");
    }
    public static void printAction(String action,String preposition,String collection){
        System.out.println("***" + action + " items " + preposition +" a " + collection +"***");
    }
    public static void printResult(String operation,String collection,long difference){
        System.out.println(operation + " performance of " + collection + " is: " + difference + " ms");
    }
}
