/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicisArraysVectors;

import java.util.Scanner;
import utilitats.Utilitats;

/**
    *       ENUNCIAT EXERCICI.
    *       Crea un programa que pida diez números reales por teclado, los almacene en un array, y
             luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
 * @author juor7066
 */
public class maximominimoarrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int TAMANY = 8;
        int[] numeros = new int [TAMANY];
        
        //Demanar dades
        introducirDatosArray(numeros);
        Utilitats.mostrarArray(numeros);
        
        int  minimo, maximo;
        
        minimo = numeros[0]; //  Si solo leo un bucle este seguro que es el minimo.
        maximo = numeros[0];// Si solo leo un bucle este seguro que es el maximo.
        
        for (int index = 0; index < numeros.length; index++) {
            if (numeros[index]>maximo) {
                    maximo = numeros [index];
            }
            if (numeros[index]<minimo) {
                minimo = numeros[index];
            }
          }
        }
        
    
    
    private static void introducirDatosArray(int[]numeros){
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce valor " + (i+1) + "=" );
            numeros [i] = sc.nextInt();
        }
    }
}
