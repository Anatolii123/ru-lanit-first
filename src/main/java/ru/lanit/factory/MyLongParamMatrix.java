package ru.lanit.factory;

import java.util.Scanner;

public class MyLongParamMatrix extends ParamMatrix<Long> {

    public MyNumeric<Long>[][] createContent(int a, int b) {
        Scanner in = new Scanner(System.in);
        MyNumeric<Long>[][] result = new MyLong[a][b];
        this.setA(a);
        this.setB(b);
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                System.out.print("Введите число: ");
                result[i][j] = new MyLong(in.nextLong());
            }
            System.out.println();
        }
        for (int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++){
                System.out.print(result[i][j].toString() + "\t");
            }
            System.out.println();
        }
        this.setContent(result);
        return result;
    }
}
