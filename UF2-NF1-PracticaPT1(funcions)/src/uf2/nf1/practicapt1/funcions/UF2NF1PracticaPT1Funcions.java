/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2.nf1.practicapt1.funcions;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class UF2NF1PracticaPT1Funcions {
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continua = true;
        do{
        quantitatApostada(0, 0);
        tiradaDisc();
        mostrarTirada(0, 0, 0);
        calcularPremi(0, 0, 0, 0);
        seguirJugant(0);
        
            
        
        }while (continua=true);
    }

    public static int quantitatApostada(int saldo, int bet) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el saldo disponible: ");
        saldo = sc.nextInt();

        do {

            System.out.println("Quina quantitat de saldo vol apostar?");
            bet = sc.nextInt();

        } while (bet > saldo);
        
        
        return bet;
    }

    public static int tiradaDisc() {
        Random rd = new Random();
        int tirada = rd.nextInt(2)+0;

        return tirada;
    }
    
    public static void mostrarTirada(int casilla1, int casilla2, int casilla3) {
        Random rd = new Random();
        casilla1 = rd.nextInt(2)+0;
        casilla2 = rd.nextInt(2)+0;
        casilla3 = rd.nextInt(2)+0;
        
        System.out.println("***************************");
        System.out.println("*****" + casilla1 + "-" + casilla2 + "-" + casilla3 + "*****");
        System.out.println("***************************");

    }
    
    public static int calcularPremi(int casilla0, int casilla1, int casilla2, int bet) {
        int ganancies = 0;

        if (casilla0 == 0 && casilla1 == 0 && casilla2 == 0) {
            ganancies = bet + 5;
            System.out.println("Guanyes 5");
        }
        if (casilla0 == 1 && casilla1 == 1 && casilla2 == 1) {
            ganancies = bet + 2;
            System.out.println("Guanyes 2");
        }
        if (casilla0 == 2 && casilla1 == 2 && casilla2 == 2) {
            ganancies = bet * 2;
            System.out.println("Guanyes el doble");
        } else {
            ganancies = ganancies;
            System.out.println("PERDS");
            
        }
        
        
        
        return ganancies;
    }
    
    public static boolean seguirJugant(int saldo) {
        
        boolean continua = true;
        
        if (!(saldo > 25 || saldo >= 0)) {
            return continua = true;
        } else {
            return continua = false;
        }
        
    }
    
}
   

