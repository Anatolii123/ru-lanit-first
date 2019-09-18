package ru.lanit.factory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class MatrixSetter {

    public void setMatrixToFile(String filepath, List<Matrix> matrices2) throws Exception {
        String line;
        List<String> lines = new ArrayList<String>();
        List<List> matrices = new ArrayList<List>();
        Object[] linesAsArray;
        PrintWriter out = new PrintWriter(new FileWriter(filepath));
        BufferedReader br = new BufferedReader(new FileReader(filepath));
        for (int i = 0; i < matrices2.size(); i++) {
            out.write(readInternal(matrices2.get(0)).get(0));
        }
//        while ((line = br.readLine()) != null) {
//            if (line.length() == 0) {
//                matrices.add(new ArrayList<String>(lines));
//                lines.clear();
//                continue;
//            } else {
//                lines.add(line);
//            }
//        }
        matrices.add(new ArrayList<String>(lines));
        for (int i = 0; i < matrices.size(); i++) {
            linesAsArray = matrices.get(i).toArray(new String[matrices.get(i).size()]);
 //           matrices2.add(setInternal(matrices.get(i), linesAsArray));
            System.out.println();
        }
        System.out.println(matrices.size());
        out.close();
    }

    public List<String> readInternal(Matrix matrix) {
        List<String> lines = new ArrayList<String>();
        String[] String_Array = new String[matrix.getMatrix().length];
        for (int i = 0; i < String_Array.length; i++) {
            for (int j = 0; j < matrix.getMatrix()[0].length; j++) {
                if (j == 0) {
                    String_Array[i] = ((Integer)(((MyDouble)matrix.getMatrix()[i][j]).value.intValue())).toString()+",";
                    continue;
                }
                if (j < matrix.getMatrix()[0].length-1) {
                    String_Array[i] = String_Array[i]+((Integer)(((MyDouble)matrix.getMatrix()[i][j]).value.intValue())).toString()+",";
                    continue;
                }
                String_Array[i] = String_Array[i]+((Integer)(((MyDouble)matrix.getMatrix()[i][j]).value.intValue())).toString();
            }
        }
        for (int i=0;i<String_Array.length;i++) {
           lines.add(String_Array[i]);
        }
        return lines;
    }

}
