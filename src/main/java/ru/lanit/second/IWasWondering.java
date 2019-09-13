package ru.lanit.second;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructure;
import org.apache.commons.math3.ml.clustering.CentroidCluster;
import org.apache.commons.math3.ml.clustering.Cluster;
import org.apache.commons.math3.ml.clustering.DoublePoint;
import org.apache.commons.math3.ml.clustering.KMeansPlusPlusClusterer;
import ru.lanit.kmeans.Clusters;

import javax.xml.stream.Location;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IWasWondering {

    public static void main (String[] args) throws Exception {

        doSolve();
        kMeansClustering();
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


        List<int[]> data6 = new ArrayList<int[]>();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i != 6 - j - 1) {
                    int[] a = {i+1,j+1};
                    data6.add(a);
                }
            }
        }
        KMeansPlusPlusClusterer clusterer = new KMeansPlusPlusClusterer(2,10000);
        List<CentroidCluster<DoublePoint>> clusterResults = clusterer.cluster(data6);

        for (int i = 0; i < clusterResults.size(); i++) {

            System.out.println("Cluster " + i);
            System.out.println(clusterResults.get(i).getCenter());
        }

//        for (int i = 0; i < clusterResults.size(); i++) {
//            System.out.println("Cluster " + i);
//
//            for (data6 wineCluster : clusterResults.get(i).getPoints()) {
//                Wine wine = wineCluster.getWine();
//                System.out.println(wine);
//            }
//        }



    }

}
