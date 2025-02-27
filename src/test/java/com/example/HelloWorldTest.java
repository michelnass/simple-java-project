package test.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import main.java.com.example.HelloWorld;

public class HelloWorldTest {
    
    @Test
    void testGetMessage() {
        assertEquals("Hello from Jenkins 3!", HelloWorld.getMessage());
    }
    
    @Test
    void testCalculateBmi() {
        // Normal case
        assertEquals(24.69, HelloWorld.calculateBmi(80, 1.8), 0.01);
        
        // Edge cases - using the actual calculated value
        assertEquals(18.59, HelloWorld.calculateBmi(50, 1.64), 0.01);
        assertEquals(29.90, HelloWorld.calculateBmi(86.4, 1.7), 0.01);
        
        // Should throw exception for invalid inputs
        assertThrows(IllegalArgumentException.class, () -> {
            HelloWorld.calculateBmi(0, 1.8);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            HelloWorld.calculateBmi(80, 0);
        });
    }
    
    @Test
    void testCalculateBmiImperial() {
        // 5'10" (70 inches) and 160 pounds
        assertEquals(22.96, HelloWorld.calculateBmiImperial(160, 70), 0.01);
        
        // Should throw exception for invalid inputs
        assertThrows(IllegalArgumentException.class, () -> {
            HelloWorld.calculateBmiImperial(-5, 70);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            HelloWorld.calculateBmiImperial(160, -2);
        });
    }
    
    @Test
    void testGetBmiCategory() {
        assertEquals("Underweight", HelloWorld.getBmiCategory(18.4));
        assertEquals("Normal weight", HelloWorld.getBmiCategory(18.5));
        assertEquals("Normal weight", HelloWorld.getBmiCategory(24.9));
        assertEquals("Overweight", HelloWorld.getBmiCategory(25.0));
        assertEquals("Overweight", HelloWorld.getBmiCategory(29.9));
        assertEquals("Obese", HelloWorld.getBmiCategory(30.0));
        assertEquals("Obese", HelloWorld.getBmiCategory(40.0));
    }
}
