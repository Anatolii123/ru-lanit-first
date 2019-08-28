package ru.lanit.first;

import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main (String[] args) throws Exception {
//        Matrix matrixA = new Matrix(); //new Matrix(3,3);
//        matrixA.set();
//        matrixA.transpose();
//        Matrix matrixB = new Matrix();
//        matrixB.set();
//        matrixB.transpose();
//
//        MatrixSummator matrixS = new MatrixSummator();
//        matrixS.sum(matrixA);
//        MatrixMultiplicator matrixM = new MatrixMultiplicator();
//        matrixM.mult(matrixB);

        MatrixReader matrixR = new MatrixReader();
        List<Matrix> matrices = matrixR.readMatrix("D:\\matrix1.txt");
        MatrixSummator sum = new MatrixSummator();
        System.out.println(sum.isEmpty(sum));
//        for (int i = 1; i < matrices.size(); i++) {
//            sum.sum(matrices.get(i-1));
//        }

        //Цикл по матрицам из списка. Ессли sum пуст, то вызываем set, параметры для него берём из

    }
}
