/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4funcions;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Funcion_dimeSigno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un num y te dire el signo: ");
        int num = sc.nextInt();
        //cridar la funció signo
        int signo = dimeSigno(num);
        
        if (signo==-1) {
            System.out.println("Es positivo. ");
        }
        else if (signo==1) {
            System.out.println("Es negativo. ");
        }
        else if (signo==0) {
            System.out.println("Es cero. ");
        }
        else {
            System.out.println("Valor tiene que ser: -1, 0 o 1");
        }
    }
    
    public static int dimeSigno(int num){
        int signo;
        
        if (num<=1) {            
            signo=-1;
        }
        else if (num==0) {
            signo=0;
        }
        else if (num>=1) {
            signo=1;
        }
            return num;
    }        
    }

