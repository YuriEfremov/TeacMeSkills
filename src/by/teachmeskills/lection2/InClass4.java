package by.teachmeskills.lection2;

//вычисляем A*B, не пользуясь операцией умножения
public class InClass4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int result = 0;

        for (int i = 0; i < a; i++) {
            result = b + result;
        }
        System.out.println(result);
    }
}
