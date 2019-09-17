package ru.lanit.factory;

import jdk.nashorn.internal.objects.Global;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.lanit.exceptions.AdditionException;
import ru.lanit.exceptions.MultiplicationException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class MatrixMultiplicatorTest extends AbstractTest {

    @Before
    public void getMatrices() {
        super.getMatrices();
        matrix3x3.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});
        check3x3 = new MyDouble[][]{
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)}};
    }

    /**
     * Тесты на проверку работоспособности методов
     */
    @Test
    public void multiply_matrix3x3ANDmatrix3x3_check3x3() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix3x3;
        Matrix operand2 = matrix3x3;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) check3x3[i][j]).value,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    @Test
    public void multiply_matrix2x3ANDmatrix3x2_check2x2() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix2x3;
        Matrix operand2 = matrix3x2;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1, operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) check2x2[i][j]).value, ((MyDouble) s[i][j]).value, 0d);
            }
        }
    }

    /**
     * Тесты на проверку вызываемых исключений
     */
    @Test(expected = MultiplicationException.class)
    public void multiply_matrix3x3ANDmatrix2x3_MultiplicationException() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix3x3;
        Matrix operand2 = matrix2x3;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);
    }

    /**
     * Тесты на проверку крайних случаев
     */
    @Test
    public void multiply_maxMatrixANDmaxMatrix_maxCheck() throws MultiplicationException {
        // arrange
        Matrix operand1 = maxMatrix;
        Matrix operand2 = maxMatrix;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) maxCheck[i][j]).value,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    @Test
    public void multiply_matrix12ANDmatrix2_check1x1() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix12;
        Matrix operand2 = matrix2;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) check1x1[i][j]).value,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    @Test
    public void multiply_matrix1x3ANDmatrix3x1_check1x1() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix1x3;
        Matrix operand2 = matrix3x1;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) check1x1[i][j]).value,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    @Test
    public void multiply_matrix3x3ANDidentityMatrix_matrix3x3() throws MultiplicationException {
        // arrange
        Matrix operand1 = matrix3x3;
        Matrix operand2 = identityMatrix;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) operand1.getMatrix()[i][j]).value,((MyDouble) s[i][j]).value,0d);
            }
        }
    }

    @Test
    public void multiply_identityMatrixANDmatrix3x3_matrix3x3() throws MultiplicationException {
        // arrange
        Matrix operand1 = identityMatrix;
        Matrix operand2 = matrix3x3;

        // act
        Operations[][] s = new MatrixMultiplicator().perform(operand1,operand2);

        // assert
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                Assert.assertEquals(((MyDouble) operand2.getMatrix()[i][j]).value,((MyDouble) s[i][j]).value,0d);
            }
        }
    }


}