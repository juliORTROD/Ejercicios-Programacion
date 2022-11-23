/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bucledowhile;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class BucleDoWhile {

    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        
        do {
        System.out.print("Pon números, para terminar escribe 0: ");
        num=sc.nextInt();
            if (num<0) 
            {    
                System.out.println("Número negativo no es valido");
            }
            else 
            {
                System.out.println("Has escrito " + num);
            }
        System.out.println("Has escrito: " + num);     
        } while (num==0); //Condicion para que continue
        
        System.out.println("Programa terminado");
        
    }
    
}
