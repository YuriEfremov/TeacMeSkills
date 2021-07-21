package by.teachmeskills.lection4;
//проверить, произведение элементов какой диагонали больше

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int n;
        int main;
        int add;
        System.out.print("Input size  of a matrix please: ");
        n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = rnd.nextInt(51);
                System.out.print(arr1[i][j] + " ");
                if (i == j) {
                    arr2[i] = arr1[i][j];
                }
                if (j == n - 1 - i) {
                    arr3[i] = arr1[i][j];
                }
            }
            System.out.println();
        }
        main = arr2[0];
        add = arr3[0];
        for (int i = 1; i < n; i++) {
            main = arr2[i] * main;
            add = arr3[i] * add;
        }
        System.out.println("Main Diag " + Arrays.toString(arr2));
        System.out.println("Add Diag " + Arrays.toString(arr3));
        System.out.println("Main diag " + main);
        System.out.println("Add diag " + add);
        if (main == add) {
            System.out.printf("Main diag composition %d is equal to additional diag composition %d\n", main, add);
        } else {
            if (main < add) {
                System.out.printf("Main diag composition %d is less than additional diag composition %d\n", main, add);
            } else {System.out.printf("Main diag composition %d is more than additional diag composition %d\n", main, add);}
        }

    }
}
