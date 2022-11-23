/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13bucles;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Ex13bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta
        adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el
        usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado).
        */
        Scanner sc = new Scanner(System.in);
        int maximo=1,minimo=100, mitad;
        char respuesta;
        
        do 
        {
        mitad=(maximo+minimo)/2;
        System.out.println("El numero que ha pensado es el: " + mitad + "?");
        System.out.println("He acertado? (M) es major (m) es menor i (es igual) ");
        respuesta = sc.next().charAt(0);
        mitad=(maximo+minimo)/2;
        
            if (respuesta=='M') {
                minimo=mitad;
            }
            else if (respuesta=='m') {
                maximo=mitad;
            }
            
        } while (respuesta!='i');
        System.out.println("Acerte!!!");  
    }
    
}
