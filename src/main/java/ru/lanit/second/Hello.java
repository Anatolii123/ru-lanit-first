package ru.lanit.second;


import org.apache.commons.math3.linear.Array2DRowFieldMatrix;
import org.apache.commons.math3.util.BigReal;
import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.ml.clustering.Cluster;
import org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Hello {

    public static void main (String[] args) throws Exception {

        BigReal[][] bg = createArray(3,3);
        Array2DRowFieldMatrix<BigReal> matrix3 = new Array2DRowFieldMatrix<BigReal>(bg);

        BigReal[][] bg2 = createArray2(3,3);
        Array2DRowFieldMatrix<BigReal> matrix4 = new Array2DRowFieldMatrix<BigReal>(bg2);
        System.out.println();
        showMatrix(matrix3);
        System.out.println();
        showMatrix(matrix4);

        /**
         * Сложение матриц
         */
        Array2DRowFieldMatrix<BigReal> matrix5 = matrix3.add(matrix4);
        System.out.println();
        System.out.println("Сумма матриц");
        showMatrix(matrix5);

        /**
         * Умножение матриц
         */
        Array2DRowFieldMatrix<BigReal> matrix6 = matrix3.multiply(matrix4);
        System.out.println();
        System.out.println("Умножение матриц");
        showMatrix(matrix6);

        System.out.println();
        doSolve();
        kMeansClustering();
    }

    public static void doSolve() {
        DerivativeStructure x = new DerivativeStructure(1, 3, 0, 2.5);
        System.out.println("x = " + x.getValue());
        DerivativeStructure x2 = x.pow(2);
        DerivativeStructure y = new DerivativeStructure(4.0, x2, 2.0, x); //y = 4x^2 + 2x
        System.out.println("y = 4x^2 + 2x");
        System.out.println("y = " + y.getValue());              // y    = 30.0
        System.out.println("y' = " + y.getPartialDerivative(1));
        System.out.println("y'' = " + y.getPartialDerivative(2));
        System.out.println("y''' = " + y.getPartialDerivative(3));
    }

    public static void kMeansClustering() {
        int[][] data = {
                {1,1},{1,2},{1,3},{1,4},{1,5},{2,1},{2,2},{2,3},{2,4},{3,1},{3,2},{3,3},{4,1},{4,2},{5,1},
                {6,2},{6,3},{6,4},{6,5},{6,6},{5,3},{5,4},{5,5},{5,6},{4,4},{4,5},{4,6},{3,5},{3,6},{2,6}
        };
        List<int[][]> data3 = Collections.singletonList(data);
        int clustersCount = 2;
        int[][] centroids = new int[][]{{0,4},{5,7}};
        List<int[][]> data4 = Collections.singletonList(centroids);
        Cluster cluster1 = new Cluster() {
            @Override
            public String toString() {
                return "Cluster 1";
            }
        };
        Cluster cluster2 = new Cluster() {
            @Override
            public String toString() {
                return "Cluster 2";
            }
        };
        for (int i=0;i<clustersCount;i++) {
            for (int j=0;j<data.length;j++) {

            }
        }



        System.out.println(data2[1].toString());

        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(2,100);
        kMeansPlusPlusClusterer.cluster(data3);
    }



    public static void showMatrix(Array2DRowFieldMatrix<BigReal> matrix) {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix.getEntry(i,j).doubleValue() + "\t");
            }
            System.out.println();
        }
    }

    public static BigReal[][] createArray(int a, int b) {
        BigReal[][] bg = new BigReal[a][b];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                bg[i][j] = new BigReal(a * i + j + 1);
            }
        }
        return bg;
    }

    public static BigReal[][] createArray2(int a, int b) {
        BigReal[][] bg = new BigReal[a][b];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                bg[i][j] = new BigReal(9 - a * i - j);
            }
        }
        return bg;
    }
}
