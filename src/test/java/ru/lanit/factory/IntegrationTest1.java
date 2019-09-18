package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.lanit.second.Hello;

import java.util.ArrayList;
import java.util.List;

public class IntegrationTest1 extends AbstractTest {

    private MatrixReader matrixR = new MatrixReader();
    private Matrix checkMatrix1 = new Matrix();
    private Matrix checkMatrix2 = new Matrix();

    @Before
    public void getCheck() throws Exception {
        check3x3 = new MyDouble[][]{
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)}};
        checkMatrix1.setMatrix(check3x3);
        checkMatrix2.setMatrix(check3x3);
    }

    @Test
    public void txtFile_ReadMatrices_OperationsListDevelopment_Operate_SetMatrices_txtFile() throws Exception {
        /**
         * Чтение txt-файла и его запись в список матриц
         */
        // arrange

        // act
        List<Matrix> matrices = matrixR.readMatrix(
                ".\\src\\main\\resources\\matrix");

        // assert
        for (int i = 0; i < matrices.size(); i++) {
            for (int j = 0; j < check3x3.length; j++) {
                for (int k = 0; k < check3x3[0].length; k++) {
                    Assert.assertEquals(((MyDouble) check3x3[i][j]).value,((MyDouble)matrices.get(i).getMatrix()[i][j]).value,0d);
                }
            }
        }

        /**
         * Формирование списка операций над матрицами с заданным размером, выполнение
         * этих операций над матрицами и запись результатов в новый список матриц
         */
        // arrange
        List<MatrixOperation> operations = Hello.operationsList(5);
        List<Operations[][]> result = new ArrayList<Operations[][]>();
        List<Operations[][]> checkResult = new ArrayList<Operations[][]>();
        List<Matrix> results = new ArrayList<Matrix>();

        // act
        for (int i = 0; i < operations.size(); i++) {
            result.add(operations.get(i).perform(matrices.get(0), matrices.get(1)));
            Matrix newMatrix = new Matrix();
            newMatrix.setMatrix(result.get(i));
            results.add(newMatrix);
            System.out.println();
        }

        // assert
        for (int i = 0; i < operations.size(); i++) {
            checkResult.add(operations.get(i).perform(checkMatrix1, checkMatrix2));
            System.out.println();
        }
        {}
        for (int i = 0; i < operations.size(); i++) {
            for (int j = 0; j < checkMatrix1.getA(); j++) {
                for (int k = 0; k < checkMatrix1.getB(); k++) {
                    Assert.assertEquals(((MyDouble)checkResult.get(i)[j][k]).value,
                            ((MyDouble)result.get(i)[j][k]).value,
                            0d);
                }
            }
        }


        /**
         * Запись списка матриц в txt-файл
         */
        // arrange
        MatrixSetter lines = new MatrixSetter();

        // act
        lines.setMatrixToFile(
                ".\\src\\main\\resources\\result",results);

        // assert
        List<Matrix> matrices2 = matrixR.readMatrix(
                ".\\src\\main\\resources\\result");
        for (int i = 0; i < matrices2.size(); i++) {
            for (int j = 0; j < matrices2.get(i).getA(); j++) {
                for (int k = 0; k < matrices2.get(i).getB(); k++) {
                    Assert.assertEquals(((MyDouble) results.get(i).getMatrix()[j][k]).value,((MyDouble)matrices2.get(i).getMatrix()[j][k]).value,0d);
                }
            }
        }
    }
}
