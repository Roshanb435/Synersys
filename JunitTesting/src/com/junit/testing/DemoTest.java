package com.junit.testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DemoTest {

    Demo d = new Demo();

    @Test
    public void testDisplay() {
        assertEquals("Demo Fetched", d.display());
    }
}
