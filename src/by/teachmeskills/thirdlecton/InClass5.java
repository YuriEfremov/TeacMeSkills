package by.teachmeskills.thirdlecton;

import java.util.Random;

public class InClass5 {
    public static void main(String[] args) {
        int[] mass1 = new int[5];
        int[] mass2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        double aver1 = 0.00;
        double aver2 = 0.00;
        Random r1 = new Random();
        for (int i = 0; i < 5; i = ++i) {
            mass1[i] = r1.nextInt(16);
            System.out.printf("%d ", mass1[i]);
            sum1 = sum1 + mass1[i];
        }
        System.out.println();
        for (int i = 0; i < 5; i = ++i) {
            mass2[i] = r1.nextInt(16);
            System.out.print(mass2[i] + " ");
            sum2 = sum2 + mass2[i];
        }
        System.out.println();
        aver1 = (double) sum1 / mass1.length;
        aver2 = (double) sum2 / mass2.length;
        if (aver1 == aver2) {
            System.out.printf("Average of Mass1 %.2f equal to average of Mass2 %.2f", aver1, aver2);
        }
        if (aver1 > aver2) {
            System.out.printf("Average of Mass1 %.2f more than average of Mass2 %.2f", aver1, aver2);
        }
        if (aver1 < aver2) {
            System.out.printf("Average of Mass2 %.2f more than average of Mass1 %.2f", aver2, aver1);
        }
        System.out.println();
        System.out.printf("sum1 %d sum2 %d", sum1, sum2);
    }
}
