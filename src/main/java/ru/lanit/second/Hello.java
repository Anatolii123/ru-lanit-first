package ru.lanit.second;

import org.apache.commons.math3.linear.Array2DRowFieldMatrix;
import org.apache.commons.math3.util.BigReal;
import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.ArgumentsException;
import ru.lanit.exceptions.IncorrectColumnsCountException;
import ru.lanit.exceptions.IncorrectRowsCountException;
import ru.lanit.factory.*;

public class Hello {

    public static void main (String[] args) throws Exception {

        BigReal[][] bg = createArray(3,3);
        Array2DRowFieldMatrix<BigReal> matrix3 = new Array2DRowFieldMatrix<BigReal>(bg);

        BigReal[][] bg2 = createArray2(3,3);
        Array2DRowFieldMatrix<BigReal> matrix4 = new Array2DRowFieldMatrix<BigReal>(bg2);
        System.out.println();
        showMatrix(matrix3);
        System.out.println();
        showMatrix(matrix4);

        /**
         * Сложение матриц
         */
        Array2DRowFieldMatrix<BigReal> matrix5 = matrix3.add(matrix4);
        System.out.println();
        System.out.println("Сумма матриц");
        showMatrix(matrix5);

        /**
         * Умножение матриц
         */
        Array2DRowFieldMatrix<BigReal> matrix6 = matrix3.multiply(matrix4);
        System.out.println();
        System.out.println("Умножение матриц");
        showMatrix(matrix6);
    }

    public static void showMatrix(Array2DRowFieldMatrix<BigReal> matrix) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix.getEntry(i,j).doubleValue() + "\t");
            }
            System.out.println();
        }
    }

    public static BigReal[][] createArray(int a, int b) {
        BigReal[][] bg = new BigReal[a][b];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                bg[i][j] = new BigReal(a * i + j + 1);
            }
        }
        return bg;
    }

    public static BigReal[][] createArray2(int a, int b) {
        BigReal[][] bg = new BigReal[a][b];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                bg[i][j] = new BigReal(9 - a * i - j);
            }
        }
        return bg;
    }

}
