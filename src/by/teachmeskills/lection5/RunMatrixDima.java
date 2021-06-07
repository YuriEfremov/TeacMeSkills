package by.teachmeskills.lection5;

public class RunMatrixDima {

        public static void main(String[] args) {

            MatrixDima m1 = new MatrixDima(2, 3);

            MatrixDima m2 = new MatrixDima(3, 2);

            m1.showMatrix();

            m2.showMatrix();

            m1.matrix = m1.sumMatrices(m2.matrix);

            m1.showMatrix();

            m2.multiplying(10);
            m2.showMatrix();
        }
    }

