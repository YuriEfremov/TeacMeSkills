package by.teachmeskills.lection2;

//вычислить 1+2+4+8.....256
public class InClass3 {
    public static void main(String[] args) {
        int a = 1;
        int i = 1;
        int result = 1;
        while (a < 256) {  //Была ошибка! Неправильно <= 256, в  этом случае  отрабатывает лишний цикл!!!
            a = a * 2;
            result = a + result;
            System.out.printf("Iteration %d sum %d a = %d", i, result, a);
            System.out.println();
            i += 1;
        }
        System.out.println(result);
    }
}
