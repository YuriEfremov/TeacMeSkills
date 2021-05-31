package by.teachmeskills.thirdlecton;

import java.util.Random;
import java.util.Arrays;

public class HomeWork8 {
    public static void main(String[] args) {
        int[] mass1 = new int[10];
        int[] mass2 = new int[10];
        double[] mass3 = new double[10];
        int a = 0;
        Random r = new Random();

        for (int i = 0; i < mass1.length; ++i) {
            mass1[i] = r.nextInt(9) + 1;
            mass2[i] = r.nextInt(9) + 1;
            //mass3[i] = 1. * mass1[i] / mass2[i]; //а так можно??
            mass3[i] = (double) mass1[i] / mass2[i];
            if (mass3[i] % 1 == 0) a++;
        }
        System.out.println("Array1: " + Arrays.toString(mass1));
        System.out.println("Array2: " + Arrays.toString(mass2));
        System.out.print("Array3: ");
        for (double j : mass3) System.out.printf(" %.2f", j); //enhanced FOR

        System.out.println();
        System.out.printf("Number  of integer: %d", a);
    }
}
