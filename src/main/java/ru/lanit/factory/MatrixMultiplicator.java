package ru.lanit.factory;

import java.math.BigDecimal;

public class MatrixMultiplicator implements MatrixOperation {

    public Operations[][] perform(Matrix operand1, Matrix operand2) {
        //TODO получать размерности напрямую от операндов
        Operations[][] a = operand1.getMatrix();
        Operations[][] b = operand2.getMatrix();
        if(operand1.getMatrix()[0].length != operand2.getMatrix().length) {
            System.out.println("Матрицы несогласованы!");
            //TODO выкидиывать тут исключение
        }

        Operations[][] s = new Operations[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    if (s[i][j] == null) { // воспользоваться тернарным оператором
                        s[i][j] = a[i][k].mult(b[k][j]);
                    }
                    s[i][j] = s[i][j].add(a[i][k].mult(b[k][j]));
                }
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
        return s;
    }
}
