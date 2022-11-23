/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fractalsquadrats;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class FractalsQuadrats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el lado del cuadrado inicial");
        int lado = sc.nextInt();
    }
    
    public static int contarPerimetroFractal(int lado){
        if (lado==0) {
            return 0;
        }
        else if (lado==1) {
            return 4 * lado;
        }
        else if (lado>=1) {
            return 4*lado + 4 * contarPerimetroFractal(lado/2);
        }
        
}
