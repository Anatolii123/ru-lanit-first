package ru.lanit.first;

public class MatrixSummator extends Matrix  {
//    private int[][] A;
//    private int[][] B;
//    private int[][] S;

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
//    public void sum() {
//        if(A.length != B.length || A[0].length != B[0].length) {
//            System.out.println("Матрицы разных размерностей!");
//        }
//        else {
//            sumInternal(, );
//        }
//    }

    /**
     * Метод возвращает матрицу, являющуюся результатом суммирования this и переданной матрицы b
     *
     * @param b матрица-слагаемое
     * @return сумма двух матриц
     */
    public Matrix sum(Matrix b) {
        //TODO добавить проверку возможности проведения операции
        Matrix result = new Matrix();
        if(this.getMatrix().length != b.getMatrix().length || this.getMatrix()[0].length != b.getMatrix()[0].length) {
            System.out.println("Матрицы разных размерностей!");
        } else {

            int[][] sum = sumInternal(this.getMatrix(), b.getMatrix());
            result.setMatrix(sum);
            result.setA(sum.length);
            result.setB(sum[0].length);

        }
        return result;
    }

    private int[][] sumInternal(int[][] a, int[][] b) {
        int[][] s = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++){
                s[i][j] = a[i][j] + b[i][j];
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }

        return s;
    }
}
