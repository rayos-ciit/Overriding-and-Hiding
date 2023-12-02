/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pt3g12rayos;

/**
 *
 * @author janre
 */
public class PT3G12Rayos {

    static void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        // Create instances of Rectangle and Circle
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();

        // Demonstrate overriding and hiding of methods
        DrawingObject objRect = rect;
        DrawingObject objCircle = circle;

        // Call class methods
        DrawingObject.moveTo(10, 20); // Calls the class method in DrawingObject
        Rectangle.moveTo(30, 40); // Calls the overridden class method in Rectangle
        Circle.moveTo(50, 60); // Calls the hidden class method in Circle

        // Call instance methods
        objRect.resize(100, 200); // Calls the overridden instance method in Rectangle
        objCircle.resize(50, 0); // Calls the overridden instance method in Circle
    }
}
