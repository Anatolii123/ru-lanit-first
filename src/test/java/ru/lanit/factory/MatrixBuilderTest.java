package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixBuilderTest {
    private ContentCreator contentCreator;
    private MyDouble[][] check;
    private MyDoubleCreatorStub stub = new MyDoubleCreatorStub();

    /**
     * Тесты на проверку работоспособности методов
     */
    @Test
    public void toMatrix() {
        // arrange
        MyDouble[][] check = {
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}};
        stub.setContent(check);
        MatrixBuilder matrixBuilder = new MatrixBuilder(stub);

        // act
        Matrix result = matrixBuilder.setA(stub.getContent().length).setB(stub.getContent()[0].length).toMatrix();

        // assert
        for (int i = 0; i < result.getA(); i++) {
            for (int j = 0; j < result.getB(); j++) {
                Assert.assertEquals(check[i][j].value,((MyDouble)result.getMatrix()[i][j]).value,0d);
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
    @Before
    public void getContentCreator() {
        // todo попробовать создангие заглушки вынести в @Before. Пример не наглядный. Прошу что-нибудь подобное сделать в других тестах
        MyDoubleCreatorStub stub = new MyDoubleCreatorStub();
        stub.setContent(check);
        contentCreator = stub;
    }

    @Test
    public void toMatrix1x1() {
        // arrange
        check = new MyDouble[][]{{new MyDouble(12d)}};
        MatrixBuilder matrixBuilder = new MatrixBuilder(contentCreator);

        // act
        Matrix result = matrixBuilder.setA(1).setB(1).toMatrix();

        // assert
        for (int i = 0; i < result.getA(); i++) {
            for (int j = 0; j < result.getB(); j++) {
                Assert.assertEquals(check[i][j].value, ((MyDouble) result.getMatrix()[i][j]).value);
            }
        }

    }


}