/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleatoris;

import java.util.Random;

/**
 *
 * @author juor7066
 */
public class Aleatoris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd= new Random();
        int aleatori;
        //rd.nextInt(la cantidad de numeros diferentes a dar) + (valor del más pequeño)
        System.out.println("Del 1 al 10");
        for (int i = 0; i < 10; i++) {
            aleatori =rd.nextInt(10)+1;
            System.out.println(aleatori + " ");
            
        }
        System.out.println("Del 5 al 15");
        for (int i = 0; i < 10; i++) {
            aleatori =rd.nextInt(11)+5;
            System.out.print(aleatori +"-");
        }
    }
}
    

