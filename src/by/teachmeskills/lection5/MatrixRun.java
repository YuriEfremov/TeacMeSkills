package by.teachmeskills.lection5;


import java.util.Scanner;

public class MatrixRun {
    public static void main(String[] args) {
        Matrix mtx1 = new Matrix();
        Matrix mtx2 = new Matrix();
        int st;
        int col;

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы");
        mtx1.setArr_str(scn.nextInt());
        mtx2.arr_str=mtx1.arr_str;
        System.out.println("Введите количество столбцов матрицы");
        mtx1.setArr_col(scn.nextInt());
        mtx2.arr_col=mtx1.arr_col;

        System.out.println("Matrix one");
        mtx1.initMatrix();
        System.out.println("Matrix two");
        mtx2.initMatrix();
        mtx1.sumMatrix(mtx2.arr);
        mtx1.multMatrix(mtx2.arr);
    }
}

