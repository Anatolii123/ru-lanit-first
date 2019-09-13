package ru.lanit.kmeans;

import org.apache.commons.math3.ml.clustering.Clusterable;


public class Clusters implements Clusterable {

    private double[] point;

    public Clusters(Integer location) {
        this.point = new double[2];


    }

    @Override
    public double[] getPoint() {
        return point;
    }

    public void setPoint(double[] point) {
        this.point = point;
    }
}
