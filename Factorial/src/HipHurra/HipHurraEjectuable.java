/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HipHurra;

/**
 *
 * @author juor7066
 */
public class HipHurraEjectuable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=10;
        salut(num);
    }
    public static void salut(int n){
        if (n==0) {
            System.out.println("Hurra!!!");
        }
        else
        {
            System.out.println("Hip");    
            salut(n-1);
        }
    }
}
