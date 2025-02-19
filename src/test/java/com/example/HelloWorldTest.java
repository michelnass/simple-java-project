package test.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import main.java.com.example.HelloWorld;

public class HelloWorldTest {
    
    @Test
    void testGetMessage() {
        assertEquals("Hello from Jenkins 3!", HelloWorld.getMessage());
    }
}
