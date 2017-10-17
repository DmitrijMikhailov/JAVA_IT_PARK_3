package com.company;

/**
 * Created by Дмитрий on 17.10.2017.
 */
public class HumanSorterInsertionSort implements HumanSorter {
    @Override
    public void sort(HumanComparator comparator, Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            Human min = humans[i];
            int indexOfMinHuman = i;
            for (int j = i; j < humans.length; j++) {
                if (comparator.compare(humans[j], min) < 0) {
                    min = humans[j];
                    indexOfMinHuman = j;
                }
            }
            Human temp = humans[i];
            humans[i] = min;
            humans[indexOfMinHuman] = temp;
        }
    }
}
