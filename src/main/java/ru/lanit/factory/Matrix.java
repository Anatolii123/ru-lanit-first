package ru.lanit.factory;

import java.util.Scanner;

public class Matrix {

    private int a;
    private int b;
    private String filepath;
    private Operations[][] matrix;
sad
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

}
