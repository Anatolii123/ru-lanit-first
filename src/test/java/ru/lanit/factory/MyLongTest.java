package ru.lanit.factory;

import jdk.nashorn.internal.objects.Global;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLongTest {

    /**
     * Тесты на проверку работоспособности методов
     */
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

    /**
     * Тесты на проверку вызываемых исключений
     */
    @Test(expected = ArithmeticException.class)
    public void addExceptions() throws ArithmeticException {
        // arrange
        MyLong md = new MyLong(1L);
        MyDouble that = new MyDouble(5d);

        // act
        MyLong res = (MyLong) md.add(that);

        // assert
        Assert.assertEquals(6D,(Long) res.value,0D);
    }

    @Test(expected = ArithmeticException.class)
    public void subExceptions() throws ArithmeticException {
        // arrange
        MyLong md = new MyLong(5L);
        MyDouble that = new MyDouble(1D);

        // act
        MyLong res = (MyLong) md.sub(that);

        // assert
        Assert.assertEquals(4D,(Long) res.value,0D);
    }

    @Test(expected = ArithmeticException.class)
    public void multExceptions() throws ArithmeticException {
        // arrange
        MyLong md = new MyLong(5L);
        MyDouble that = new MyDouble(2D);

        // act
        MyLong res = (MyLong) md.mult(that);

        // assert
        Assert.assertEquals(10D,(Long) res.value,0D);
    }

    /**
     * Тесты на проверку крайних случаев
     */
    @Test
    public void addExtremeCases() {
        // arrange
        MyDouble md = new MyDouble(Double.MAX_VALUE);
        MyDouble that = new MyDouble(Double.MAX_VALUE);

        // act
        MyDouble res = (MyDouble) md.add(that);

        // assert
        Assert.assertEquals(Global.Infinity,(Double) res.value,0D);
    }

    @Test
    public void subExtremeCases() {
        // arrange
        MyDouble md = new MyDouble(-Double.MAX_VALUE);
        MyDouble that = new MyDouble(Double.MAX_VALUE);

        // act
        MyDouble res = (MyDouble) md.sub(that);

        // assert
        Assert.assertEquals(-Global.Infinity,(Double) res.value,0D);
    }

    @Test
    public void multExtremeCases() {
        // arrange
        MyDouble md = new MyDouble(Double.MAX_VALUE);
        MyDouble that = new MyDouble(Double.MAX_VALUE);

        // act
        MyDouble res = (MyDouble) md.mult(that);

        // assert
        Assert.assertEquals(Global.Infinity,(Double) res.value,0D);
    }
}