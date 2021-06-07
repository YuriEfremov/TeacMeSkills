package by.teachmeskills.lection1;

public class HomeWork5 {
    public static void main(String[] args) {

        ;
        int a = -1;
        int b = 2;
        int c = -4;
        int resultP = 0;
        int resultN = 0;

        if (a > 0) {
            resultP = resultP + 1;
        } else {
            resultN = resultN + 1;
        }
        if (b > 0) {
            resultP = resultP + 1;
        } else {
            resultN = resultN + 1;
        }
        if (c > 0) {
            resultP = resultP + 1;
        } else {
            resultN = resultN + 1;
        }


        System.out.println("Positive numbers: " + resultP);
        System.out.println("Negative numbers: " + resultN);

    }
}
