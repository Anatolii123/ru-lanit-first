package ru.lanit.factory;

public class Matrix implements Visitor{

    private int a;
    private int b;
    private Operations[][] matrix;
    private ContentCreator creator;

    public Matrix(){}

    public Matrix(int a, int b, ContentCreator creator) {
        this.a = a;
        this.b = b;
        this.creator = creator;
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

    public ContentCreator getCreator() {
        return creator;
    }
    public void setCreator(ContentCreator creator) {
        this.creator = creator;
    }

    public void visit(MyDouble myDouble) {

    }

    public void visit(MyLong myLong) {

    }
}
