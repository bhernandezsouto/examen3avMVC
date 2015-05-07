/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import java.util.Scanner;

/**
 *
 * @author Bea
 */
public class Presentacion {

    private Scanner sc = new Scanner(System.in);

    public Modelo escogerArea(Modelo obj) {
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        obj.shapeType = sc.nextLine();
        System.out.println("You said: " + obj.shapeType);
        return obj;
    }

    public Modelo datosSquare(Modelo obj) {
        System.out.println("what is the side length?");
        obj.varA = sc.nextFloat();
        return obj;
    }

    public Modelo datosRectangle(Modelo obj) {
        System.out.println("what is the rectangles width?");
        obj.varA = sc.nextFloat();
        System.out.println("What is the rectangles height?");
        obj.varB = sc.nextFloat();
        return obj;
    }

    public Modelo datosTriangle(Modelo obj) {
        System.out.println("What is the base length of the triangle?");
        obj.varA = sc.nextFloat();
        System.out.println("What is the height of the triangle?");
        obj.varB = sc.nextFloat();
        return obj;
    }
    public Modelo datosCircle (Modelo obj){
        System.out.println("What is the radius of the circle?");
        obj.varA = sc.nextFloat();
        return obj;
    }
    public void imprimirArea(Modelo obj) {
        System.out.println("The area for your " + obj.shapeType + " : " + obj.varArea);
    }
}
