package by.teachmeskills.lection12.Demo.collections;

import java.util.*;

public class TreeSetProbe {
    public static void main(String[] args) {
        Set <String> trstL = new TreeSet<>();
        trstL.add("Minsk");
        trstL.add("Kiev");
        trstL.add("London");
        trstL.add("New-York");
        System.out.println("Size " + trstL.size());
        for(String s: trstL)
        {
            System.out.println(s);
        }

    }
}
