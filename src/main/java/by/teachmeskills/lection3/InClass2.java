package by.teachmeskills.lection3;

public class InClass2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int[] mass = new int[50];

        for (int i = 0; i < mass.length; i = ++i) {
            mass[i] = a;
            a = a + 2;

        }
        for (int i = 0; i < mass.length; i = ++i) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i = ++i) {
            System.out.println(mass[i] + " ");
        }


    }
}

