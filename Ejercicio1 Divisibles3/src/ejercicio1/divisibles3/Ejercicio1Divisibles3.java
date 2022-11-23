/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1.divisibles3;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Ejercicio1Divisibles3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont_num=0 ,cont_3=0, suma_3=0, suma_total=0;
        do {
            System.out.println("Introduce un numero: ");
            num = sc.nextInt();

            cont_num++;
                if (num%3==0) {
                    suma_total=num+cont_3;
                    cont_3++;
                }
            
        } while (cont_3!=3);
        
        
        System.out.println("Has introduit: " + cont_num + " numeros");
        System.out.println("La suma total dels divisbles entre 3 sumen: " + suma_total);
    }
    
}
