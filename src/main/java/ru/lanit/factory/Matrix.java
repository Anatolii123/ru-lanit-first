package ru.lanit.factory;

import java.util.Scanner;

public class Matrix {

    private int a;
    private int b;
    private String filepath;
    private Operations[][] matrix;

    public Matrix(Matrix source){ // конструктор
        setA(source.getA());
        setB(source.getB());
        setMatrix(source.getMatrix());
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

    public void set (int row, int column, Operations operations) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        a = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        b = in.nextInt();

        matrix = new Operations[a][b];
        matrix[row][column] = operations;
    }

}
