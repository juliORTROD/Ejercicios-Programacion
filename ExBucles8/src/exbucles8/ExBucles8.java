/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exbucles8;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class ExBucles8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont_nega=0, cont_posi=0, valores;
        do {
            System.out.print("Introduzca numeros, 0 para finalizar: ");
            valores=sc.nextInt();
                if (valores>0) 
                    {
                        cont_posi++;
                    }
                else if (valores<0)
                    {
                        cont_nega++;
                    }
            } while (valores!=0);
        
        System.out.println("Ha finalizao el programa");
        System.out.println("Ha introducido un total de " + cont_posi + " numeros positivos.");
        System.out.println("Ha introducido un total de "+ cont_nega + " numeros negativos.");
        
    }
    
}
