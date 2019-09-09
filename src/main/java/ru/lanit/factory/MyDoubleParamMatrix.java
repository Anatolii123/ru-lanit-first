package ru.lanit.factory;

import java.util.Scanner;

public class MyDoubleParamMatrix extends ParamMatrix<Double> {

    public MyNumeric<Double>[][] createContent(int a, int b) throws IncorrectRowsCountException, IncorrectColumnsCountException {
        if (a == 0 || a == 1) {
            throw new IncorrectRowsCountException();
        }
        if (b == 0 || b == 1) {
            throw new IncorrectColumnsCountException();
        }

        Scanner in = new Scanner(System.in);
        MyNumeric<Double>[][] result = new MyDouble[a][b];
        this.setA(a);
        this.setB(b);
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                System.out.print("Введите число: ");
                result[i][j] = new MyDouble(in.nextDouble());
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
