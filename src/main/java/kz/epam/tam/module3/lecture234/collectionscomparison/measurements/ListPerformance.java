package kz.epam.tam.module3.lecture234.collectionscomparison.measurements;

import kz.epam.tam.module3.lecture234.collectionscomparison.core.ListMethods;

class ListPerformance extends AbstractPerformance {

    @Override
    void switchStatement(int operationType) {
        ListMethods list = new ListMethods();
        switch (operationType){
            case 1:
                list.addElementsToArrayList();
                break;
            case 2:
                list.addElementsToLinkedList();
                break;
            case 3:
                list.addElementsToArrayList().get(1000000);
                break;
            case 4:
                list.addElementsToLinkedList().get(1000000);
                break;
            case 5:
                list.addElementsToArrayList().remove(1000000);
                break;
            case 6:
                list.addElementsToLinkedList().remove(1000000);
                break;
        }
    }
}

