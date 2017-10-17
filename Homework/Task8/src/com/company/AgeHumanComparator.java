package com.company;

/**
 * Created by Дмитрий on 17.10.2017.
 */
public class AgeHumanComparator  implements HumanComparator{

    @Override
    public int compare(Human a, Human b) {

        return a.getAge() - b.getAge();
    }
}
