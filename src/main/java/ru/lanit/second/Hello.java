package ru.lanit.second;

import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.ArgumentsException;
import ru.lanit.exceptions.IncorrectColumnsCountException;
import ru.lanit.exceptions.IncorrectRowsCountException;
import ru.lanit.factory.*;
import ru.lanit.factory.Matrix;
import ru.lanit.factory.MatrixMultiplicator;
import ru.lanit.factory.MatrixSummator;

import java.util.*;

public class Hello {

    private static Matrix matrix;
    private static Matrix matrix2;

    public static void main (String[] args) throws Exception {

        ParamMatrix matrix = createMatrixContent();
        ParamMatrix matrix2 = createMatrixContent();

        try {
            matrix.add(matrix2);
        } catch (AdditionException a) {
            System.out.println("Сложение матриц невозможно.");
        }

//        MyDoubleParamMatrix matrix3 = new MyDoubleParamMatrix();
//        matrix3.createContent(3,3);
//        MyDoubleParamMatrix matrix4 = new MyDoubleParamMatrix();
//        matrix4.createContent(3,3);
//        matrix3.add(matrix4);


        List<String> list = new ArrayList<String>();

        MyLong longOperand = new MyLong(15L);
        MyLong longOperand2 = new MyLong(25L);

//        List<MatrixOperation> operationList = operationsList(5);
//        for (MatrixOperation operation : operationList) {
//            operation.perform(matrix, matrix2);
//            System.out.println();
//        }
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

    public static ParamMatrix createMatrixContent() {
        ParamMatrix matrix = new MyLongParamMatrix();
        while (true) {
            try {
                matrix.createContent();
                break;
            } catch (IncorrectColumnsCountException c) {
                System.out.println("Введено неверное количество столбцов! В матрице должно быть как минимум 2 столбца. Попробуйте ещё раз.");
            } catch (IncorrectRowsCountException r) {
                System.out.println("Введено неверное количество строк! В матрице должно быть как минимум 2 строки. Попробуйте ещё раз.");
            } catch (Exception e) {
                System.out.println("Введено неправильное значение! Попробуйте ещё раз.");
            }
        }
        return matrix;
    }
}
