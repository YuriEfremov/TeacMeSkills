package by.teachmeskills.lection3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner st_in = new Scanner(System.in);
        Random r = new Random();
        boolean b = true;
        int d = 0;

        do {
            System.out.print("Input integer positive number, more than 3 please: ");

            if (st_in.hasNextInt()) {
                int n = st_in.nextInt();

                if (n <= 0) {
                    System.out.println("That's not a positive number!");
                } else {
                    if (n <= 3) {
                        System.out.println("The number must be more than 3!");
                    } else {
                        System.out.println("You are entered " + n);
                        int[] arr1 = new int[n];
                        b = false;
                        for (int i = 0; i < arr1.length; i++) {
                            arr1[i] = r.nextInt(n + 1);
                        }
                        System.out.println("Array1:" + Arrays.toString(arr1));
                        int[] arr2 = new int[n];
                        for (int c = 0; c < arr1.length; c++) {
                            if ((arr1[c] % 2 == 0) && (arr1[c] != 0)) {
                                arr2[c] = 1;
                                d = ++d;
                            } else {
                                arr2[c] = 0;
                            }
                        }
                        System.out.println("Array2: " + Arrays.toString(arr2));
                        int[] arr3 = new int[d];
                        d = 0;
                        for (int c = 0; c < arr2.length; ++c) {
                            if (arr2[c] != 0) {
                                arr3[d] = arr1[c];
                                d = ++d;
                            }
                        }
                        System.out.println("Array3: " + Arrays.toString(arr3));
                    }
                }
            } else {
                System.out.println("That's not an integer number!");
               //st_in.next();
            }
        } while (b);
    }
}
