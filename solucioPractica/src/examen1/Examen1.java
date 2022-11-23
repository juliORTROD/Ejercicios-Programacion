/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author semo3415
 */
public class Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int apostar=0;
        apostar=quantitat_apostada(apostar);
        
        int saldo;
        
        int tirada=tirada_disc();
        
        
        
                
    }
    public static int quantitat_apostada(int saldo){
    Scanner sc= new Scanner(System.in);
        System.out.println("Cuanto saldo tienes? ");
        saldo=sc.nextInt();
        int apostar=0;
        do{
        System.out.println("Cuanto quieres apostar? ");
        apostar=sc.nextInt();
        
        }while(saldo<apostar);
      return apostar;  
    }
    public static int tirada_disc(){
    Random rd= new Random ();
     
        int tirada=0;
        for (int i = 0; i < 3; i++) {
            
            tirada=rd.nextInt(3);
            System.out.print(tirada+"-");
            
            
           
        }
    return tirada;
        
    }
    public static boolean continuarJugando​(int saldo)
    {   System.out.println("Quieres seguir jugando?");
        boolean correcto= false;
        if(saldo>25 || saldo<=0)
        {
            correcto = true;
        }
        else{
        
        correcto =false;
        }
        return correcto;
        
    }
    
   
    
    
    
    //public static char mostrar_tirada(){}
}
