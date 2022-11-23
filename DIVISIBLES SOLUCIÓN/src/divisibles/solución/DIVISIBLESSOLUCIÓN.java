/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisibles.solución;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class DIVISIBLESSOLUCIÓN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num, cont_3=0, acum_num=0, cont_num=0;
        
        do {    
            
        System.out.println("Pon numeros");
        num = sc.nextInt();
        cont_num++; // PARA SABER CUANTOS NUMEROS SE HAN AÑADIDO
        
        if (num%3==0) {
            acum_num = acum_num + num;
            cont_3++; //SOLO CUENTA SI EL NUMERO ES DIVISIBLE ENTRE 3.
            System.out.println("divisible entre 3");
        }
        
        } while (cont_3<3);
        System.out.println("La suma acumulada de los 3 numeros es: " + acum_num);
        System.out.println("Has introducido: " + cont_num);
        
    }
        
    
}
