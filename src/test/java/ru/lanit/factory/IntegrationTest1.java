package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.lanit.second.Hello;

import java.util.List;

public class IntegrationTest1 extends AbstractTest {

    private MatrixReader matrixR = new MatrixReader();

    @Before
    public void getDoubleCreator() {
        check3x3 = new MyDouble[][]{
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d), new MyDouble(12d)}};

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


        List<MatrixOperation> operations = Hello.operationsList(5);
        for (MatrixOperation operation : operations) {
            operation.perform(matrices.get(0), matrices.get(1));
            System.out.println();
        }
    }
}
