package by.teachmeskills.lection3;

import java.util.Random;

public class HomeWork7 {
    public static void main(String[] args) {
        int[] mass = new int[12];
        Random r = new Random();
        int j = 0;
        int a = 0;

        for (int i = 0; i < 12; i = ++i) {
            mass[i] = r.nextInt(16);
            System.out.printf(" %d", mass[i]);
        }
        System.out.println();
        for (int i = 0; i < 11; i = ++i) {

            if (a <= mass[i])
            {
                a = mass[i];
                j = i;

            }

        } System.out.printf("Highest element is: %d with index %d", a, j);

    }
}
