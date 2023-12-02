/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt3g12rayos;

/**
 *
 * @author janre
 */
class DrawingObject {

    int locx, locy;

    // Class method for moving the object
    static void moveTo(int newx, int newy) {
        System.out.println("Moving DrawingObject to (" + newx + ", " + newy + ")");
    }

    // Instance method for resizing the object
    void resize(int p1, int p2) {
        System.out.println("Resizing DrawingObject to (" + p1 + ", " + p2 + ")");
    }
}
