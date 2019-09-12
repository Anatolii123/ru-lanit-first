package ru.lanit.second;

import org.apache.commons.math3.linear.Array2DRowFieldMatrix;
import org.apache.commons.math3.util.BigReal;
import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.ArgumentsException;
import ru.lanit.exceptions.IncorrectColumnsCountException;
import ru.lanit.exceptions.IncorrectRowsCountException;
import ru.lanit.factory.*;

public class ItsMe {

    public static void main (String[] args) throws Exception {

        ParamMatrix matrix = createMatrixContent(0, 1, args);
        Integer matrix2index1 = new Integer(Integer.parseInt(args[0]) * Integer.parseInt(args[1]) + 2);
        Integer matrix2index2 = new Integer(Integer.parseInt(args[0]) * Integer.parseInt(args[1]) + 3);
        ParamMatrix matrix2 = createMatrixContent(matrix2index1, matrix2index2, args);

        try {
            matrix.add(matrix2);
        } catch (AdditionException a) {
            System.out.println("Сложение матриц невозможно.");
        }
    }

    public static ParamMatrix createMatrixContent(int a, int b, String[] args) throws ArgumentsException {
        ParamMatrix matrix = new MyLongParamMatrix();
        while (true) {
            try {
                matrix.createContent(a, b, args);
                break;
            } catch (IncorrectColumnsCountException c) {
                System.out.println("Введено неверное количество столбцов! В матрице должно быть как минимум 2 столбца. Попробуйте ещё раз.");
            } catch (IncorrectRowsCountException r) {
                System.out.println("Введено неверное количество строк! В матрице должно быть как минимум 2 строки. Попробуйте ещё раз.");
            } catch (Exception e) {
                throw new ArgumentsException("Введено неверное количество значений!");
            }
        }
        return matrix;
    }

}
