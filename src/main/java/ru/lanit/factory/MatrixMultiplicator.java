package ru.lanit.factory;

import ru.lanit.exceptions.MultiplicationException;

public class MatrixMultiplicator implements MatrixOperation {

    public Operations[][] perform(Matrix operand1, Matrix operand2) throws MultiplicationException {
        Operations[][] a = operand1.getMatrix();
        Operations[][] b = operand2.getMatrix();
        if(operand1.getB() != operand2.getA()) {
            throw new MultiplicationException("Матрицы несогласованы: число столбцов 1 матрицы - " + operand1.getB() + ", число строк 2 матрицы - " + operand2.getA() + ".");
        }

        Operations[][] s = new Operations[operand1.getA()][operand2.getB()];

        System.out.println("Произвдение матриц");
        for (int i = 0; i < operand1.getA(); i++) {
            for (int j = 0; j < operand2.getB(); j++) {
                for (int k = 0; k < operand1.getB(); k++) {
                    s[i][j] = (s[i][j] == null) ? a[i][k].mult(b[k][j]) : s[i][j].add(a[i][k].mult(b[k][j]));
                }
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
        return s;
    }
}