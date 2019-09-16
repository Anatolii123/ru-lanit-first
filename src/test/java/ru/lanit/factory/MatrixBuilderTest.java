package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixBuilderTest {
    private ContentCreator contentCreator;
    private MyDouble[][] check;

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
    public void test(Integer... integers){

    }

    @Before
    public void getContentCreator() {
        // todo попробовать создангие заглушки вынести в @Before. Пример не наглядные. Прошу что-нибудь подобное сделать в других тестах
        check = new MyDouble[][]{{new MyDouble(12d)}};
        MyDoubleCreatorStub stub = new MyDoubleCreatorStub();
        stub.setContent(check);

        contentCreator = stub;
        test(1, 0);
    }

    public static int test = 10;

    public static void test(int numerator, int denominator, Integer someInt) {
        int result = numerator / denominator * test;
    }

}