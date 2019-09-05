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

        //TODO попробовать реализовать в отдельной ветке шаблон проектирования Builder
        Matrix matrix = new Matrix(3, 3, new MyDoubleCreator());
        Matrix matrix2 = new Matrix(3, 3, new MyDoubleCreator());

        MatrixOperation sum = new MatrixSummator();
        //TODO заполнять экземплярами произвольными MatrixOperation какой-нибудь список (List). Для этого завести отедьный метод. Потом пробегать по этому списку и в цикле вызывать операции для двух введённых матриц

        Operations[][] result = sum.perform(matrix, matrix2);

        MatrixOperation mult = new MatrixMultiplicator();
        mult.perform(matrix,matrix2);


//        MyDouble m1 = new MyDouble(2.3);
//        MyDouble m2 = new MyDouble(2.4);
//        m1.add(m2);
        //matrix.perform(...)

    }

}
