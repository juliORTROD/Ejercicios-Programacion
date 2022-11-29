/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VirusTriple;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class TRIPLEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Dime el dia y te dire los virus?");
          int dia =  sc.nextInt();
          int virus= contarVirus(dia);
          System.out.println(virus);
      }
     
     public static int contarVirus(int dia){
     
    
         if(dia==1){
         
             return 1;
             
        }

         else if(dia>1){
         
             return 3*contarVirus(dia-1);
             
         }
         
         return -1;
    }
     
}
