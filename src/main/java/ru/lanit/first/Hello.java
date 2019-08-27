package ru.lanit.first;

public class Hello {
    public static void main (String[] args) {
        Matrix matrixA = new Matrix(); //new Matrix(3,3);
        matrixA.set();
        matrixA.show();
        System.out.println();
        matrixA.transpose();
        Matrix matrixB = new Matrix();
        matrixB.set();
        matrixB.show();
        System.out.println();
        matrixB.transpose();
        System.out.println();

        MatrixSummator matrixS = new MatrixSummator();
        matrixS.set();
        matrixS.show();
        MatrixMultiplicator matrixM = new MatrixMultiplicator();
        matrixM.set();
        matrixM.show();

//        matrixS.setAM(matrixA.getMatrix());
//        matrixS.setBM(matrixB.getMatrix());
        //matrixS.sum();

        matrixS.sum(matrixA);
        matrixM.mult(matrixB);

//        MatrixMultiplicator matrixM = new MatrixMultiplicator();
//        matrixM.setAM(matrixA.getMatrix());
//        matrixM.setBM(matrixB.getMatrix());
//        matrixM.mult();

    }
}
