/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exestructurasbucle;

/**
 *
 * @author juor7066
 */
public class ExEstructurasBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        for (i = 0; i < 6; i++) 
            {
                System.out.println("-->" +i);
                //aumento variable pero ya lo hace el i++ del for.            
            }
        
             System.out.println("bucle en un while");
        while (i<6)
        {
            System.out.println("*"+i);
            i++;
        }
        
        i=0;
        
        do
            {
                System.out.print("-"+i);
            } while (i<6);
    }
    
}
