package ru.lanit.factory;

import jdk.nashorn.internal.objects.Global;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.lanit.exceptions.AdditionException;

import static org.junit.Assert.*;

public class MatrixSummatorTest extends AbstractTest {

    @Before
    public void getMatrices() {
        super.getMatrices();
        matrix3x3.setMatrix(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}});
        check3x3 = new MyDouble[][]{
                {new MyDouble(10d), new MyDouble(10d), new MyDouble(10d)},
                {new MyDouble(10d), new MyDouble(10d), new MyDouble(10d)},
                {new MyDouble(10d), new MyDouble(10d), new MyDouble(10d)}};
    }

    /**
     * Тесты на проверку работоспособности методов
     */
    @Test
    public void summarize_matrix3x3ANDreverseMatrix3x3_check3x3() throws AdditionException {
        // arrange
        Matrix operand1 = matrix3x3;
        Matrix operand2 = reverseMatrix3x3;

        // act
        Operations[][] s = new MatrixSummator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) check3x3[i][j]).value,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    /**
     * Тесты на проверку вызываемых исключений
     */
    @Test(expected = AdditionException.class)
    public void summarize_matrix3x3ANDmatrix2x3_AdditionException() throws AdditionException {
        // arrange
        Matrix operand1 = matrix3x3;
        Matrix operand2 = matrix2x3;

        // act
        Operations[][] s = new MatrixSummator().perform(operand1,operand2);
    }

    /**
     * Тесты на проверку крайних случаев
     */
    @Test
    public void summarize_maxMatrixANDmaxMatrix_maxCheck() throws AdditionException {
        // arrange
        Matrix operand1 = maxMatrix;
        Matrix operand2 = maxMatrix;

        // act
        Operations[][] s = new MatrixSummator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) maxCheck[i][j]).value,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    @Test
    public void summarize_matrix3x3ANDzeromatrix3x3_matrix3x3() throws AdditionException {
        // arrange
        Matrix operand1 = matrix3x3;
        Matrix operand2 = zeroMatrix3x3;

        // act
        Operations[][] s = new MatrixSummator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) operand1.getMatrix()[i][j]).value,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    @Test
    public void summarize_zeromatrix3x3ANDmatrix3x3_matrix3x3() throws AdditionException {
        // arrange
        Matrix operand1 = zeroMatrix3x3;
        Matrix operand2 = matrix3x3;

        // act
        Operations[][] s = new MatrixSummator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) operand2.getMatrix()[i][j]).value,((MyDouble) s[i][j]).value,0d);
            }
        }
    }
}