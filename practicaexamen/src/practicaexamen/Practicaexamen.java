/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamen;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Practicaexamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont_divisibles=0, cont_num=0, suma_divi=0;
       
        do {
            System.out.print("Escribe numeros: ");
            num = sc.nextInt();
            cont_num++;
            
            if (num%3==0) {
                
                System.out.println(" divisible ");
                cont_divisibles++;
                suma_divi = suma_divi + num;
            }
            
        } while (cont_divisibles<=3);
        
        System.out.println("Has intriducido: " + cont_num);
        System.out.println("De esos numeros: " + cont_divisibles + "son divisibles entre 3. ");
        System.out.println("Y la suma de los divisibles es: " + suma_divi);

    }
    
}
