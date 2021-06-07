package by.teachmeskills.lection3;

import java.util.Random;
import java.util.Scanner;


public class InClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Введите число");
        //int a = sc.nextInt();
        //System.out.println("Вы ввели "+a);
        //String str = sc.next();
        //System.out.println("You enter " +str);

        System.out.println("Введите размерность массива NxM");
        //Scanner sc=new Scanner(System.in); //создаём объект типа Scanner
        Random r = new Random(); // создаём объект типа Random
        int n = 0, m = 0; //объявление переменных
        if (sc.hasNextInt()) {
            n = sc.nextInt(); // вводим n с клавиатуры
            m = sc.nextInt(); // вводим m с клавиатуры
        }
        int[][] mass = new int[n][m]; //инициализация массива размером NxM
        for (int i = 0; i < n; i++) { //Заполнение массива случайными числами от 0 до 9
            for (int j = 0; j < m; j++) {
                mass[i][j] = r.nextInt(9);
            }

        }
        // Arrays.sort(mass);
        for (int i = 0; i < n; i++) {// вывод массива в консоль
            for (int j = 0; j < m; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

}

