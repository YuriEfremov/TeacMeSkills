package by.teachmeskills.thirdlecton;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner st_in = new Scanner(System.in);
        Random r = new Random();
        boolean b = true;
        int sumleft = 0;
        int sumright = 0;
        int d;


        do {
            System.out.print("Input even integer positive number, please: ");

            if (st_in.hasNextInt()) {
                int a = st_in.nextInt();

                if (a <= 0) {
                    System.out.println("That's not a positive number!");
                } else {
                    if (a % 2 != 0) {
                        System.out.println("That's not an even number!");
                    } else {
                        System.out.println("You are entered " + a);
                        b = false;
                        int[] arr1 = new int[a];
                        for (int i = 0; i < arr1.length; i++) {
                            arr1[i] = r.nextInt(16);
                        }
                        System.out.println("Array1:" + Arrays.toString(arr1));
                        d = arr1.length / 2;
                        for (int c = (arr1.length / 2) - 1; c >= 0; c--) {
                            sumleft = sumleft + arr1[c];
                            sumright = sumright + arr1[d];
                            d = ++d;
                        }
                        System.out.println("SumLeft= " + sumleft);
                        System.out.println("SumRight= " + sumright);
                        if (sumleft == sumright) {
                            System.out.println("Left part of array is equal to right part");
                        } else {
                            if (sumleft > sumright) {
                                System.out.println("Left part of array is more than right part");
                            } else {
                                System.out.println("Left part of array is less than right part");

                            }
                        }
                    }

                }
            } else {
                System.out.println("That's not an integer number!");
                st_in.next();

            }
        } while (b);

    }

}
