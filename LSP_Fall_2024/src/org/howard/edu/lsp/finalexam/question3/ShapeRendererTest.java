package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Unit test class for the ShapeRenderer and ShapeFactory functionality
public class ShapeRendererTest {

    // Test to verify that the factory creates a Circle instance correctly
    @Test
    public void testCircleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance(); 
        Shape circle = factory.getShape("circle"); 
        assertNotNull(circle); 
        assertTrue(circle instanceof Circle); 
    }

    // Test to verify that the factory creates a Rectangle instance correctly
    @Test
    public void testRectangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance(); 
        Shape rectangle = factory.getShape("rectangle"); 
        assertNotNull(rectangle); 
        assertTrue(rectangle instanceof Rectangle); 
    }

    // Test to verify that the factory creates a Triangle instance correctly
    @Test
    public void testTriangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance(); 
        Shape triangle = factory.getShape("triangle");
        assertNotNull(triangle); 
        assertTrue(triangle instanceof Triangle); 
    }

    // Test to verify that the factory handles unknown shape types gracefully
    @Test
    public void testUnknownShape() {
        ShapeFactory factory = ShapeFactory.getInstance(); 
        Shape unknown = factory.getShape("hexagon"); 
        assertNull(unknown); 
    }
}
