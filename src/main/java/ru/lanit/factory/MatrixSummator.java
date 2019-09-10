package ru.lanit.factory;

import ru.lanit.exceptions.AdditionException;

public class MatrixSummator implements MatrixOperation {

    public Operations[][] perform(Matrix operand1, Matrix operand2) throws AdditionException {
        Operations[][] a = operand1.getMatrix();
        Operations[][] b = operand2.getMatrix();
        if(operand1.getA() != operand2.getA() || operand1.getB() != operand2.getB()) {
            throw new AdditionException("Матрицы разных размерностей: размерность 1 матрицы - " + operand1.getA() + "x" + operand1.getB()
                    + ", размерность 2 матрицы - " + operand2.getA() + "x" + operand2.getB() + ".");
        }

        Operations[][] s = new Operations[operand1.getA()][operand1.getB()];

        System.out.println("Сумма матриц");
        for (int i = 0; i < operand1.getA(); i++) {
            for(int j = 0; j < operand1.getB(); j++){
                s[i][j] = a[i][j].add(b[i][j]);
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
        return s;
    }
}
