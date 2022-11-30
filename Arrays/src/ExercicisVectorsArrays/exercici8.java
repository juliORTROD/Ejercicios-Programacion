/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExercicisVectorsArrays;

import java.util.Random;
import java.util.Scanner;
import utilitats.Utilitats;

/**
 *
 * @author juor7066
 */
public class exercici8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     inicializarAleatorio();
        
        mostrarArray(array);
        
        System.out.println("Introdueix un valor: ");
        int valorUsuario = sc.nextInt();
        int CuantosMayoresHay = 0;
        //INICIALITZEM I RECORREM L'ARRAY
        for (int i = 0; i < array.length; i++) {
            if (valorUsuario>=array[i]) {
             
                CuantosMayoresHay=CuantosMayoresHay+1;
                System.out.println("El numero de l'usuario es igual o superior al RANDOM: " + array[i]);
                
            }
            System.out.println("Hi han " + CuantosMayoresHay + " numeros mayores que los random. ");
        }

    }
    
        public static void mostrarArray(int[] valores){
    
        for (int i = 1; i < valores.length; i++) {
            System.out.println("Posicio " + i + " conte -> " + valores[i]);
        }
    }
        
        public static void inicializarAleatorio(int array[]){
             Random rd = new Random();
    
        array[] = new int[11];
    
        for (int i = 0; i < array.length; i++) {
            
            array[i] = rd.nextInt(50);
        }
        }
}
