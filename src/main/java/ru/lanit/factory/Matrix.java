package ru.lanit.factory;

import com.sun.org.apache.xpath.internal.operations.Operation;

import java.util.Scanner;

public class Matrix {

    private int a;
    private int b;
    private Operations[][] matrix;
    private ContentCreator creator;

    public Matrix(){}

    public Matrix(Matrix source){
        setA(source.getA());
        setB(source.getB());
        setMatrix(source.getMatrix());
    }

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

    public void set (int row, int column) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        a = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        b = in.nextInt();
    }

    public Operations[][] create(int a, int b){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        a = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        b = in.nextInt();

        Operations[][] result = new Operations[a][b];
        return result;
    }

}
