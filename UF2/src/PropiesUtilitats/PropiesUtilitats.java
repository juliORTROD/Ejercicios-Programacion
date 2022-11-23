/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PropiesUtilitats;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class PropiesUtilitats {
    
    public static int DineroApuesta(int dineroTienes){
        int valorApuesta = 0;
        System.out.println("Introduce cuanto dinero tienes: ");
        Scanner sc = new Scanner(System.in);
        dineroTienes = sc.nextInt();
        do {
            
        System.out.println("INTRODUCE LA APUESTA: ");
        valorApuesta = sc.nextInt();
        
        } while (dineroTienes < valorApuesta || valorApuesta<=0);
        
        return valorApuesta;
}
}
