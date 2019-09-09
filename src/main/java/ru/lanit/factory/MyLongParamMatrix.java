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
        this.setContent(result);
        return result;
    }

    public ParamMatrix<Long> add(ParamMatrix<Long> operand) {
        MyLongParamMatrix result = new MyLongParamMatrix();
        for (int i = 0; i < operand.getA(); i++) {
            for(int j = 0; j < operand.getB(); j++){
                this.getContent()[i][j].value = this.getContent()[i][j].value + operand.getContent()[i][j].value;
                System.out.print(this.getContent()[i][j].value + "\t");
            }
            System.out.println();
        }
        result.setContent(this.getContent());
        return result;
    }
}
