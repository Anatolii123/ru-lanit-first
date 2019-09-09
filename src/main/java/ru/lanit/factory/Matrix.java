package ru.lanit.factory;

public class Matrix {

    private int a;
    private int b;
    private Operations[][] matrix;

    public Matrix() {
    }

    public Matrix(int a, int b, ContentCreator creator) {
        this.a = a;
        this.b = b;
        this.matrix = creator.create(a, b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Operations[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Operations[][] matrix) {
        this.matrix = matrix;
    }

    public void accept(Visitor visitor) throws MultiplicationException, AdditionException {
        visitor.visit(this);
    }

    public void accept(UnaryOperationVisitor visitor) {
        visitor.visit(this);
    }

}
