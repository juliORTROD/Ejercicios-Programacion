/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class EncontrarMaximoEnFuncion {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("maximo");
        
        
       
        
        
        //PEDIR 2 VALORES
        Scanner sc = new Scanner(System.in);
        double max;
        System.out.println("Introduce dos valores: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        
        //LLAMAR A LA FUNCION MAXIMO QUE RETORNARA EL VALOR
        //RECOGERLO EN OTRA VARIABLE
        max = maximo(num1,num2);
        
        //MOSTRAR EL VALOR MAXIMO RECOGIDO EN LA VARIABLE ANTERIOR
        System.out.println("maximo: " + max);
        double min = minimo(num1,num2);
        System.out.println("minimo: " + min);
       
}
    
    public static double maximo(double valor1, double valor2) {
        double max;
        if (valor1 < valor2){
            max = valor2;
        }
        
        else {
            max = valor1;
        }
       
        return max;
    }
    public static double minimo(double valor1, double valor2) {
        double min;
        if (valor1 > valor2){
            min = valor2;
        }
        
        else {
            min = valor1;
        }
       
        return min;
}
    
    
    
}
