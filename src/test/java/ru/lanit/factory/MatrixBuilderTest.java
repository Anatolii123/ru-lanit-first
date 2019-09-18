package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MatrixBuilderTest {
    private MyDouble[][] check;
    private MyDoubleCreator stub;

    @Before
    public void getDoubleCreator() {
        stub = mock(MyDoubleCreator.class);

    }

    /**
     * Тесты на проверку работоспособности методов
     */
    @Test
    public void toMatrix() {
        // arrange
        when(stub.create(3,3)).thenReturn(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}});
        MyDouble[][] check = (MyDouble[][]) stub.create(3,3);
        MatrixBuilder matrixBuilder = new MatrixBuilder(stub);

        // act
        Matrix result = matrixBuilder.setA(stub.create(3,3).length).setB(stub.create(3,3)[0].length).toMatrix();

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

    @Test
    public void toMatrix_1x1() {
        // arrange
        when(stub.create(1,1)).thenReturn(new MyDouble[][]{{new MyDouble(12d)}});
        check = (MyDouble[][]) stub.create(1,1);
        MatrixBuilder matrixBuilder = new MatrixBuilder(stub);

        // act
        Matrix result = matrixBuilder.setA(stub.create(1,1).length).setB(stub.create(1,1)[0].length).toMatrix();

        // assert
        for (int i = 0; i < result.getA(); i++) {
            for (int j = 0; j < result.getB(); j++) {
                Assert.assertEquals(check[i][j].value, ((MyDouble) result.getMatrix()[i][j]).value);
            }
        }

    }


}