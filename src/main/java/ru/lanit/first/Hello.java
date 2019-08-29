package ru.lanit.first;

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


        //Цикл по матрицам из списка. Ессли sum пуст, то вызываем set, параметры для него берём из
        for(Matrix matrix : matrices){
            if (sum.isEmpty()) {
                sum.setMatrix(matrix.getMatrix());
                sum.setA(matrix.getMatrix().length);
                sum.setB(matrix.getMatrix()[0].length);
                continue;
            }
            sum = sum.sum(matrix);
            System.out.println();
            System.out.println(matrix.hashCode());
        }
        sum.showMessage();
        Matrix m;
        m = new MatrixSummator();
        m = new MatrixMultiplicator();

    }
}
