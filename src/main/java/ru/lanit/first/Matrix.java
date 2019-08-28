package ru.lanit.first;

import java.util.Scanner;

public class Matrix implements java.io.Serializable {
    private int a;
    private int b;
    private String filepath;
    private int[][] matrix;
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

    public String getFilepath() {
        return filepath;
    }
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public int[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void set () {
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

    public void show () {
        for(int i = 0;i < a; i++) {
            for(int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public boolean isEmpty(Matrix s){
        if(s.a == 0 && s.b == 0 && s.filepath == null && s.matrix == null){
            return true;
        }
        return false;
    }
}
