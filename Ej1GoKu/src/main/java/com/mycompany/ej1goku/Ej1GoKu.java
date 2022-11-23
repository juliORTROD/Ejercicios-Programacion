/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej1goku;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Ej1GoKu {

    public static void main(String[] args) {
        //Dibuja un ordinograma que recibe como datos de entrada una hora expresada en horas, minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo.
        Scanner sc = new Scanner(System.in);
        int hora;
        int minutos;
        int segundos;
        
               
        System.out.print("Por favor introduzca una hora ");
        hora = sc.nextInt();
        System.out.println("Ahora los minutos");
        minutos = sc.nextInt();
        System.out.println("Por últimos los segundos");
        segundos = sc.nextInt();
        
       
        if (segundos == 60)
        { segundos=0;
          minutos = minutos+1 ;
        if (segundos == 60){
            hora = hora+1;
            minutos = 0;
        }}
        
        System.out.print( "La hora más un segundo será " + hora + ":" + minutos + ":" + segundos + 1);
    }
}
