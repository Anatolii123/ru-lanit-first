package ru.lanit.factory;

import java.math.BigDecimal;

public class MatrixMultiplicator extends Matrix {

    private Operations[][] multInternal(Operations[][] a, Operations[][] b) {
        Operations[][] s = new Operations[a.length][b[0].length];
        BigDecimal bigDecimal = new BigDecimal(0);
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                for(int k = 0; k < a[0].length; k++) {
                    s[i][j].add(a[i][k].mult(b[k][j]));
                }
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
        return s;
    }
}
