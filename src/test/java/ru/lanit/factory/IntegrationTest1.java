package ru.lanit.factory;

import org.junit.Test;
import ru.lanit.first.Matrix;
import ru.lanit.first.MatrixReader;
import ru.lanit.second.Hello;

import java.util.List;

public class IntegrationTest1  {


    @Test
    public void readMatrices_OperationsListDevelopment_Output() throws Exception {
        MatrixReader matrixR = new MatrixReader();
        List<Matrix> matrices = matrixR.readMatrix(
                "C:\\Users\\kusakin\\IdeaProjects\\ru-lanit-first\\src\\main\\resources\\matrix");
        List<MatrixOperation> operations = Hello.operationsList(5);


    }
}
