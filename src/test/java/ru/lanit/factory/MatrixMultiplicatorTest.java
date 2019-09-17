package ru.lanit.factory;

import jdk.nashorn.internal.objects.Global;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.MultiplicationException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class MatrixMultiplicatorTest {

    private Matrix matrix3x3 = new Matrix();
    private Operations[][] check3x3;
    private Matrix matrix2x3 = new Matrix();
    private Matrix matrix3x2 = new Matrix();
    private Operations[][] check2x2;
    private Matrix maxMatrix = new Matrix();
    private Matrix matrix12 = new Matrix();
    private Matrix matrix2 = new Matrix();
    private Matrix matrix3x1 = new Matrix();
    private Matrix matrix1x3 = new Matrix();

    @Before
    public void getMatrices() {
        matrix3x3.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});
       check3x3 = new MyDouble[][]{
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)}};
        matrix3x2.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d)}});
        check2x2 = new MyDouble[][]{
                {new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d)}};
        matrix3x1.setMatrix(new MyDouble[][]{
                {new MyDouble(2d)},
                {new MyDouble(2d)},
                {new MyDouble(2d)}});
        matrix2x3.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});
        matrix1x3.setMatrix(new MyDouble[][]{{new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});
        maxMatrix.setMatrix(new MyDouble[][]{
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)}});
        matrix12.setMatrix(new MyDouble[][]{{new MyDouble(12d)}});
        matrix2.setMatrix(new MyDouble[][]{{new MyDouble(2d)}});

    }

    /**
     * Тесты на проверку работоспособности методов
     */
    @Test
    public void multiply_Matrices_check3x3() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix3x3;
        Matrix operand2 = matrix3x3;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) check3x3[i][j]).value,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    @Test
    public void multiply_DifferentDimensionsMatrices_check2x2() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix2x3;
        Matrix operand2 = matrix3x2;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1, operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) check2x2[i][j]).value, ((MyDouble) s[i][j]).value, 0d);
            }
        }
    }

    /**
     * Тесты на проверку вызываемых исключений
     */
    @Test(expected = MultiplicationException.class)
    public void multiply_InconsistentMatrices_MultiplicationException() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix3x3;
        Matrix operand2 = matrix2x3;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);
    }

    /**
     * Тесты на проверку крайних случаев
     */
    @Test
    public void multiply_DoubleMaxValueMatrices_Infinity() throws MultiplicationException {
        // arrange
        Matrix operand1 = maxMatrix;
        Matrix operand2 = maxMatrix;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(Global.Infinity,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    @Test
    public void multiply_Matrices1x1_Matrix1x1() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix12;
        Matrix operand2 = matrix2;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(24d,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    @Test
    public void multiply_DifferentDimensionsMatrices_Matrix1x1() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix1x3;
        Matrix operand2 = matrix3x1;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(12d,((MyDouble) s[i][j]).value,0d);
            }
        }
    }
}