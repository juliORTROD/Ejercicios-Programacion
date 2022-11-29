/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aranyesrecursiu;

/**
 *
 * @author juor7066
 */
public class AranyesRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aranyes = 2;
        int resultado = ContarPotes(aranyes);
        System.out.println(resultado);
    }

    public static int ContarPotes(int aranyes) {

        if (aranyes == 0) {
            return 0;
        } else if (aranyes == 1) {
            return 8;
        } else if (aranyes > 1) {
            return 8 + ContarPotes(aranyes - 1);
        }

        return -1;
    }
}
