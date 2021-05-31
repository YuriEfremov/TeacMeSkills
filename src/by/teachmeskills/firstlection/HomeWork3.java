package by.teachmeskills.firstlection;

public class HomeWork3 {
    public static void main(String[] args) {

        int a = -2;
        if (a == 0) {
            a = 10;
        } else {
            if (a < 0) {
                a = a - 2;
            } else {
                a = a + 1;
            }
        }
        {
            System.out.println(a);
        }
    }
}
