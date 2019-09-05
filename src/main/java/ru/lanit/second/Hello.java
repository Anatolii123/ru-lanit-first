package ru.lanit.second;

import ru.lanit.factory.*;
import ru.lanit.factory.Matrix;
import ru.lanit.factory.MatrixMultiplicator;
import ru.lanit.factory.MatrixSummator;
import ru.lanit.first.*;

import java.util.*;

public class Hello {

    private static Matrix matrix;
    private static Matrix matrix2;

    public static void main (String[] args) throws Exception {

        //TODO попробовать реализовать в отдельной ветке шаблон проектирования Builder
        Matrix matrix = new Matrix(3, 3, new MyDoubleCreator());
        Matrix matrix2 = new Matrix(3, 3, new MyDoubleCreator());

//        MatrixOperation sum = new MatrixSummator();
//        Operations[][] result = sum.perform(matrix, matrix2);
//        MatrixOperation mult = new MatrixMultiplicator();
//        mult.perform(matrix,matrix2);

        //TODO заполнять экземплярами произвольными MatrixOperation какой-нибудь список (List). Для этого завести отедьный метод. Потом пробегать по этому списку и в цикле вызывать операции для двух введённых матриц

        List<MatrixOperation> operationList = operationsList(5);
        for (MatrixOperation operation : operationList) {
            operation.perform(matrix, matrix2);
            System.out.println();
        }
    }

    public static List<MatrixOperation> operationsList (int listLength) {
        List<MatrixOperation> result = new ArrayList<MatrixOperation>();

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
}
