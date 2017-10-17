package com.company;

/**
 * Created by Дмитрий on 17.10.2017.
 */
public class HumanSorterBubbleSort implements HumanSorter {
    @Override
    public void sort(HumanComparator comparator, Human[] humans) {
        for (int i = humans.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(humans[j], humans[j+1]) > 0) {
                    Human temp = humans[j];
                    humans[j] = humans[j+1];
                    humans[j+1] = temp;
                }
            }
        }
    }
}
