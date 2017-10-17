package com.company;

public class Main {

    public static void main(String[] args) {
	Human human0 = new Human("Dima",175,21,61);
	Human human1 = new Human("K",185,31,70);
	Human human2 = new Human("D",195,41,80);
	Human human3 = new Human("J",170,51,90);
	Human humans[] = {human0, human1, human2, human3};

	HumanComparator humanComparator = new AgeHumanComparator();
		HumanSorter humanSorter = new HumanSorterBubbleSort();
	humanSorter.sort(humanComparator,humans);
	for (int i = 0; i < humans.length; i++ ){
	    System.out.println(humans);
    }
    }
}
