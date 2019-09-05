package ru.lanit.factory;

public class MatrixSubstractor extends Matrix {

    private Operations[][] subInternal(Operations[][] a, Operations[][] b) {
        Operations[][] s = new Operations[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++){
                s[i][j] = a[i][j].sub(b[i][j]);
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
        return s;
    }
}
