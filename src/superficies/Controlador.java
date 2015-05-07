package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Controlador {

    static Modelo mod = new Modelo();
    static Presentacion pre = new Presentacion();

        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pre.escogerArea(mod);

        if (mod.shapeType.equals("square")) {
            //add area calculations for square
            float squareArea;
            float sideLength;

            System.out.println("what is the side length?");
            sideLength = sc.nextFloat();
            squareArea = sideLength * sideLength;
            System.out.println("The area for your square: " + squareArea);

        }
        if (shapeType.equals("rectangle")) {
            //add area calculations for rectangle here
            float sideLength;
            float sideHeight;
            float rectangleArea;

            System.out.println("what is the rectangles width?");
            sideLength = sc.nextFloat();
            System.out.println("What is the rectangles height?");
            sideHeight = sc.nextFloat();
            rectangleArea = sideLength * sideHeight;
            System.out.println("The area for your rectangle is: " + rectangleArea);

        }
        if (shapeType.equals("triangle")) {
            //add area calculations for triangle here
            float baseLength;
            float height;
            float triangleArea;

            System.out.println("What is the base length of the triangle?");
            baseLength = sc.nextFloat();
            System.out.println("What is the height of the triangle?");
            height = sc.nextFloat();
            triangleArea = (float) (0.5 * baseLength * height);
            System.out.println("Your triangles area is: " + triangleArea);

        }
        if (shapeType.equals("circle")) {
            //add area calculations for a circle here
            float radius;
            float circleArea;

            System.out.println("What is the radius of the circle?");
            radius = sc.nextFloat();
            circleArea = radius * radius;
            circleArea = (float) (3.14159265 * circleArea);
            System.out.println("Your Circles area is " + circleArea);

        }

    }
}
