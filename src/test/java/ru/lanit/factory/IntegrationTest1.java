package ru.lanit.factory;

import org.junit.Test;
import ru.lanit.second.Hello;

import java.util.List;

public class IntegrationTest1  {


    @Test
    public void readMatrices_OperationsListDevelopment_Output() throws Exception {
        MatrixReader matrixR = new MatrixReader();
        List<Matrix> matrices = matrixR.readMatrix(
                "C:\\Users\\kusakin\\IdeaProjects\\ru-lanit-first\\src\\main\\resources\\matrix");
        List<MatrixOperation> operations = Hello.operationsList(5);
        for (MatrixOperation operation : operations) {
            operation.perform(matrices.get(0), matrices.get(1));
            System.out.println();
        }
    }
}
