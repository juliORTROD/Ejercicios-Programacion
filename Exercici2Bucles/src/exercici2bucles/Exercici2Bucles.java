/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici2bucles;

/**
 *
 * @author juor7066
 */
public class Exercici2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador;
        //CONTADOR DE 2 EN 2
        for (contador=0;contador<201;contador=contador+2) 
        {
            System.out.println(contador);
        }
        
        for (contador=2;contador<201;contador++)
        {
            if (contador%2==0)//par
                
                System.out.println("par" + contador);
            
            } //Else no hace nada
            System.out.println(contador);
        }
    }

