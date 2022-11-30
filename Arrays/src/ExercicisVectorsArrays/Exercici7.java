/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicisVectorsArrays;

import java.util.Scanner;
import utilitats.Utilitats;

/**
 *
 * @author juor7066
 */
public class Exercici7 {

    /**
     * @param args the command line arguments
     */
//Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
//todos los valores desde P hasta Q, y lo muestre por pantalla.
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("introduce un valor entero que será el mínimo: ");
        int p = sc.nextInt();
        
        System.out.println("Introduce otro valor entero que sera el máximo");
        int q = sc.nextInt();
        
        final int tamany = q-p+1;
        int [] array = new int [tamany]; // Saber cuantos numeros hay entre P: minimo y Q: maximo.
        
        for (int i = 0; i < array.length; i++) {
            array [i] = q;
            ++q; //SUMARA EL MINIMO HASTA EL LLEGAR AL MAXIMO, EL CUAL ESTÁ ESTABLECIDO EN LA DIFERENCIA QUE HAY ENTRE EL MINIMO DEL MAXIMO DEL array.length
            
        }
       System.out.println("Mostrar array");
       Utilitats.mostrarArray(array);
    }
    
}
