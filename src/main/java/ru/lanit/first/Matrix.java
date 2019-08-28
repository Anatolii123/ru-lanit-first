package ru.lanit.first;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

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

    public boolean isEmpty(){
        if(matrix == null){
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int[] h = new int[matrix.length];

        if (a == b) {
            return determinant(matrix);
        }

        for (int i = 0; i < matrix.length; i++) {
            h[i] = Arrays.hashCode(matrix[i]);
        }
        return Arrays.hashCode(h);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Matrix)){
            return false;
        }
        Matrix other = (Matrix) obj;
        if (this.a != other.a){
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                if (this.matrix[i][j] != other.matrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     *
     * @param a
     * @return
     */
    public int determinant(int[][] a) {
        if (a.length == 2 && a[0].length == 2) { // матрица 2x2 - остановка рекурсии. Есть для неё формула.
            return a[0][0] * a[1][1] - a[0][1] * a[1][0];
        }

        int result = 0;
        int sign = 1;
        for (int j = 0; j < a.length; j++) {
            result += sign * a[0][j] * determinant(minor(a, 0, j)); // умножаем элемент на определитель от дополнительного минораэ.
            sign *= -1;
        }

        return result;
    }

    public static int[][] minor(int[][] matrix, int rowNum, int colNum) {

        final int n = matrix.length - 1;
        final int m = matrix[0].length - 1;

        int[][] result = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            boolean isRowDeleted = rowNum < i;
            int resultRowIndex = isRowDeleted ? i - 1 : i;

            for (int j = 0; j < matrix[i].length; j++) {
                boolean isColDeleted = colNum < j;
                int resultColIndex = isColDeleted ? j - 1 : j;

                if (rowNum != i && colNum != j)
                    result[resultRowIndex][resultColIndex] = matrix[i][j];
            }
        }
        return result;
    }
}
