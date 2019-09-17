package ru.lanit.factory;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Ignore
public class MyDoubleCreatorTest extends AbstractTest {

    @Test
    public void create() {

        // arrange
        MyDoubleCreator mdc = new MyDoubleCreator();
        MyDoubleCreator myDoubleCreator = mock(MyDoubleCreator.class);
        when(myDoubleCreator.create(3,3)).thenReturn(reverseMatrix3x3.getMatrix());

        Double[][] array = {{1D,2D,3D},{4D,5D,6D},{7D,8D,9D}};
        MyDoubleCreatorStub mdc2 = (MyDoubleCreatorStub) mdc;
        Operations[][] content = {
                        {new MyDouble(1d), new MyDouble(2d), new MyDouble(3d)},
                        {new MyDouble(4d), new MyDouble(5d), new MyDouble(6d)},
                        {new MyDouble(7d), new MyDouble(8d), new MyDouble(9d)}};
        mdc2.setContent(content);

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