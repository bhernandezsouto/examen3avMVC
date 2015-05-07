package superficies;

import java.util.Scanner;

/**
 * Examen de MVC 3ª Avaliación
 * Clase main contiene toda la logica del programa
 * @author bea
 */
public class Controlador {

    // objetos utilisados para el acceso a metodos y guardar los datos.
    static Modelo mod = new Modelo();
    static Presentacion pre = new Presentacion();

    /**
     * el metodo main se encarga de llamar a todos los metodos necesarios para
     * hacer el calculo del area de las figuras establecidas.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        pre.escogerArea(mod);

        if (mod.shapeType.equals("square")) {
            areaSquare();
        } else if (mod.shapeType.equals("rectangle")) {
            areaRectangle();
        } else if (mod.shapeType.equals("triangle")) {
            areaTriangle();

        } else if (mod.shapeType.equals("circle")) {
            areaCircle();
        } else {
            mod.shapeType = "";
            System.out.println("You have to enter the name of the geometric figures indicated in lowercase .\n"
                    + "Try again");
        }

    }

    /**
     * Metodo que calcula el area del circulo.
     */
    private static void areaCircle() {
        //add area calculations for a circle here
        pre.datosCircle(mod);
        mod.varArea = mod.varA * mod.varA;
        mod.varArea = (float) (3.14159265 * mod.varArea);
        pre.imprimirArea(mod);
    }

    /**
     * Metodo que calcula el area del triangulo.
     */
    private static void areaTriangle() {
        //add area calculations for triangle here
        pre.datosTriangle(mod);
        mod.varArea = (float) (0.5 * mod.varA * mod.varB);
        pre.imprimirArea(mod);
    }

    /**
     * Metodo que calcula el area del rectangulo.
     */
    private static void areaRectangle() {
        //add area calculations for rectangle here
        pre.datosRectangle(mod);
        mod.varArea = mod.varA * mod.varB;
        pre.imprimirArea(mod);
    }

    /**
     * Metodo que calcula el area del cuadrado.
     */
    private static void areaSquare() {
        //add area calculations for square
        pre.datosSquare(mod);
        mod.varArea = mod.varA * mod.varA;
        pre.imprimirArea(mod);
    }
}
