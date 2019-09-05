package ru.lanit.factory;

public class MatrixSummator implements MatrixOperation {

    public Operations[][] perform(Matrix operand1, Matrix operand2) {
        //TODO брать размерности напрямую у оперантов
        Operations[][] a = operand1.getMatrix();
        Operations[][] b = operand2.getMatrix();
        if(operand1.getMatrix().length != operand2.getMatrix().length || operand1.getMatrix()[0].length != operand2.getMatrix()[0].length) {
            System.out.println("Матрицы разных размерностей!");
        }

        Operations[][] s = new Operations[operand1.getA()][operand1.getB()];

        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++){
                s[i][j] = a[i][j].add(b[i][j]);
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
        return s;
    }
}
