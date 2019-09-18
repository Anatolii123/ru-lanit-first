package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.lanit.second.Hello;

import java.util.ArrayList;
import java.util.List;

public class IntegrationTest1 extends AbstractTest {

    private MatrixReader matrixR = new MatrixReader();
    private List<MatrixOperation> operations = Hello.operationsList(5);
    private Matrix checkMatrix1 = new Matrix();
    private Matrix checkMatrix2 = new Matrix();
    private List<Matrix> matrices = new ArrayList<Matrix>();

    @Before
    public void getCheck() {
        check3x3 = new MyDouble[][]{
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)}};

    }

    @Test
    public void readMatrices() throws Exception {
        matrices = matrixR.readMatrix(
                "C:\\Users\\kusakin\\IdeaProjects\\ru-lanit-first\\src\\main\\resources\\matrix");

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
    public void readMatrices_OperationsListDevelopment_Output() throws Exception {
        // arrange

        // act
        List<Matrix> matrices = matrixR.readMatrix(
                "C:\\Users\\kusakin\\IdeaProjects\\ru-lanit-first\\src\\main\\resources\\matrix");

        // assert
        for (int i = 0; i < matrices.size(); i++) {
            for (int j = 0; j < check3x3.length; j++) {
                for (int k = 0; k < check3x3[0].length; k++) {
                    Assert.assertEquals(((MyDouble) check3x3[i][j]).value,((MyDouble)matrices.get(i).getMatrix()[i][j]).value,0d);
                }
            }
        }

        // arrange

        // act
        for (MatrixOperation operation : operations) {
            operation.perform(matrices.get(0), matrices.get(1));
            System.out.println();
        }

        // assert
        checkMatrix1.setMatrix(check3x3);
        checkMatrix2.setMatrix(check3x3);
        for (MatrixOperation operation : operations) {
            Assert.assertEquals(operation.perform(checkMatrix1, checkMatrix2),operation.perform(matrices.get(0), matrices.get(1)));
        }
    }
}
