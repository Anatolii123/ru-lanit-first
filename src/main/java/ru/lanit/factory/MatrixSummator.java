package ru.lanit.factory;

public class MatrixSummator extends Matrix {

    private Operations[][] sumInternal(Operations[][] a, Operations[][] b) {
        Operations[][] s = new Operations[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++){
                s[i][j] = a[i][j].add(b[i][j]); // a[i][j].add(b[i][j])
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
        return s;
    }
}
