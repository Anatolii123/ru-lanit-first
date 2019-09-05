package ru.lanit.factory;

import java.util.Scanner;

public class Matrix {

    private int a;
    private int b;
    private String filepath;
    private Operations[][] matrix;


    public void set () {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        a = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        b = in.nextInt();

        matrix = new Operations[a][b];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                matrix[i][j] = Operations();
            }
            System.out.println();
        }
    }

}
