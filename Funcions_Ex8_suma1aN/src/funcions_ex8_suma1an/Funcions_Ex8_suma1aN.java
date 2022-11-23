/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions_ex8_suma1an;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Funcions_Ex8_suma1aN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int num = sc.nextInt();
        
        int suma = suma1aN(num);
        System.out.println("La suma entre los numeros de 1 a " + num 
                + " es igual a= " + suma);
        
        int producto = producto1aN(num);
        System.out.println("La multiplicación de los numeros 1 a " + num 
                + " es igual a= " + producto);
        
        double meitat = intermedio1aN(num);
        System.out.println("La meitat entre 1 i " + num 
                + " es igual a= " + meitat);
        
    }
    
    public static int suma1aN(int n)
    {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }
        return suma;
    }
    
    public static int producto1aN(int n){
        int prod = n; // =1 perque les multiplicacions per 0 = 0
        for (int i = 1; i < n; i++) {
           prod = prod * i;
        }
        return prod;
    }
    
    public static double intermedio1aN(int n){
        //retorna el numero del medio entre 1 y n
        //per trobar la meitat entre dos numeros = sumar els dos numeros y dividir entre 2;
        
        double meitat = (double)(1 + n)/ 2; //(double) abans de la divisió per que retorni decimal.
        return meitat;
        
    }
}
