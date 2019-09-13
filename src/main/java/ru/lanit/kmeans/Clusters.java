package ru.lanit.kmeans;

import org.apache.commons.math3.ml.clustering.Clusterable;

import javax.xml.stream.Location;

public class Clusters implements Clusterable {
    private double[] points;
    private Location location;

    public Clusters(Location location) {
        this.location = location;
        this.points = new double[] { location.getColumnNumber(), location.getColumnNumber()};
    }

    public Location getLocation() {
        return location;
    }

    public double[] getPoint() {
        return points;
    }
}
