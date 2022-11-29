/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursivitat.HipHurra;

/**
 *
 * @author juor7066
 */
public class HipHurraRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroHips = 7;
        printHurra(numeroHips);
        
    }
    public static void printHurra(int n){
        if (n==0) {
            System.out.print("Hurra");
        }
        else if (n>=1) {
            System.out.print("Hip ");
            printHurra(n-1);
        }
    }
    
}
