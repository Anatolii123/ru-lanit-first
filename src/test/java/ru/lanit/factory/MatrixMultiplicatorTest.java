package ru.lanit.factory;

import jdk.nashorn.internal.objects.Global;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.MultiplicationException;

import static org.junit.Assert.*;

public class MatrixMultiplicatorTest {

    private Matrix operand1;
    private Matrix operand2;

    @Before
    public void getMatrices() {
        operand1 = new Matrix();
        operand2 = new Matrix();
    }

    /**
     * Тесты на проверку работоспособности методов
     */

    @Test
    public void multiply_Matrices_Matrix() throws MultiplicationException {
        // arrange
        operand1.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});

        operand2.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});

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
        operand1.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});

        operand2.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d)}});

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
        operand1.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});

        operand2.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});

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
        operand1.setMatrix(new MyDouble[][]{
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)}});

        operand2.setMatrix(new MyDouble[][]{
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)}});

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
        operand1.setMatrix(new MyDouble[][]{{new MyDouble(12d)}});
        operand2.setMatrix(new MyDouble[][]{{new MyDouble(2d)}});

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