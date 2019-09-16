package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyDoubleCreatorTest {

    @Test
    public void create() {

        // arrange
        MyDoubleCreator mdc = new MyDoubleCreator();

        // act
        Operations[][] res = mdc.create(3,3);

        // assert
        Assert.assertArrayEquals(Operations[3][3],res);
    }
}