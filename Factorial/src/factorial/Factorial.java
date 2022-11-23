/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Introdueix un valor per caluclar el factorial: ");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        System.out.println(valor + "! = " + factorial(valor));
        
    }
    
    public static int factorial(int n) throws InterruptedException{
            //HA DE TENIR 1 o MÉS CASOS BASE(QUE NO ES CRIDA A ELLA MATEIXA I JA DONA UN RESULTAT
            
            //HA D'HAVER-HI UNA O MES CRIDES RECURSIVES, ES CRIDAR-SE A ELLA MATEIXA PERO VARIANT EL VALOR DELS PARAMETRES DE LA CRIDA I POTSER ALGUNA OPERACIÓ
            
            if (n==1) 
            {
            return 1;
            }
            else if (n==0) 
            {
            return 1;
            }
//            if (n<=1) {
//            return 1;
//          }
            else //if n>1
            {
            System.out.println("Crido a " + n + " * factorial(" + (n-1) + ")");
            Thread.sleep(100);
           
            return n * factorial(n-1);
            }

            
    }
    
}
