/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejmultiplos;

/**
 *
 * @author juor7066
 */
public class EjMultiplos {

    public static void main(String[] args) {
        int cont10 = 0, num = 12;
        
        do 
        {
            System.out.println(num);
            num++;
                if (num%7==0)
                    {       
                        cont10++;
                        System.out.println(num + " CONTADOR DE MULTIPLOS: " + cont10);
                     
                    }
        } while (cont10<10);
 
        
        }
    }

