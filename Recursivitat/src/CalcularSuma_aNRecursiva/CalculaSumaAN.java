/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CalcularSuma_aNRecursiva;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class CalculaSumaAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Indica un numero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumaTotal = SumaAN(n);
        
        System.out.println("La suma de todos los numeros es: " + sumaTotal);
    }
    public static int SumaAN(int numero){
        int totalSuma=0;
        if (numero==0) {
            totalSuma = 0;
            return totalSuma;
        }
        else if (numero>1) {
            totalSuma = totalSuma+ numero+SumaAN(numero-1);
            return totalSuma;
        }
        return -1;
        
    }
    
}
