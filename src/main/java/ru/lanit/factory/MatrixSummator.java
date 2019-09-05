package ru.lanit.factory;

public class MatrixSummator implements MatrixOperation {

    public Operations[][] perform(Matrix operand1, Matrix operand2) {
        Operations[][] a = operand1.getMatrix();
        Operations[][] b = operand2.getMatrix();
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
