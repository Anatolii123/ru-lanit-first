package ru.lanit.first;

import java.util.ArrayList;
import java.util.List;

public class NewClass extends MatrixReader {
    public void Hello() {
        System.out.println("Hello");
    }

    @Override
    public List<Matrix> readMatrix(String filepath) throws Exception {
        List<Matrix> matrices = new ArrayList<Matrix>();
        System.out.println("readMatrix");
        return matrices;
    }

}
