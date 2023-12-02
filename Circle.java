/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pt3g12rayos;

/**
 *
 * @author janre
 */
class Circle extends DrawingObject {

    static double pi = 3.14;
    double radius;

    // Hiding class method moveTo
    static void moveTo(int newx, int newy) {
        System.out.println("Moving Circle to (" + newx + ", " + newy + ")");
    }

    // Overriding instance method resize
    @Override
    void resize(int p1, int p2) {
        System.out.println("Resizing Circle: Setting radius to " + p1);
        radius = p1;
    }
}
