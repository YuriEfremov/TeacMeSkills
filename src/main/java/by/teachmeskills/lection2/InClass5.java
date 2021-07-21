package by.teachmeskills.lection2;

// Дюймы в см от 1 до 20
public class InClass5 {
    public static void main(String[] args) {

        double sm = 0;
        for (int inch = 1; inch <= 20; inch++) {
            sm = inch * 2.54;
            System.out.println(inch + " inch = " + sm + " Sm");
        }
    }
}
