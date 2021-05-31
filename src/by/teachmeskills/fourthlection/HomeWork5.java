package by.teachmeskills.fourthlection;
//Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
//строкой и т. д.)
import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int n;

        System.out.print("Input size  of a matrix please: ");
        n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = rnd.nextInt(51);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr2[i][j] = arr1[j][i];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
