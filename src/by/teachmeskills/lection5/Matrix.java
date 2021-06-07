package by.teachmeskills.lection5;
// Matrix Class - Init, Summ, Multiply
import java.util.Random;

public class Matrix {

    int[][] arr;
    int arr_str;
    int arr_col;
    Random r = new Random();

    public Matrix() {
    }
    //public Matrix (int arr_str; int arr_col){}

    public void setArr_str(int arr_str) {
        this.arr_str = arr_str;
        //System.out.println("You are enter" + this.arr_str);
    }
    public void setArr_col(int arr_col) {
        this.arr_col = arr_col;
       // System.out.println("You are enter" + this.arr_col);

    }

    public void initMatrix()    {
        arr=new int [arr_str][arr_col];
       for (int i = 0; i < arr_str; i++) {
          for (int j = 0; j < arr_col; j++) {
               arr[i][j] = r.nextInt(50);
               System.out.print(arr[i][j] +" ");
           } System.out.println();
        }

   }

   public void sumMatrix(int[][] arr1){
       System.out.println("Summ of two matrix");
        int [][] tmp = new int [arr_str][arr_col];
           for (int i = 0; i < arr_str; i++) {
           for (int j = 0; j < arr_col; j++) {
               tmp[i][j] = arr[i][j]+arr1[i][j];
               System.out.print(tmp[i][j] +" ");
           } System.out.println();
       }
   }

    public void multMatrix(int[][] arr1){
        System.out.println("Mult of two matrix");
        //int x = Math.min(arr.length, matrix2.length);
       // int y = Math.min(matrix[0].length, matrix2[0].length);
        int [][] tmp = new int [arr_str][arr_col];
        for (int i = 0; i < arr_str; i++) {
            for (int j = 0; j < arr_col; j++) {
                tmp[i][j] = arr[i][j]*arr1[i][j];
                System.out.print(tmp[i][j] +" ");
            } System.out.println();
        }
    }

}
