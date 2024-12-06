package org.howard.edu.lsp.finalexam.question3;

//Interface defining the common behavior for all shapes
interface Shape {
 void draw(); // Method to be implemented by all shape classes for rendering
}

//Implementation of Shape interface for Circle
class Circle implements Shape {
 public void draw() {
     System.out.println("Drawing a Circle"); // Outputs drawing action for Circle
 }
}

//Implementation of Shape interface for Rectangle
class Rectangle implements Shape {
 public void draw() {
     System.out.println("Drawing a Rectangle"); // Outputs drawing action for Rectangle
 }
}

//Implementation of Shape interface for Triangle
class Triangle implements Shape {
 public void draw() {
     System.out.println("Drawing a Triangle"); // Outputs drawing action for Triangle
 }
}

//Factory class to create instances of different shapes
//Uses Singleton design pattern to ensure only one instance of the factory exists
class ShapeFactory {
 private static ShapeFactory instance; // Single instance of the factory

 // Private constructor to prevent direct instantiation
 private ShapeFactory() {}

 // Provides access to the singleton instance of the factory
 public static ShapeFactory getInstance() {
     if (instance == null) {
         instance = new ShapeFactory();
     }
     return instance;
 }

 // Returns an instance of a shape based on the type provided
 public Shape getShape(String shapeType) {
     if (shapeType == null) { // Handles null input gracefully
         return null;
     }
     // Match the shape type with the appropriate shape class
     switch (shapeType.toLowerCase()) {
         case "circle":
             return new Circle();
         case "rectangle":
             return new Rectangle();
         case "triangle":
             return new Triangle();
         default: // If no match is found, return null
             return null;
     }
 }
}

//Class responsible for rendering shapes using the ShapeFactory
public class ShapeRenderer {
 private final ShapeFactory factory; // Factory instance for creating shapes

 // Constructor initializes the factory instance
 public ShapeRenderer() {
     this.factory = ShapeFactory.getInstance(); // Uses the singleton factory
 }

 // Renders a shape based on the provided type
 public void renderShape(String shapeType) {
     Shape shape = factory.getShape(shapeType); // Get shape instance from factory
     if (shape != null) { 
         shape.draw(); 
     } else {
         System.out.println("Invalid shape type: " + shapeType); 
     }
 }

 // Main method to demonstrate rendering shapes
 public static void main(String[] args) {
     ShapeRenderer renderer = new ShapeRenderer();
     renderer.renderShape("circle"); 
     renderer.renderShape("rectangle"); 
     renderer.renderShape("triangle"); 
     renderer.renderShape("hexagon"); 
 }
}
