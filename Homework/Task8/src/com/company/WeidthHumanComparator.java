package com.company;

/**
 * Created by Дмитрий on 17.10.2017.
 */
public class WeidthHumanComparator implements HumanComparator {
    @Override
    public int compare(Human a, Human b) {
        return (int) (a.getWeight() - b.getWeight());
    }
}
