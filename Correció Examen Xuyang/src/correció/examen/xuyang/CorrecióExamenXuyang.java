/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package correció.examen.xuyang;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class CorrecióExamenXuyang {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);

     boolean comprobante = true;
       int n;
       while (comprobante == true){
           System.out.println("Ingrese el numero:");
           n = sc.nextInt();
           if (n > 0){
               for (int i =1;i <= 10; i++){
                   System.out.println(n+ " *" +i+" = "+n*i);
               }
               
           }
        
        
    }
    }
}



