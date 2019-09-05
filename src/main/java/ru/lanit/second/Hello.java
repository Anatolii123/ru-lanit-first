package ru.lanit.second;

import ru.lanit.factory.*;
import ru.lanit.factory.Matrix;
import ru.lanit.factory.MatrixMultiplicator;
import ru.lanit.factory.MatrixSummator;

import java.util.*;

public class Hello {

    private static Matrix matrix;
    private static Matrix matrix2;

    public static void main (String[] args) throws Exception {

        //TODO попробовать реализовать в отдельной ветке шаблон проектирования Builder
        Matrix matrix = new Matrix(3, 3, new MyDoubleCreator());
        Matrix matrix2 = new Matrix(3, 3, new MyDoubleCreator());

        MyLong longOperand = new MyLong(15L);
        MyLong longOperand2 = new MyLong(25L);

        SummationVisitor visitor = new SummationVisitor(matrix2);
        MultiplicationVisitor visitor2 = new MultiplicationVisitor(matrix2);
        SummationVisitor visitor3 = new SummationVisitor(longOperand2);
        MultiplicationVisitor visitor4 = new MultiplicationVisitor(longOperand2);

        //TODO сделать тоже самое для умножения. Причём, вызывать тоже для matrix
        matrix.accept(visitor);
        System.out.println();
        matrix.accept(visitor2);
        System.out.println();
        //longOperand.accept(visitor3);
        System.out.println();

//        MatrixOperation sum = new MatrixSummator();
//        Operations[][] result = sum.perform(matrix, matrix2);
//        MatrixOperation mult = new MatrixMultiplicator();
//        mult.perform(matrix,matrix2);

        List<MatrixOperation> operationList = operationsList(5);
        for (MatrixOperation operation : operationList) {
            operation.perform(matrix, matrix2);
            System.out.println();
        }
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
}
