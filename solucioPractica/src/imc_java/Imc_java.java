/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc_java;

import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Imc_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        int altura=0,peso=0;
        int imc=calculoIndiceIMC(altura, peso);
        
        imc=interpretarIndiceIMC(imc);
        
        
    }
    
    
    
    public static int calculoIndiceIMC(int altura, int peso){
    Scanner sc= new Scanner(System.in);
    
    do{
    System.out.println("Introduce tu peso");
        peso=sc.nextInt();
    }while(peso>635);
        
    do{
        System.out.println("Introduce tu altura");
        altura=sc.nextInt();
    }while(altura>275);
        int imc=peso/(altura*altura);
        System.out.println("Tienes un IMC de : "+imc);
    
    
    
    return imc;
    }
    public static int interpretarIndiceIMC(int indiceIMC){
    
    
        System.out.println("CLASSIFICACIÓ IMC");
        
        if(indiceIMC<18.50){
            System.out.println("Peso bajo");
        
        }
        else if(indiceIMC>=25){
            System.out.println("Sobrepeso");}
        else{
            System.out.println("Peso normal");
        }
      
    
  return indiceIMC;  
}
}
