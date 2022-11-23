/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package detectar.numeros.pares;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class DetectarNumerosPares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //num%2==0 ES PAR
        //num%2==1 ES IMPAR
        
        Scanner sc = new Scanner(System.in);
        int minimo, maximo;
        System.out.println("Introduce valor minimo: ");
        minimo=sc.nextInt();
        System.out.println("Introduce valor maximo: ");
        maximo=sc.nextInt();
        
        for (int contador = minimo; contador <= maximo; contador++) {
            if (contador%2==0) {
                System.out.println(contador);
            }
           
        }
    }
    
}
