/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TorroRecursivitat;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Turro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dia de navidad en que te encuentras?");
        int diaDeNavidad =  sc.nextInt();
        int trozosTurron =  contarTros(diaDeNavidad);
        int calories = contarCalorias(trozosTurron);
        
        System.out.println("Has consumido las siguiente calorias: " + calories);
        System.out.println("Has consumido los siguientes trozos: " + trozosTurron);
        
    }
        
    
    public static int contarTros(int dia){
        
        int tros;
        if (dia==0) {
            tros=0;
            return tros;
        }
        else if (dia==1) {
            tros=4;
            return tros;
        }
        else if (dia%3==0) {
            tros=1+contarTros(dia-1);
            return tros;
        }
        else if (dia>1) {
            tros=4+contarTros(dia-1);
            return tros;
        }
        return -1;
    }
    
    public static int contarCalorias(int dia){
        int cal = 91;
        if (dia==0) {
            cal=0;
            return cal;
        }
        else if (dia%3==0) {
           cal = (1 * cal) + contarCalorias(dia-1);
           return cal;
        }
        else if (dia>1) {
            cal = (cal * 4) + contarCalorias(dia-1);
            return cal;
        }
        return -1;
    }
}
