package by.teachmeskills.lection12.Demo.generics;

public class Printer {
    public <ARR> void print(ARR[] items) {
        for (ARR i : items) {
            System.out.println(i);
        }
    }
}
