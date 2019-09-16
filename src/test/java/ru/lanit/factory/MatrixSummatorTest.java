package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Test;
import ru.lanit.exceptions.AdditionException;

import static org.junit.Assert.*;

public class MatrixSummatorTest {

    /**
     * Тесты на проверку работоспособности методов
     */
    @Test
    public void perform() throws AdditionException {
        // arrange
        Matrix operand1 = new Matrix();
        Matrix operand2 = new Matrix();

        operand1.setMatrix(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}});

        operand2.setMatrix(new MyDouble[][]{{new MyDouble(9d), new MyDouble(8d), new MyDouble(7d)},
                {new MyDouble(6d), new MyDouble(5d), new MyDouble(4d)},
                {new MyDouble(3d), new MyDouble(2d), new MyDouble(1d)}});

        // act
        Operations[][] s = new MatrixSummator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(10d,s[i][j]);
            }
        }
    }

    /**
     * Тесты на проверку вызываемых исключений
     */
    @Test(expected = AdditionException.class)
    public void performExceptions() throws AdditionException {
        // arrange
        Matrix operand1 = new Matrix();
        Matrix operand2 = new Matrix();

        operand1.setMatrix(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}});

        operand2.setMatrix(new MyDouble[][]{
                {new MyDouble(9d), new MyDouble(8d), new MyDouble(7d)}});


        // act
        Operations[][] s = new MatrixSummator().perform(operand1,operand2);


        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(10d,s[i][j]);
            }
        }
    }

}