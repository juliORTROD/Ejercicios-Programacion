/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenadorpensanumeronosaltresadivinem;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class OrdenadorPensaNumeroNosaltresAdivinem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numero,aleatori= rd.nextInt(51)+50;//Aixó ha d'estar fora del bucle, perque canviaria el numero en cada repeticio del bucle.
        
      
        do 
        {
        System.out.println("Dime un numero y dire si has acertado");
        numero = sc.nextInt();
        if (numero>aleatori) {
            System.out.println("Es mas pequeño.");
            
        }
        else if (numero<aleatori) {
            System.out.println("Es mas grande.");
        }
            else if (numero==aleatori) {
                System.out.println(""
                        + "!!ES IGUAL!!");
            }
        } while (true);
        }
        
       
    }
