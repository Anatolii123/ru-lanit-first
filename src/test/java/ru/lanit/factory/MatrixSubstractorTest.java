package ru.lanit.factory;

import jdk.nashorn.internal.objects.Global;
import org.junit.Assert;
import org.junit.Test;
import ru.lanit.exceptions.AdditionException;

import static org.junit.Assert.*;

public class MatrixSubstractorTest {

    /**
     * Тесты на проверку работоспособности методов
     */
    @Test
    public void perform() {
        // arrange
        Matrix operand1 = new Matrix();
        Matrix operand2 = new Matrix();

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
        MyDouble[][] s2 = new MyDouble[s.length][s[0].length];

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s2[i][j] = (MyDouble) s[i][j];
                Assert.assertEquals(0d,s2[i][j].value,0d);
            }
        }
    }

    /**
     * Тесты на проверку вызываемых исключений
     */
    @Test(expected = ArithmeticException.class)
    public void performExceptions() throws ArithmeticException {
        // arrange
        Matrix operand1 = new Matrix();
        Matrix operand2 = new Matrix();

        operand1.setMatrix(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}});

        operand2.setMatrix(new MyDouble[][]{
                {new MyDouble(9d), new MyDouble(8d), new MyDouble(7d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)}});

        // act
        Operations[][] s = new MatrixSubstractor().perform(operand1,operand2);
        MyDouble[][] s2 = new MyDouble[s.length][s[0].length];

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s2[i][j] = (MyDouble) s[i][j];
                Assert.assertEquals(10d,s2[i][j].value,0d);
            }
        }
    }

    /**
     * Тесты на проверку крайних случаев
     */
    @Test
    public void performExtremeCase() {
        // arrange
        Matrix operand1 = new Matrix();
        Matrix operand2 = new Matrix();

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
        MyDouble[][] s2 = new MyDouble[s.length][s[0].length];

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s2[i][j] = (MyDouble) s[i][j];
                Assert.assertEquals(-Global.Infinity,s2[i][j].value,0d);
            }
        }
    }
}