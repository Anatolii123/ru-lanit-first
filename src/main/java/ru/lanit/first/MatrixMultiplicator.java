package ru.lanit.first;

public class MatrixMultiplicator extends Matrix {
//    private int[][] A;
//    private int[][] B;
//    private int[][] S;
//
//    public int[][] getAM() {
//        return A;
//    }
//    public void setAM(int[][] A) {
//        this.A = A;
//    }
//
//    public int[][] getBM() {
//        return B;
//    }
//    public void setBM(int[][] B) {
//        this.B = B;
//    }
//
//    public int[][] getSM() {
//        return S;
//    }
//
//    public void mult() {
//        if(A[0].length != B.length) {
//            System.out.println("Матрицы несогласованы!");
//        }
//        else {
//            S = new int[A.length][B[0].length];
//            for(int i = 0; i < A.length; i++) {
//                for(int j = 0; j < B[0].length; j++) {
//                    for(int k = 0; k < A[0].length; k++) {
//                        S[i][j] += A[i][k] * B[k][j];
//                    }
//                    System.out.print(S[i][j] + "\t");
//                }
//                System.out.println();
//            }
//        }
//    }

    public Matrix mult(Matrix b) {
        Matrix result = new Matrix();
        if(this.getMatrix()[0].length != b.getMatrix().length) {
            System.out.println("Матрицы несогласованы!");
        }
        else {
            int[][] mult = multInternal(this.getMatrix(), b.getMatrix());
            result.setMatrix(mult);
            result.setA(mult.length);
            result.setB(mult[0].length);

        }
        return result;
    }

    private int[][] multInternal(int[][] a, int[][] b) {
        int[][] s = new int[a.length][b[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                for(int k = 0; k < a[0].length; k++) {
                    s[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }

        return s;
    }


}
