package by.teachmeskills.lection12.Demo.collections;

import java.util.ArrayList;

public class ArrayListProbe {
    public static void main(String[] args) {
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        ArrayList<Integer> arrL1 = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            arrL.add(i);
            arrL1.add(i);
        }
        arrL.forEach((n) -> System.out.println( "arrL" + n));
        //System.out.println(arrL.indexOf(3));
        //arrL.add(3, 15);
        arrL.addAll(1, arrL1);

        //System.out.println("index of 15 " + arrL.indexOf(15));
        arrL.forEach((n) -> System.out.println(n));
    }

}
