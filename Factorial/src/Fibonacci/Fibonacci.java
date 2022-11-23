/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime en que mes quieres saber cuantas parejas de conejos tendrás: ");
        int mes = sc.nextInt();
        
        int conills=ConejosFibonacci(mes);
        System.out.println("En el mes" + mes + ", tendras " + conills + " conills.");
        
    }
    public static int ConejosFibonacci(int mes) {
        
        int parellesConills = 0; //CASO BASE
        if (mes <= 1) {
            return 1;
        }
        else if (mes>1)
        {
            int resultado = ConejosFibonacci(mes-1) + ConejosFibonacci(mes-2);
            return resultado;
        }
        return -1;
}
}
