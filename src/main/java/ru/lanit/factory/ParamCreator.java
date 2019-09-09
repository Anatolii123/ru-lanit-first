package ru.lanit.factory;

import java.util.Scanner;

public class ParamCreator extends ContentCreator {


    @Override
    protected Operations[][] create(int a, int b) {
        Scanner in = new Scanner(System.in);
        Operations[][] result = new MyDouble[a][b];
        System.out.println("Введите тип(Long/Double):");
        String str = new String(in.nextLine());
        if (str.equals("Long")){
            ParamMatrix<Long> matrix = new ParamMatrix<Long>();
            System.out.println("Long matrix");
        }
        if (str.equals("Double")) {
            ParamMatrix<Double> matrix = new ParamMatrix<Double>();
            System.out.println("Double matrix");
        }

        return result;
    }
}
