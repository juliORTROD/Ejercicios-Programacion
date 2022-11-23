/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PotenciasElevadas;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class PotenciasElevadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base: ");
        int base = sc.nextInt();
        System.out.println("Dime la potencia: ");
        int potencia = sc.nextInt();
        
        System.out.println(potenciasFactoriales(base, base));
    }
    public static int potenciasFactoriales(int b, int p){
        int basepotencia;
        
        if (p<0) {
            return 1;
        }
        else if (p >= 1) {
            return p*potenciasFactoriales(b, p-1);
            }
        return 0;
        }
}
    

