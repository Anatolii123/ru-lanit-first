package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyDoubleTest {

    @Test
    public void add() {
        // arrange
        MyDouble md = new MyDouble(1D);
        MyDouble that = new MyDouble(5D);

        // act
        MyDouble res = (MyDouble) md.add(that);

        // assert
        Assert.assertEquals(6D,(Double) res.value,0D);
    }

    @Test
    public void sub() {
        // arrange
        MyDouble md = new MyDouble(5D);
        MyDouble that = new MyDouble(1D);

        // act
        MyDouble res = (MyDouble) md.sub(that);

        // assert
        Assert.assertEquals(4D,(Double) res.value,0D);
    }

    @Test
    public void mult() {
        // arrange
        MyDouble md = new MyDouble(5D);
        MyDouble that = new MyDouble(2D);

        // act
        MyDouble res = (MyDouble) md.mult(that);

        // assert
        Assert.assertEquals(10D,(Double) res.value,0D);
    }
}