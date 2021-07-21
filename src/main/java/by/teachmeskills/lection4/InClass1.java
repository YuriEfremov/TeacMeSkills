package by.teachmeskills.lection4;
//Найти произведение элементов, кратных 3.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int sum = 0;
        int n;
        System.out.print("Input size  of a matrix please: ");
        n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = rnd.nextInt(51);
                System.out.print(arr1[i][j] + " ");
                if (i == j) {
                    if (arr1[i][j] % 2 == 0 || arr1[i][j] == 0) {
                        sum = sum + arr1[i][j];
                    }
                }
            }
            System.out.println();

        }
        System.out.println();
        System.out.print(Arrays.deepToString(arr1));
        System.out.println();
        System.out.println("main diag sum =" + sum);


    }
}
