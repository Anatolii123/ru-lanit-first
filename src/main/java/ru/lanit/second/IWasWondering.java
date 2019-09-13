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

        List<Clusters> data6 = new ArrayList<Clusters>();

        Integer[][] abc = {{1,1},{1,2},{1,3},{1,4},{1,5},{2,1},{2,2},{2,3},{2,4},{3,1},{3,2},{3,3},{4,1},{4,2},{5,1},
        {6,2},{6,3},{6,4},{6,5},{6,6},{5,3},{5,4},{5,5},{5,6},{4,4},{4,5},{4,6},{3,5},{3,6},{2,6}};


        data6.get(0).getPoints();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i != 6 - j - 1) {
                    int[] a = {i+1,j+1};
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
