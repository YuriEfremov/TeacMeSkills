package by.teachmeskills.firstlection;
//Проверка возможности существования  треугольника.
public class Homework2 {
    public static void main(String[] args) {

        System.out.println("The possibility of a triangle check:");
        int a = 6;
        int b = 2;
        int c = 3;

        if ((a + b < c) || (a + c < b) || (c + b < a)) {
            System.out.println("This triangle is impossible");
        } else {
            System.out.println("This triangle is possible");
        }
    }
}
