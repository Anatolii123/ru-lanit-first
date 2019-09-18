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
    private List<Matrix> matrices = new ArrayList<Matrix>();

    @Before
    public void getCheck() throws Exception {
        check3x3 = new MyDouble[][]{
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)}};
        matrices = matrixR.readMatrix(
                "C:\\Users\\kusakin\\IdeaProjects\\ru-lanit-first\\src\\main\\resources\\matrix");
    }

    @Test
    public void txtFile_ReadMatrices() throws Exception {
        // arrange

        // act

        // assert
        for (int i = 0; i < matrices.size(); i++) {
            for (int j = 0; j < check3x3.length; j++) {
                for (int k = 0; k < check3x3[0].length; k++) {
                    Assert.assertEquals(((MyDouble) check3x3[i][j]).value,((MyDouble)matrices.get(i).getMatrix()[i][j]).value,0d);
                }
            }
        }
    }

    @Test
    public void OperationsListDevelopment_Output() throws Exception {
        // arrange
        List<MatrixOperation> operations = Hello.operationsList(2);
        List<Operations[][]> result = new ArrayList<Operations[][]>();
        List<Operations[][]> checkResult = new ArrayList<Operations[][]>();

        // act
        for (int i = 0; i < operations.size(); i++) {
            result.add(operations.get(i).perform(matrices.get(1), matrices.get(1)));
            System.out.println();
        }

        // assert
        checkMatrix1.setMatrix(check3x3);
        checkMatrix2.setMatrix(check3x3);
        for (int i = 0; i < operations.size(); i++) {
            checkResult.add(operations.get(i).perform(checkMatrix1, checkMatrix2));
            System.out.println();
        }

        for (int i = 0; i < operations.size(); i++) {
            for (int j = 0; j < checkMatrix1.getA(); j++) {
                for (int k = 0; k < checkMatrix1.getB(); k++) {
                    Assert.assertEquals(((MyDouble)checkResult.get(i)[j][k]).value,
                            ((MyDouble)result.get(i)[j][k]).value,
                            0d);
                }
            }
        }
    }
}
