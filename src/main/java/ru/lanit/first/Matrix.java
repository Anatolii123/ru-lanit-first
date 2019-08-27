package ru.lanit.first;

import java.util.Scanner;

public class Matrix implements java.io.Serializable {
    private int[][] matrix;
    private int[][] tmatrix;
    {
        //Динамический инициализатор
    }
    public Matrix() {
    }

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
    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    public int[][] getTM() {
        return tmatrix;
    }

    public void setTM(int[][] tmatrix) {
        this.matrix = tmatrix;
    }
    void set () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        a = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        b = in.nextInt();

        matrix = new int[a][b];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                System.out.print("Введите число: ");
                matrix[i][j] = in.nextInt();
            }
            System.out.println();
        }
    }

    void show () {
        for(int i = 0;i < a; i++) {
            for(int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void transpose() {
        tmatrix = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                tmatrix[i][j] = matrix[j][i];
                System.out.print(tmatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private int a = 3;
    private int b = 3;
}
