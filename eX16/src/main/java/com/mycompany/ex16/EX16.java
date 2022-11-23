    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex16;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class EX16 {
    //Dibuja un ordinograma que recibe como datos de entrada una hora expresada en horas, minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo.
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int hora;
        int minutos;
        int segundos;
        
        //Leer hora minutos y segundos       
        System.out.print("Introduce una hora ");
        hora = sc.nextInt();
        System.out.print("Ahora los minutos ");
        minutos = sc.nextInt();
        System.out.print("Por últimos los segundos ");
        segundos = sc.nextInt();
        //Suma de la operación a realizar
        segundos = segundos + 1;
       //Condicionales
        if (segundos >= 60)
        { 
            segundos = 0;
            minutos = minutos++; //minutos +1
          if (minutos >= 60)
            {
              hora = hora + 1;
              minutos = 0; 
            }
        }
        System.out.print( "El segunfo siguiente es " + hora + ":" + minutos + ":" + segundos);
    }
    }

