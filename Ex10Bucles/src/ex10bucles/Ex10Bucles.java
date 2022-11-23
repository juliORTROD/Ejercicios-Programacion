/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10bucles;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Ex10Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        boolean diez=false;
        Scanner sc = new Scanner(System.in);
        
        
        
            
            do {
                System.out.println("Introduce la nota: ");
                nota=sc.nextInt();
                if (nota==10) 
                {
                    diez=true;
                }
        } while (nota!=-1);
            System.out.println("EL PROGRAMA HA TERMINADO");
        if (diez=true) 
        {
            System.out.println("Ha tenido un 10. ");   
        }
        else if (diez=false) {
            System.out.println("Ha tenido un: "+ nota);
        }
    }
}
