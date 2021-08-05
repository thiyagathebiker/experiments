package com.sample.mathlub;

import org.junit.Assert;
import org.junit.Test;

public class MathLibTest {

    @Test
    public void p_test_addInt(){
        MathLib ob = new MathLib();
        int c = ob.add(1,2);
        Assert.assertTrue(c == 3);
    }
}
