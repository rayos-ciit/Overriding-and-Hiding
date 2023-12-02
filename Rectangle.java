/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt3g12rayos;

/**
 *
 * @author janre
 */
class Rectangle extends DrawingObject {

    int width, height;

    static void moveTo(int newx, int newy) {
        System.out.println("Moving Rectangle to (" + newx + ", " + newy + ")");
        DrawingObject.moveTo(newx, newy); // Call the superclass method directly
    }

    // Overriding instance method resize
    @Override
    void resize(int p1, int p2) {
        System.out.println("Resizing Rectangle to (" + p1 + ", " + p2 + ")");
        super.resize(p1, p2); // Call the superclass method
    }
}
