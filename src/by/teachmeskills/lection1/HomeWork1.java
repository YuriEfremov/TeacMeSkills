package by.teachmeskills.lection1;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Определение разрядности числа");

        int a = 11;
        int b = a;
        String beg = null;
        String endp = null;


        if (a > 0) {
            beg = "is a positive";
        } else {
            beg = "is a negative";
            a = a * -1;
        }

        if (a == 0) {
            System.out.println("Number is Zero");
        } else {
            if (a / 10 < 1) {
                endp = "one digit";

            } else if (a / 10 < 10) {
                endp = "two digit";

            } else if (a / 10 < 100) {
                endp = "three digit";

            }
            System.out.println(b + " " + beg + " " + endp + " number.");
        }

    }

}
