package ru.lanit.factory;

import ru.lanit.exceptions.ArgumentsException;
import ru.lanit.exceptions.IncorrectColumnsCountException;
import ru.lanit.exceptions.IncorrectRowsCountException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyDoubleParamMatrix extends ParamMatrix<Double> {

    public MyNumeric<Double>[][] createContent(int a, int b, String[] args) throws ArgumentsException {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Введите количество строк: ");
//        int a = in.nextInt();
//        System.out.print("Введите количество столбцов: ");
//        int b = in.nextInt();
        int c = Integer.parseInt(args[a]);
        int d = Integer.parseInt(args[b]);

        if (c <= 1) {
            throw new IncorrectRowsCountException();
        }
        if (d <= 1) {
            throw new IncorrectColumnsCountException();
        }
        MyNumeric<Double>[][] result = new MyDouble[c][d];
        this.setA(c);
        this.setB(d);

        for(int i = 0; i < c; i++) {
            for(int j = 0; j < d; j++) {
                while (true) {
                    try {
                        Scanner in2 = new Scanner(System.in);
                        //System.out.print("Введите число: ");
                        //result[i][j] = new MyDouble(in2.nextDouble());
                        result[i][j] = new MyDouble(Double.parseDouble(args[c*i+j+2+a]));
                    } catch (InputMismatchException e) {
                        System.out.println("Try once more");
                        j--;
                        continue;
                    }
                    finally {
                        break;
                    }
                }
            }
            System.out.println();
        }

        for (int i = 0; i < c; i++) {
            for(int j = 0; j < d; j++){
                System.out.print(result[i][j].toString() + "\t");
            }
            System.out.println();
        }
        System.out.println();
        this.setContent(result);
        return result;
    }

}
