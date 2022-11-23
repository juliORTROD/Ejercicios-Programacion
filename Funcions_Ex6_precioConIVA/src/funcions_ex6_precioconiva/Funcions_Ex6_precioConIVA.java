/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions_ex6_precioconiva;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Funcions_Ex6_precioConIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Introduce 5 precios para mostrar el 21% de IVA aplicado: ");
        int num_articulos=0; 
        double precio;
        Scanner sc = new Scanner(System.in);
        
        while (num_articulos<=5) {
            System.out.println("Introduce precio de producto: ");
            precio = sc.nextDouble();
            num_articulos++;
            
            double precio_con_iva=0;
            
            precio_con_iva = precioConIVA(precio);
            System.out.println(precio_con_iva);
            
        }
    }
    public static double precioConIVA (double precio) {
       
       double precio_con_iva = precio * 1.21;
       
       return precio_con_iva;
    }
}
    

