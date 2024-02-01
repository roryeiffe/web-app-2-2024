package com.revature.demo.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelperTest {

    @Test
    public void testAdd3() {
        Helper helper = new Helper();
        Assertions.assertEquals(10, helper.add3(3,4,3));
    }
}
