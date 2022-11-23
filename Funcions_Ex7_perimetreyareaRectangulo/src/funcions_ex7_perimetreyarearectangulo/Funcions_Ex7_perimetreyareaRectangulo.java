/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions_ex7_perimetreyarearectangulo;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Funcions_Ex7_perimetreyareaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el ancho del rectangulo: ");
        double ancho = sc.nextDouble();
        
        System.out.print("Ahora introduce la altura: ");
        double alto = sc.nextDouble();
        
        double perimetro= perimetroRectangulo(ancho,alto);
        System.out.println(perimetro + " es el perimetro total.");
        
        double area = areaRectangulo(ancho,alto);
        System.out.println(area + " es el area total.");
        
    }
    
    public static double perimetroRectangulo (double ancho, double alto){
        double perimetro = (ancho*2) + (alto*2);
        return perimetro;
    }
    
    public static double areaRectangulo (double ancho, double alto){
        double area = ancho * alto;
        return area;
    }
    
}
