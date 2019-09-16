package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLongTest {

    @Test
    public void add() {
        // arrange
        MyLong md = new MyLong(1L);
        MyLong that = new MyLong(5L);

        // act
        MyLong res = (MyLong) md.add(that);

        // assert
        Assert.assertEquals(6L,(Long) res.value,0L);
    }

    @Test
    public void sub() {
        // arrange
        MyLong md = new MyLong(5L);
        MyLong that = new MyLong(1L);

        // act
        MyLong res = (MyLong) md.sub(that);

        // assert
        Assert.assertEquals(4L,(Long) res.value,0L);
    }

    @Test
    public void mult() {
        // arrange
        MyLong md = new MyLong(5L);
        MyLong that = new MyLong(2L);

        // act
        MyLong res = (MyLong) md.mult(that);

        // assert
        Assert.assertEquals(10L,(Long) res.value,0L);
    }
}