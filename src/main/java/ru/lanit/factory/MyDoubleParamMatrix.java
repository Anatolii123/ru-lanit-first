package ru.lanit.factory;

import ru.lanit.exceptions.ArgumentsException;
import ru.lanit.exceptions.IncorrectColumnsCountException;
import ru.lanit.exceptions.IncorrectRowsCountException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyDoubleParamMatrix extends ParamMatrix<Double> {

    public MyNumeric<Double>[][] createContent() throws ArgumentsException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int a = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int b = in.nextInt();

        if (a <= 1) {
            throw new IncorrectRowsCountException();
        }
        if (b <= 1) {
            throw new IncorrectColumnsCountException();
        }
        MyNumeric<Double>[][] result = new MyDouble[a][b];
        this.setA(a);
        this.setB(b);

        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                while (true) {
                    try {
                        Scanner in2 = new Scanner(System.in);
                        System.out.print("Введите число: ");
                        result[i][j] = new MyDouble(in2.nextDouble());
                    } catch (InputMismatchException d) {
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

        for (int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++){
                System.out.print(result[i][j].toString() + "\t");
            }
            System.out.println();
        }
        System.out.println();
        this.setContent(result);
        return result;
    }

}
