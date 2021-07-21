package by.teachmeskills.lection2;

public class InClass8 {
    public static void main(String[] args) {

        int j = 5;
        for (int i = 5; i > 0; i = i - 1) {
            System.out.print("i" + i + " j" + j + " ");
            while (j > 0) {
                System.out.print(j);
                j = j - 1;
            }
            //System.out.print("");
            j = i-1;
            System.out.println();
        }

        //j = 1;

        //for (int a = 1; a <= 5; a = ++a) {
        //  while (j > 0) {
        //      System.out.print(" * ");
        //      j = --j;
        //  }
        //   System.out.println();
        //    j = a + 1;
        //  }

    }
}

