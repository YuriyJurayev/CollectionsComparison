package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.core.SetMethods;

class SetPerformance extends AbstractPerformance {

    @Override
    void switchStatement(int operationType) {
        SetMethods set = new SetMethods();
        switch (operationType){
            case 1:
                set.addElementsToHashSet();
                break;
            case 2:
                set.addElementsToTreeSet();
                break;
            case 3:
                set.addElementsToHashSet().contains("element to find");
                break;
            case 4:
                set.addElementsToTreeSet().contains("element to find");
                break;
            case 5:
                set.addElementsToHashSet().remove("element to find");
                break;
            case 6:
                set.addElementsToTreeSet().remove("element to find");
                break;
        }
    }
}
