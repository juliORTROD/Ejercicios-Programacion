/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.para.imprimir.numeros.pares.entre.dos.numeros.de.usuario;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class ProgramaParaImprimirNumerosParesEntreDosNumerosDeUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros para que imprima los pares que hay entre ellos:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int minimo,maximo;
        
        if (num1<num2) {
           minimo = num1;
          maximo = num2;
        }
        else {
            minimo = num2;
            maximo = num1;
        }
        for (int i = minimo; i <= maximo; i++) {
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
    
}
