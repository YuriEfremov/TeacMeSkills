package by.teachmeskills.lection3;

import java.util.Random;

public class InClass3 {
    public static void main(String[] args) {
        int[] mass1 = new int[15];
        int a;
        int count = 0;
        Random r = new Random();
        for (int i = 0; i < mass1.length; i = i + 1) {
            mass1[i] = r.nextInt(100);
            System.out.print(mass1[i] + " ");
            if (mass1[i] % 2 == 0) {
                count = count + 1;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}