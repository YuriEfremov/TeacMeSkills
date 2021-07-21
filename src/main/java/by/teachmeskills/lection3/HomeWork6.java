package by.teachmeskills.lection3;

import java.util.Random;

public class HomeWork6 {
    public static void main(String[] args) {
        boolean a = false;
        int j = 0;
        int[] mass = new int[4];
        Random r = new Random();
        for (int i = 0; i < 4; i = ++i) {
            mass[i] = r.nextInt(11);
            //mass[i] = i + 1;
            System.out.printf(" %d", mass[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i = ++i) {
            j = i + 1;
            //System.out.println(j);

            if (mass[i] < mass[j]) {
                a = true;
                //System.out.println("true");
            } else {
                a = false;
                //System.out.println("false");
                break;
            }
        }
        if (a) {
            System.out.println("Massive is ascending sequence");
        } else {
            System.out.println("Massive is not ascending sequence");
        }
    }
}
