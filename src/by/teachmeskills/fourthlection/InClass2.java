package by.teachmeskills.fourthlection;
//Вывести нечетные элементы находящиеся под главной
//диагональю(включительно)

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int sum = 0;
        int n;
        int a = 0;

        System.out.print("Input size  of a matrix please: ");
        n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = rnd.nextInt(51);
                System.out.print(arr1[i][j] + " ");
                if (j <= i) {
                    if (arr1[i][j] % 2 != 0) {
                        sum = sum + arr1[i][j];
                        a = ++a;
                    }
                }

            }
            System.out.println();
        }
        System.out.println(a);
        int[] arr = new int[a];
        for (int ki = 0; ki < arr1.length; ki++) {
            for (int kj = 0; kj <= ki; kj++) {
                if (arr1[ki][kj] % 2 != 0) {
                    a = --a;
                    arr[a] = arr1[ki][kj];

                }
            }
        }
        System.out.print(Arrays.deepToString(arr1));
        System.out.println();
        System.out.print(Arrays.toString(arr));
        System.out.println();

        System.out.println("main diag sum =" + sum);


    }
}

