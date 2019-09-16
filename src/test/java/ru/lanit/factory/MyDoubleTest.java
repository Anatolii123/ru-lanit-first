package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyDoubleTest {

    /**
     * Тесты на проверку работоспособности методов
     */
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

    /**
     * Тесты на проверку вызываемых исключений
     */
    @Test
    public void addExceptions() {
        // arrange
        MyDouble md = new MyDouble(1D);
        MyDouble that = new MyDouble(5D);

        // act
        MyDouble res = (MyDouble) md.add(that);

        // assert
        Assert.assertEquals(6D,(Double) res.value,0D);
    }

    @Test
    public void subExceptions() {
        // arrange
        MyDouble md = new MyDouble(5D);
        MyDouble that = new MyDouble(1D);

        // act
        MyDouble res = (MyDouble) md.sub(that);

        // assert
        Assert.assertEquals(4D,(Double) res.value,0D);
    }

    @Test
    public void multExceptions() {
        // arrange
        MyDouble md = new MyDouble(5D);
        MyDouble that = new MyDouble(2D);

        // act
        MyDouble res = (MyDouble) md.mult(that);

        // assert
        Assert.assertEquals(10D,(Double) res.value,0D);
    }

    /**
     * Тесты на проверку крайних случаев
     */
    @Test
    public void addExtremeCases() {
        // arrange
        MyDouble md = new MyDouble(1D);
        MyDouble that = new MyDouble(5D);

        // act
        MyDouble res = (MyDouble) md.add(that);

        // assert
        Assert.assertEquals(6D,(Double) res.value,0D);
    }

    @Test
    public void subExtremeCases() {
        // arrange
        MyDouble md = new MyDouble(5D);
        MyDouble that = new MyDouble(1D);

        // act
        MyDouble res = (MyDouble) md.sub(that);

        // assert
        Assert.assertEquals(4D,(Double) res.value,0D);
    }

    @Test
    public void multExtremeCases() {
        // arrange
        MyDouble md = new MyDouble(5D);
        MyDouble that = new MyDouble(2D);

        // act
        MyDouble res = (MyDouble) md.mult(that);

        // assert
        Assert.assertEquals(10D,(Double) res.value,0D);
    }




}