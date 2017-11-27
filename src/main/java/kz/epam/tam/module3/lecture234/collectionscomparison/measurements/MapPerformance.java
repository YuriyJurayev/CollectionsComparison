package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.core.MapMethods;

class MapPerformance extends AbstractPerformance {

    @Override
    void switchStatement(int operationType) {
        MapMethods map = new MapMethods();
        switch (operationType){
            case 1:
                map.addElementsToHashMap();
                break;
            case 2:
                map.addElementsToTreeMap();
                break;
            case 3:
                map.addElementsToHashMap().containsValue("element to find");
                break;
            case 4:
                map.addElementsToTreeMap().containsValue("element to find");
                break;
            case 5:
                map.addElementsToHashMap().remove(1000000, "element to find");
                break;
            case 6:
                map.addElementsToTreeMap().remove(1000000, "element to find");
                break;
        }
    }
}