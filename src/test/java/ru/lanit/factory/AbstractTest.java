package ru.lanit.factory;

import jdk.nashorn.internal.objects.Global;

public class AbstractTest {

    protected Matrix matrix3x3 = new Matrix();
    protected Operations[][] check3x3;
    protected Matrix matrix2x3 = new Matrix();
    protected Matrix matrix3x2 = new Matrix();
    protected Operations[][] check2x2;
    protected Matrix minMatrix = new Matrix();
    protected Matrix maxMatrix = new Matrix();
    protected Operations[][] maxCheck;
    protected Matrix matrix12 = new Matrix();
    protected Matrix matrix2 = new Matrix();
    protected Matrix matrix3x1 = new Matrix();
    protected Matrix matrix1x3 = new Matrix();
    protected Operations[][] check1x1;
    protected Matrix identityMatrix = new Matrix();
    private Matrix zeroMatrix3x3 = new Matrix();



    public void getMatrices() {
        minMatrix.setMatrix(new MyDouble[][]{
                {new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE)},
                {new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE)},
                {new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE), new MyDouble(-Double.MAX_VALUE)}});
        maxMatrix.setMatrix(new MyDouble[][]{
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)}});
        maxCheck = new MyDouble[][]{
                {new MyDouble(Global.Infinity), new MyDouble(Global.Infinity), new MyDouble(Global.Infinity)},
                {new MyDouble(Global.Infinity), new MyDouble(Global.Infinity), new MyDouble(Global.Infinity)},
                {new MyDouble(Global.Infinity), new MyDouble(Global.Infinity), new MyDouble(Global.Infinity)}};
        matrix3x2.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d)}});
        matrix2x3.setMatrix(new MyDouble[][]{
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)},
                {new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});
        check2x2 = new MyDouble[][]{
                {new MyDouble(12d), new MyDouble(12d)},
                {new MyDouble(12d), new MyDouble(12d)}};
        matrix3x1.setMatrix(new MyDouble[][]{
                {new MyDouble(2d)},
                {new MyDouble(2d)},
                {new MyDouble(2d)}});
        matrix1x3.setMatrix(new MyDouble[][]{{new MyDouble(2d), new MyDouble(2d), new MyDouble(2d)}});
        maxMatrix.setMatrix(new MyDouble[][]{
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)},
                {new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE), new MyDouble(Double.MAX_VALUE)}});

        matrix12.setMatrix(new MyDouble[][]{{new MyDouble(12d)}});
        matrix2.setMatrix(new MyDouble[][]{{new MyDouble(1d)}});
        check1x1 = new MyDouble[][]{{new MyDouble(12d)}};
        identityMatrix.setMatrix(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(0d), new MyDouble(0d)},
                {new MyDouble(0d), new MyDouble(1d), new MyDouble(0d)},
                {new MyDouble(0d), new MyDouble(0d), new MyDouble(1d)}});
        zeroMatrix3x3.setMatrix(new MyDouble[][]{
                {new MyDouble(0d), new MyDouble(0d), new MyDouble(0d)},
                {new MyDouble(0d), new MyDouble(0d), new MyDouble(0d)},
                {new MyDouble(0d), new MyDouble(0d), new MyDouble(0d)}});
    }



}
