package ru.lanit.factory;

import jdk.nashorn.internal.objects.Global;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.MultiplicationException;

import static org.junit.Assert.*;

public class MatrixMultiplicatorTest {

    private Matrix normalMatrix = new Matrix();
    private Matrix matrix2x3 = new Matrix();
    private Matrix matrix3x2 = new Matrix();
    private Matrix maxMatrix = new Matrix();
    private Matrix matrix12 = new Matrix();
    private Matrix matrix2 = new Matrix();
    private Matrix matrix3x1 = new Matrix();
    private Matrix matrix1x3 = new Matrix();

    @Before
    public void getMatrices() {
        normalMatrix.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});
        matrix2x3.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});
        matrix3x2.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d)}});
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
    public void multiply_Matrices_Matrix() throws MultiplicationException {
        // arrange
        Matrix operand1 = normalMatrix;
        Matrix operand2 = normalMatrix;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(12d,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    @Test
    public void multiply_DifferentDimensionsMatrices_Matrix() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix2x3;
        Matrix operand2 = matrix3x2;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(12d,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    /**
     * Тесты на проверку вызываемых исключений
     */
    @Test(expected = MultiplicationException.class)
    public void multiply_InconsistentMatrices_MultiplicationException() throws MultiplicationException {
        // arrange
        Matrix operand1 = normalMatrix;
        Matrix operand2 = matrix2x3;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(12d,((MyDouble) s[i][j]).value,0d);
            }
        }
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
        operand1.setMatrix(new MyDouble[][]{{new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});

        operand2.setMatrix(new MyDouble[][]{
                {new MyDouble(2d)},
                {new MyDouble(2d)},
                {new MyDouble(2d)}});

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