/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercici2Recursivitat;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class RecursivitatEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el numero de files: ");
        int files = sc.nextInt();
        
        bombetesPerFila(files);
        System.out.println("Al arbre hi han: " + bombetesPerFila(files) + " bombetes.");
             
     
    }
    
    public static int bombetesPerFila(int fila){
        int bombetes;
        int sumaDeBombetes = 0;
        if (fila==0) {
            bombetes=0;
            sumaDeBombetes = sumaDeBombetes + bombetes;
            return sumaDeBombetes;
        }
        else if (fila==1) {
            bombetes=1;
            sumaDeBombetes = sumaDeBombetes + bombetes;
            return sumaDeBombetes;
        }
        else if (fila>1) {
            bombetes = 2 + bombetesPerFila(fila-1);
            sumaDeBombetes =  sumaDeBombetes + bombetes + bombetesPerFila(fila-1);
            return sumaDeBombetes;
        }
        return -1;
    }
}
    
    


