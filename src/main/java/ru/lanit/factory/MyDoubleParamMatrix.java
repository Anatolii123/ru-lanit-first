package ru.lanit.factory;

import java.util.Scanner;

public class MyDoubleParamMatrix extends ParamMatrix<Double> {

    public MyNumeric<Double>[][] createContent(int a, int b) {
        MyNumeric<Double>[][] result = new MyDouble[a][b];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                System.out.print("Введите число: ");
                result[i][j] = new MyDouble(in.nextDouble());
            }
            System.out.println();
        }
        return result;
    }

    public ParamMatrix<Double> add(ParamMatrix<Double> operand) {
        MyDoubleParamMatrix result = new MyDoubleParamMatrix();
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
