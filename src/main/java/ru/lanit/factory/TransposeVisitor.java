package ru.lanit.factory;

public class TransposeVisitor implements UnaryOperationVisitor {

    public Matrix visit(Matrix operand) {
        Operations[][] a = operand.getMatrix();
        Matrix b = new Matrix();
        System.out.println("Транспонированная матрица");
        for (int i = 0; i < operand.getA(); i++) {
            for (int j = 0; j < operand.getB(); j++) {
                if (j > i) {
                    Operations temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        b.setMatrix(a);
        return b;
    }
}
