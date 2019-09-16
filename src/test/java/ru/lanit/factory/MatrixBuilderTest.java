package ru.lanit.factory;

import jdk.nashorn.internal.objects.Global;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixBuilderTest {

    /**
     * Тесты на проверку работоспособности методов
     */
    @Test
    public void toMatrix() {
        // arrange
        Matrix result = new Matrix();

        // act
        result.setMatrix(null);
    }

    /**
     * Тесты на проверку вызываемых исключений
     */
    @Test(expected = NullPointerException.class)
    public void toMatrixExceptions() throws NullPointerException {
        // arrange
        Matrix result = new Matrix();

        // act
        result.setMatrix(null);
    }

    /**
     * Тесты на проверку крайних случаев
     */
    @Test
    public void toMatrix1x1() {
        // arrange
        Matrix result = new Matrix();

        // act
        result.setMatrix(null);
    }

}