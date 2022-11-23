/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions_ex5_millasakilometros;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Funcions_ex5_MillasAKilometros {

    /**
     * @param args the command line arguments
     */
    
//  5. Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
//  Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
//  double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un valor entero en millas para convertirlo a KM: ");
        int millas = sc.nextInt();
        double km;
        km = Millas_a_Kilometros(millas);
        
        System.out.println(millas +" millas a KiloMetros son: " + km);
        
    }
    
    public static double Millas_a_Kilometros (int millas){
        double kil=0;
        kil = millas * 1.60934;
        return kil;
    }
            
}
