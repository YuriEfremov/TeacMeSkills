package by.teachmeskills.secondlection;

//Вывод всех нечетных до 100
public class InClass7 {
    public static void main(String[] args) {
        int count = 1;
        int a = 0;

        while (count < 100) {
            //if (count == 99) {
              //  break; //поставил continue и сделал бесконечный цикл
            //}
            System.out.println(count);
            count = count + 2;
            a=a+1;

            //for (int i = 1; i <= 100; i = i + 2) { Пусть будет через while

        }
        System.out.println(a);
    }

}
