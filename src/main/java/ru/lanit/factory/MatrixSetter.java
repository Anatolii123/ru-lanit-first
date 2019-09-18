package ru.lanit.factory;

import java.util.ArrayList;
import java.util.List;

public class MatrixSetter {


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

//        for (int i = 0; i < lines.size(); i++) {
//            for (int j = 0; j < String_Array[0].split(",").length; j++) {
//                matrix.getMatrix()[i][j] = Integer.parseInt(String_Array[i].split(",")[j]);
//                matrix2[i][j] = new MyDouble((double) matrix[i][j]);
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
        return lines;
    }

}
