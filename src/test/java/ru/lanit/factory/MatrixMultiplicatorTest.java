package ru.lanit.factory;

import jdk.nashorn.internal.objects.Global;
import org.junit.Assert;
import org.junit.Test;
import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.MultiplicationException;

import static org.junit.Assert.*;

public class MatrixMultiplicatorTest {

    /**
     * Тесты на проверку работоспособности методов
     */
    @Test
    public void perform() throws MultiplicationException {
        // arrange
        Matrix operand1 = new Matrix();
        Matrix operand2 = new Matrix();

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
        MyDouble[][] s2 = new MyDouble[s.length][s[0].length];

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s2[i][j] = (MyDouble) s[i][j];
                Assert.assertEquals(12d,s2[i][j].value,0d);
            }
        }
    }

    /**
     * Тесты на проверку вызываемых исключений
     */
    @Test(expected = MultiplicationException.class)
    public void performExceptions() throws MultiplicationException {
        // arrange
        Matrix operand1 = new Matrix();
        Matrix operand2 = new Matrix();

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
        MyDouble[][] s2 = new MyDouble[s.length][s[0].length];

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s2[i][j] = (MyDouble) s[i][j];
                Assert.assertEquals(12d,s2[i][j].value,0d);
            }
        }
    }

    /**
     * Тесты на проверку крайних случаев
     */
    @Test
    public void performExtremeCase() throws MultiplicationException {
        // arrange
        Matrix operand1 = new Matrix();
        Matrix operand2 = new Matrix();

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
        MyDouble[][] s2 = new MyDouble[s.length][s[0].length];

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s2[i][j] = (MyDouble) s[i][j];
                Assert.assertEquals(Global.Infinity,s2[i][j].value,0d);
            }
        }
    }
}