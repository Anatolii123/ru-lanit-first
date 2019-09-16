package ru.lanit.factory;

import java.util.Scanner;

public class MyDoubleCreator extends ContentCreator {

    private Scanner in;

    public MyDoubleCreator() {}

    public MyDoubleCreator(Scanner in) {
        this.in = in;
    }

    protected Operations[][] create(int a, int b) {
        Operations[][] result = new MyDouble[a][b];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                System.out.print("Введите число: ");
                result[i][j] = new MyDouble(in.nextDouble());
            }
            System.out.println();
        }
        return result;
    }
}
