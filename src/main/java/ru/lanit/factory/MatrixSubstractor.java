package ru.lanit.factory;

public class MatrixSubstractor implements MatrixOperation  {

    public Operations[][] perform(Matrix operand1, Matrix operand2) {
        Operations[][] a = operand1.getMatrix();
        Operations[][] b = operand2.getMatrix();
        Operations[][] s = new Operations[operand1.getA()][operand1.getB()];

        if(operand1.getA() != operand2.getA() || operand1.getB() != operand2.getB()) {
            throw new ArithmeticException("Матрицы разных размерностей!");
        }

        for (int i = 0; i < operand1.getA(); i++) {
            for(int j = 0; j < operand1.getB(); j++){
                s[i][j] = a[i][j].sub(b[i][j]);
                System.out.print(s[i][j] + "\t");
            }
            System.out.println();
        }
        return s;
    }
}
