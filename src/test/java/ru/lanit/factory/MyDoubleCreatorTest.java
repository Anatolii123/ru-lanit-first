package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MyDoubleCreatorTest extends AbstractTest {

    @Test
    public void create() {
        // arrange
        MyDoubleCreator myDoubleCreator = mock(MyDoubleCreator.class);
        when(myDoubleCreator.create(3,3)).thenReturn(new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}});
        check3x3 = new MyDouble[][]{
                {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}};

        // act
        Operations[][] result = myDoubleCreator.create(3,3);

        // assert
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                Assert.assertEquals(((MyDouble) check3x3[i][j]).value,((MyDouble) result[i][j]).value,0d);
            }
        }
    }
}