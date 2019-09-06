package ru.lanit.first;

public class MatrixSummator extends Matrix  {

    /**
     * Метод возвращает матрицу, являющуюся результатом суммирования this и переданной матрицы b
     *
     * @param b матрица-слагаемое
     * @return сумма двух матриц
     */
    public MatrixSummator sum(Matrix b) {
        if(this.getMatrix().length != b.getMatrix().length || this.getMatrix()[0].length != b.getMatrix()[0].length) {
            System.out.println("Матрицы разных размерностей!");
            return this;
        }

        int[][] sum = sumInternal(this.getMatrix(), b.getMatrix());
        MatrixSummator result = new MatrixSummator();
        result.setMatrix(sum);
        result.setA(sum.length);
        result.setB(sum[0].length);
        return result;
    }

    private int[][] sumInternal(int[][] a, int[][] b) {
        int[][] s = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++){
                s[i][j] = a[i][j] + b[i][j]; // a[i][j].add(b[i][j])
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }

        return s;
    }

    public void showMessage(){
        System.out.println("Тут сообщение");
    }

}
