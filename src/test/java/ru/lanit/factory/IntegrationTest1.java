package ru.lanit.factory;

import org.junit.Test;
import ru.lanit.first.Matrix;
import ru.lanit.first.MatrixReader;

import java.util.List;

public class IntegrationTest1  {


    @Test
    public void readMatrices_OperationsListDevelopment_Output() {
    MatrixReader matrixR = new MatrixReader();
    List<Matrix> matrices = matrixR.readMatrix("D:\\matrix1.txt");
}
