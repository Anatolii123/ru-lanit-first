package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeVisitorTest {


    @Test
    public void visit() {
        // arrange
        TransposeVisitor transposeVisitor = new TransposeVisitor();
        Matrix a = new Matrix();
        a.setMatrix(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}});
        Operations[][] a1 = new Operations[a.getA()][a.getB()];

        MyDouble[][] b = {
                {new MyDouble(1d), new MyDouble(4d), new MyDouble(7d)},
                {new MyDouble(2d), new MyDouble(5d), new MyDouble(8d)},
                {new MyDouble(3d), new MyDouble(6d), new MyDouble(9d)}};

        // act
        a1 = transposeVisitor.visit(a);
        MyDouble[][] a2 = new MyDouble[a1.length][a1[0].length];

        // assert
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[0].length; j++) {
                a2[i][j] = (MyDouble) a1[i][j];
                Assert.assertEquals(b[i][j].value,a2[i][j].value,0d);
            }
        }
    }
}