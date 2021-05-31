package by.teachmeskills.thirdlecton;

import java.util.Random;

public class InClass4 {
    public static void main(String[] args) {
        int[] mass1 = new int[20];
        int a;
        int count = 0;
        Random r = new Random();
        for (int i = 0; i < mass1.length; i = i + 1) {
            mass1[i] = r.nextInt(21);
            System.out.print(mass1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass1.length; i = i + 1) {

            if (i % 2 != 0) {
                mass1[i] = 0;
            }
            System.out.print(mass1[i] + " ");
        }
    }
}
