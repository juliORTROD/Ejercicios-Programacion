/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SumaTotsParells;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class SumaTotsParells {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para sumar los pares hasta este mismo: ");
        int num = sc.nextInt();
        SumaPares(num);
        System.out.println("La suma de pares es: " + "");
    }
    public static int SumaPares (int n){
        int sumaN=0;
        
        if (n == 2) {
            return n; // es lo mismo que devolver 2
        }
        else if (n%2 == 1) { //Caso no admitido
            return -1;
        }
        else{
         return n + SumaPares(n-2);
        }
    }
}