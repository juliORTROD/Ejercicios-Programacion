/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11bucles;

/**
 *
 * @author juor7066
 */
public class Ex11Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*
    11. Realiza un programa que sume independientemente los pares y los impares de los números
    comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
    */
        int numeros;
        int acum_pares=0, acum_impar=0;
        
        for (numeros = 100; numeros <= 200; numeros++) {
            if (numeros%2==0) {
                
                acum_pares=acum_pares + numeros;
                System.out.println(acum_pares);
            }
            else 
            {
                acum_impar=acum_impar+numeros;
                //acum_impar += numeros;
                System.out.println("Impar " + acum_impar);
            }
        }
            System.out.println("La suma de los pares es: " + acum_pares);
            
            System.out.println("La suma de los impares es: "+ acum_impar);
        }
    }

