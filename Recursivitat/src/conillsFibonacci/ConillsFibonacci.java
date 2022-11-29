/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conillsFibonacci;

/**
 *
 * @author juor7066
 */
public class ConillsFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes =19;
        int parellesDeConills = ConillsFibonacci(mes);
        
        System.out.println("En el mes: " + mes + " haruan: " + ConillsFibonacci(mes) + " parelles de conills.");
        
    }
    
    public static int ConillsFibonacci(int mes){
        int parellesDeConills;
        if (mes<=1) {
            parellesDeConills = 1;
            return parellesDeConills;
        }
        else if (mes>1) {
            parellesDeConills = ConillsFibonacci(mes-1) + ConillsFibonacci(mes-2);
            return parellesDeConills;
        }
        return -1;
    }
}
