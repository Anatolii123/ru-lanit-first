package ru.lanit.second;

import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.ArgumentsException;
import ru.lanit.exceptions.IncorrectColumnsCountException;
import ru.lanit.exceptions.IncorrectRowsCountException;
import ru.lanit.factory.*;
import ru.lanit.factory.Matrix;
import ru.lanit.factory.MatrixMultiplicator;
import ru.lanit.factory.MatrixSummator;
import org.apache.commons.math3.random.AbstractRandomGenerator;
import  org.apache.commons.collections4.list.AbstractLinkedList;

import java.util.*;

public class Hello {

    private static Matrix matrix;
    private static Matrix matrix2;

    public static void main (String[] args) throws Exception {


        ParamMatrix matrix = createMatrixContent(0,1, args);
        ParamMatrix matrix2 = createMatrixContent(Integer.parseInt(args[0])*Integer.parseInt(args[1])+2,Integer.parseInt(args[0])*Integer.parseInt(args[1])+3, args);

        try {
            matrix.add(matrix2);
        } catch (AdditionException a) {
            System.out.println("Сложение матриц невозможно.");
        }

        AbstractRandomGenerator a = new AbstractRandomGenerator() {
            @Override
            public void setSeed(long l) {

            }

            @Override
            public double nextDouble() {
                return 0;
            }
        };

        AbstractLinkedList<String> str = new AbstractLinkedList<String>() {
            @Override
            public int indexOf(Object value) {
                return super.indexOf(value);
            }
        };

//        MyDoubleParamMatrix matrix3 = new MyDoubleParamMatrix();
//        matrix3.createContent(3,3);
//        MyDoubleParamMatrix matrix4 = new MyDoubleParamMatrix();
//        matrix4.createContent(3,3);
//        matrix3.add(matrix4);

//        List<String> list = new ArrayList<String>();

//        MyLong longOperand = new MyLong(15L);
//        MyLong longOperand2 = new MyLong(25L);

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
}
