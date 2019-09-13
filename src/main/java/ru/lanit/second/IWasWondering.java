package ru.lanit.second;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.ml.clustering.Cluster;
import org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer;

import java.util.Collections;
import java.util.List;

public class IWasWondering {

    public static void main (String[] args) throws Exception {

        doSolve();
//        kMeansClustering();
    }

    public static void doSolve() {
        DerivativeStructure x = new DerivativeStructure(1, 3, 0, 3);
        DerivativeStructure e = new DerivativeStructure(1, 3, 0, Math.E);
        System.out.println("x = " + x.getValue());
        System.out.println();
        DerivativeStructure x2 = x.multiply(-2).multiply(e.pow(x.multiply(3))); //-2xe^3x
        DerivativeStructure x3 = x.pow(2).subtract(x.multiply(4)).add(3); //x^2-4x+3
        DerivativeStructure x4 = x.multiply(7).sin(); //sin7x
        DerivativeStructure x5 = x.pow(2).add(x.sin().log().multiply(4)); //x^2+4*ln(sinx)

        DerivativeStructure y = (x2.add(x3.multiply(x4))).divide(x5);
        System.out.println("    -2xe^3x+(x^2-4x+3)*sin7x\ny = -------------------------\n         x^2+4*ln(sinx)");
        System.out.println();
        System.out.println("y = " + y.getValue());
        System.out.println("y' = " + y.getPartialDerivative(1));
        System.out.println("y'' = " + y.getPartialDerivative(2));
        System.out.println("y''' = " + y.getPartialDerivative(3));

        DerivativeStructure z = new DerivativeStructure(1, 2, 0, 90);
        z.cos();

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

        KMeansPlusPlusClusterer kMeansPlusPlusClusterer = new KMeansPlusPlusClusterer(2,100);
        kMeansPlusPlusClusterer.cluster(data3);
    }

}
