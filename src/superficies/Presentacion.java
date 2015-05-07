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
    public void escogerArea(Modelo obj){
        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        obj.shapeType = sc.nextLine();
        System.out.println("You said: " + obj.shapeType);   
    }
}

