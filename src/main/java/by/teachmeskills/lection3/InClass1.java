package by.teachmeskills.lection3;


public class InClass1 {
    //import java.util.Random;
    //import java.util.Scanner;

    public static void main(String[] args) {
        int a = 0;
        int[] mass = new int[10];

        for (int i = 0; i < 10; i = ++i) {
            a = a + 2;
            mass[i] = a;
        }
        for (int i = 0; i < 10; i = ++i) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i = ++i) {
            System.out.println(mass[i] + " ");
        }

    }
}
