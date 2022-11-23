/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions_ex11_funciotablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Funcions_Ex11_FuncioTablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = sc.nextInt();
        
        taulaMultiplicar(numero);
        
    }
    
    public static void taulaMultiplicar (int num){
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + (i*num));
        }
    }
}