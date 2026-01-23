package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DemoTest {

    Demo demo = new Demo();

    @Test
    void testDisplay() {
        assertEquals("Demo Fetched", demo.display());
    }
}
