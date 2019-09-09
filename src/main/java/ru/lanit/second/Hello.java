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

        try {
            throw new ArgumentsException();
        } catch (ArgumentsException m) {
            System.err.println("Перехвачено: " + m);
        }

//        MyLongParamMatrix matrix = new MyLongParamMatrix();
//        matrix.createContent(3,3);
//        MyLongParamMatrix matrix2 = new MyLongParamMatrix();
//        matrix2.createContent(3,3);
//        matrix.add(matrix2);
//
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

    private static MatrixMaker getMatrixMaker(ContentCreator creator) {
        MatrixBuilder mb = new MatrixBuilder(creator);

        return new MatrixMaker(mb);
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
