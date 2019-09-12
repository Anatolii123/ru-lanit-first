package ru.lanit.second;

import org.apache.commons.math3.linear.Array2DRowFieldMatrix;
import org.apache.commons.math3.util.BigReal;
import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.ArgumentsException;
import ru.lanit.exceptions.IncorrectColumnsCountException;
import ru.lanit.exceptions.IncorrectRowsCountException;
import ru.lanit.factory.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hello {

    public static void main (String[] args) throws Exception {

        ParamMatrix matrix = createMatrixContent(0,1, args);
        Integer matrix2index1 = new Integer(Integer.parseInt(args[0])*Integer.parseInt(args[1])+2);
        Integer matrix2index2 = new Integer(Integer.parseInt(args[0])*Integer.parseInt(args[1])+3);
        ParamMatrix matrix2 = createMatrixContent(matrix2index1, matrix2index1, args);

        try {
            matrix.add(matrix2);
        } catch (AdditionException a) {
            System.out.println("Сложение матриц невозможно.");
        }

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

    public static List<MatrixOperation> operationsList (int listLength) {
        List<MatrixOperation> result = new ArrayList<MatrixOperation>(listLength);

        for (int i = 0; i < listLength; i++) {
            int rand = new Random().nextInt(3);
            switch (rand) {
                case 0:
                    result.add(new MatrixMultiplicator());
                    break;
                case 1:
                    result.add(new MatrixSummator());
                    break;
                case 2:
                    result.add(new MatrixSubstractor());
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    public static ParamMatrix createMatrixContent(int a, int b, String[] args) throws ArgumentsException {
        ParamMatrix matrix = new MyLongParamMatrix();
        while (true) {
            try {
                matrix.createContent(a, b, args);
                break;
            } catch (IncorrectColumnsCountException c) {
                System.out.println("Введено неверное количество столбцов! В матрице должно быть как минимум 2 столбца. Попробуйте ещё раз.");
            } catch (IncorrectRowsCountException r) {
                System.out.println("Введено неверное количество строк! В матрице должно быть как минимум 2 строки. Попробуйте ещё раз.");
            } catch (Exception e) {
                throw new ArgumentsException("Введено неверное количество значений!");
                //System.out.println("Введено неправильное значение! Попробуйте ещё раз.");
                //break;
            }
        }
        return matrix;
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
