package by.teachmeskills.lection12.Demo.collections;

import java.util.*;

public class LinkedListProbe {
    public static void main(String[] args) {
        List <Integer> lnkL = new LinkedList <>();
        for (int i=0; i<4; i++){
            lnkL.add(i);
        }
        lnkL.forEach(System.out::println);
        //System.out.println(lnkL.listIterator(2));
        lnkL.add(2,6);
        System.out.println("_________________________________");
        lnkL.forEach((n) -> System.out.println(n)); //Lambda can be replaced with  method reference ???????
        //lnkL.remove();
        System.out.println("_________________________________");
        lnkL.forEach((n) -> System.out.println(n));
    }
}
