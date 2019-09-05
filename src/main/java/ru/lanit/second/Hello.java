package ru.lanit.second;

import ru.lanit.factory.*;
import ru.lanit.factory.Matrix;
import ru.lanit.factory.MatrixMultiplicator;
import ru.lanit.factory.MatrixSummator;
import ru.lanit.first.*;

import java.util.*;

public class Hello {

    private static Matrix matrix;
    private static Matrix matrix2;

    public static void main (String[] args) throws Exception {

        Matrix matrix = new Matrix(3,3,new MyDoubleCreator());
        Matrix matrix2 = new Matrix(3,3,new MyDoubleCreator());
        MatrixSummator m = new MatrixSummator();
        m.perform(matrix,matrix2);
//        MyDouble m1 = new MyDouble(2.3);
//        MyDouble m2 = new MyDouble(2.4);
//        m1.add(m2);
        //matrix.perform(...)

    }

}
