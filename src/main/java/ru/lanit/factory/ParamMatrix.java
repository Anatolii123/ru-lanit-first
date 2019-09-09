package ru.lanit.factory;

public class ParamMatrix<T extends Number>  {
    protected T value;

    private int a;
    private int b;
    private MyNumeric<T> matrix;

    public ParamMatrix(){}

    public ParamMatrix(int a, int b) {
        this.a = a;
        this.b = b;
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

    public MyNumeric<T> getMatrix() {
        return matrix;
    }

    public void setMatrix(MyNumeric<T> matrix) {
        this.matrix = matrix;
    }



}
