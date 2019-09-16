package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class MyDoubleCreatorTest {

    @Test
    public void create() {

        // arrange
        MyDoubleCreator mdc = new MyDoubleCreator();
        Double[][] array = {{1D,2D,3D},{4D,5D,6D},{7D,8D,9D}};

        // act
        Operations[][] res = mdc.create(3,3);
        MyDouble[][] res2 = (MyDouble[][])res;

        // assert
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                Assert.assertEquals(array[i][j],res2[i][j].value);
            }
        }
    }

}