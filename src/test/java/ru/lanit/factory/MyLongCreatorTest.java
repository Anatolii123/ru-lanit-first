package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyLongCreatorTest extends AbstractTest {

    @Test
    public void create() {
        // arrange
        MyLongCreator mdc = new MyLongCreator();
        MyLongCreator myLongCreator = mock(MyLongCreator.class);
        when(myLongCreator.create(3,3)).thenReturn(new MyLong[][]{
                {new MyLong(1L), new MyLong(2L), new MyLong(3L)},
                {new MyLong(4L), new MyLong(5L), new MyLong(6L)},
                {new MyLong(7L), new MyLong(8L), new MyLong(9L)}});
        check3x3 = new MyLong[][]{
                {new MyLong(1L), new MyLong(2L), new MyLong(3L)},
                {new MyLong(4L), new MyLong(5L), new MyLong(6L)},
                {new MyLong(7L), new MyLong(8L), new MyLong(9L)}};

        // act
        Operations[][] result = myLongCreator.create(3,3);

        // assert
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                Assert.assertEquals(((MyLong) check3x3[i][j]).value,((MyLong) result[i][j]).value,0d);
            }
        }
    }
}