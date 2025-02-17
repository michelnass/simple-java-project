package test.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    
    @Test
    void testGetMessage() {
        assertEquals("Hello from Jenkins!", HelloWorld.getMessage());
    }
}
