/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3ptc.funcions;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Exercici3PTCFuncions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix la teva estatura: ");
        double estatura = sc.nextDouble();
        
        System.out.print("Introdueix la teva massa: ");
        double massa = sc.nextDouble();
        
        double indiceIMC = calculoIndiceIMC(estatura, massa);
        
        interpretarIndiceIMC(indiceIMC);
        
        
    }
    
public static double calculoIndiceIMC(double massa, double estatura){
        
        double IMC = massa / (estatura * estatura);
        System.out.println(IMC);
        return IMC;
    }
    
    public static void interpretarIndiceIMC(double IMC){
        
        System.out.println("El teu IMC es: " + IMC);
        if (IMC<18.50) {
            System.out.println("Baix Pes");
        }
        if (IMC >= 18.50 && IMC <= 24.99) {
            System.out.println("Normal");
        }
        if (IMC >= 25) {
            System.out.println("Sobre pes");
        }
    }
    
}
