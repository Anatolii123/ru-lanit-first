package ru.lanit.factory;

import ru.lanit.first.Matrix;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class MatrixReader {

    public List<ru.lanit.factory.Matrix> readMatrix(String filepath) throws Exception {
        String line;
        List<String> lines = new ArrayList<String>();
        List<List> matrices = new ArrayList<List>();
        List<ru.lanit.factory.Matrix> matrices2 = new ArrayList<ru.lanit.factory.Matrix>();
        Object[] linesAsArray;
        BufferedReader br = new BufferedReader(new FileReader(filepath));

        while ((line = br.readLine()) != null) {
            if (line.length() == 0) {
                matrices.add(new ArrayList<String>(lines));
                lines.clear();
                continue;
            } else {
                lines.add(line);
            }
        }
        matrices.add(new ArrayList<String>(lines));
        for (int i = 0; i < matrices.size(); i++) {
            linesAsArray = matrices.get(i).toArray(new String[matrices.get(i).size()]);
            matrices2.add(setInternal(matrices.get(i), linesAsArray));
            System.out.println();
        }
        System.out.println(matrices.size());
        br.close();
        return matrices2;
    }

    public ru.lanit.factory.Matrix setInternal(List<String> lines, Object[] linesAsArray) {
        ru.lanit.factory.Matrix mat = new ru.lanit.factory.Matrix();
        if (linesAsArray.length != 0) {
            String String_Array[] = new String[linesAsArray.length];
            for (int i=0;i<String_Array.length;i++)
                String_Array[i]=linesAsArray[i].toString();
            int[][] matrix = new int[lines.size()][String_Array[0].split(",").length];
            Operations[][] matrix2 = new Operations[matrix.length][matrix[0].length];
            for(int i = 0; i < lines.size(); i++) {
                for(int j = 0; j < String_Array[0].split(",").length; j++) {
                    matrix[i][j] = Integer.parseInt(String_Array[i].split(",")[j]);
                    matrix2[i][j] = new MyLong((long) matrix[i][j]);
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            mat.setMatrix(matrix2);
            mat.setA(matrix.length);
            mat.setB(matrix[0].length);
        }
        return mat;
    }
}
