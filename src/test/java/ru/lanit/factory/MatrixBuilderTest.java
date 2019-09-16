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
        MyDoubleCreatorStub stub = new MyDoubleCreatorStub();
        stub.setContent(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}});
        MyDouble[][] check = {
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}};
        MatrixBuilder matrixBuilder = new MatrixBuilder(stub);


        // act
        result.setMatrix(stub.create(stub.getContent().length, stub.getContent()[0].length));
        result.setA(stub.getContent().length);
        result.setB(stub.getContent()[0].length);
        MyDouble[][] result2 = new MyDouble[result.getA()][result.getB()];

        // assert
        for (int i = 0; i < result.getA(); i++) {
            for (int j = 0; j < result.getB(); j++) {
                result2[i][j] = (MyDouble) result.getMatrix()[i][j];
                Assert.assertEquals(check[i][j].value,result2[i][j].value,0d);
            }
        }
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
        MyDoubleCreatorStub stub = new MyDoubleCreatorStub();
        stub.setContent(new MyDouble[][]{{new MyDouble(12d)}});
        MyDouble[][] check = {{new MyDouble(12d)}};
        MatrixBuilder matrixBuilder = new MatrixBuilder(stub);


        // act
        result.setMatrix(stub.create(stub.getContent().length, stub.getContent()[0].length));
        result.setA(stub.getContent().length);
        result.setB(stub.getContent()[0].length);
        MyDouble[][] result2 = new MyDouble[result.getA()][result.getB()];

        // assert
        for (int i = 0; i < result.getA(); i++) {
            for (int j = 0; j < result.getB(); j++) {
                result2[i][j] = (MyDouble) result.getMatrix()[i][j];
                Assert.assertEquals(check[i][j].value,result2[i][j].value,0d);
            }
        }

    }

}