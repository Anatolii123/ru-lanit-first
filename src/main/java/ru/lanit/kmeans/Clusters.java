package ru.lanit.kmeans;

import org.apache.commons.math3.ml.clustering.Clusterable;


public class Clusters implements Clusterable {
    private double[][] points;
    private Integer location;

    public Clusters(Integer location) {
        this.location = location;
        this.points = new double[][]{
                {1,1},{1,2},{1,3},{1,4},{1,5},{2,1},{2,2},{2,3},{2,4},{3,1},{3,2},{3,3},{4,1},{4,2},{5,1},
                {6,2},{6,3},{6,4},{6,5},{6,6},{5,3},{5,4},{5,5},{5,6},{4,4},{4,5},{4,6},{3,5},{3,6},{2,6}};
    }

    public Integer getLocation() {
        return location;
    }

    @Override
    public double[] getPoint() {
        return new double[0];
    }

    public void setPoint(double[][] points){
        this.points = points;
    }

    public double[] getValue(int i){
        return points[i];
    }

    public void setValue(int i, double[] value){
        this.points[i] = value;
    }

}
