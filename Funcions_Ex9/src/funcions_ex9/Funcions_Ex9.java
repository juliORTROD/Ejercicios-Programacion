/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions_ex9;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Funcions_Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce 3 valores para saber cual es el mayor: ");
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int mayor = mayorQue (n,m);
        
        if (l > mayor) {
            mayor = l;
        }
        else if (l < mayor) {
            mayor = mayor;
        }
        else {
            System.out.println("Son iguals");
        }
        System.out.println("El numero mayor es: " + mayor);
    }
    
    public static int mayorQue(int n, int m){
        int mayor=0;
       
            if (n > m) {
                mayor = n;
                
            }
            else if (n < m) {
                mayor = m;
                
            }
            else{
                System.out.println("Son iguales ");
            }
            
     return mayor;
    }
}
