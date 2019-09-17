package ru.lanit.factory;

import jdk.nashorn.internal.objects.Global;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.lanit.exceptions.AdditionException;

import static org.junit.Assert.*;

public class MatrixSubstractorTest {

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
    public void perform() {
        // arrange
        operand1.setMatrix(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}});

        operand2.setMatrix(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}});

        // act
        Operations[][] s = new MatrixSubstractor().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(0d,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    /**
     * Тесты на проверку вызываемых исключений
     */
    @Test(expected = ArithmeticException.class)
    public void performExceptions() throws ArithmeticException {
        // arrange
        operand1.setMatrix(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}});

        operand2.setMatrix(new MyDouble[][]{
                {new MyDouble(9d), new MyDouble(8d), new MyDouble(7d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)}});

        // act
        Operations[][] s = new MatrixSubstractor().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(10d,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    /**
     * Тесты на проверку крайних случаев
     */
    @Test
    public void performExtremeCase() {
        // arrange
        operand1.setMatrix(new MyDouble[][]{
                {new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE)},
                {new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE)},
                {new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE)}});

        operand2.setMatrix(new MyDouble[][]{
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)}});

        // act
        Operations[][] s = new MatrixSubstractor().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(-Global.Infinity,((MyDouble) s[i][j]).value,0d);
            }
        }
    }
}