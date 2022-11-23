/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions_juego;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Funcions_juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int saldo = 100;
        int bola_player, apuesta, ball,dinero_ganado ;
        boolean winner;
        char seguir;
              
        do{
        bola_player = pedirNumero();
        int bet = Api();
        apuesta = pedirDineroApuesta(saldo);
        saldo = saldo - apuesta;
        System.out.println("saldo" + saldo);
        ball = caidaBola();
        pintaAsteriscos(ball);
        
        winner = comprobarResultado(ball,bola_player);
        
        if (winner==true) 
        {
            System.out.println("Has ganado");
            dinero_ganado = ganancias(apuesta,bola_player);
            saldo = saldo + dinero_ganado;
        }
        else
        {
            System.out.println("NO HAS ACERTADO");
        }
        seguir = seguirJugando();
    }while (continuarJugando(seguir,saldo));
    
        System.out.println("Tu saldo es: " + saldo);
}
    public static int caidaBola(){
      Random rd = new Random();
      int num = rd.nextInt(37);//PA QUE COJA EL 36
        
      return num;
    }
    
    public static void pintaAsteriscos (int num){
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }   
        System.out.println("*x: " + num);
    }
    
    public static int pedirNumero(){
    
        Scanner sc = new Scanner(System.in);
        int num;
            do {
                System.out.println("Introduce un numero: ((37 impar) (38 par))");
                num = sc.nextInt();
            } while (num <= 0 || num >= 39);
            
            return num;
}
    public static int pedirDineroApuesta(int domero_tienes){
        int valorApuesta = 0;
        System.out.println("Introduce cuanto dinero tienes: ");
        Scanner sc = new Scanner(System.in);
        int dineroTienes = sc.nextInt();
        do {
            
        System.out.println("INTRODUCE LA APUESTA: ");
        valorApuesta = sc.nextInt();
        
        } while (dineroTienes < valorApuesta || valorApuesta<=0);
        
        return valorApuesta;
    }
    
    public static int ganancias(int dinero_apostado, int num_apostado){
        int dinero_ganado=0;
        if(num_apostado >= 1 && num_apostado<=36){
            dinero_ganado = dinero_apostado*35;
        }
        else if (num_apostado==37 || num_apostado==38) {
            dinero_ganado = dinero_apostado*2;
        }
        
        return dinero_ganado;
    }
    
    public static char seguirJugando(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Quiere seguir jugando? SI: S/s o NO: N/n ");
        
        char opcion = sc.next().charAt(0);
        
        switch(opcion){
            case 's':
            case 'S':
                System.out.println("Ha decidido SI seguir jugando");
                
            case 'N':
            case 'n':
                System.out.println("Ha decidido NO seguir jugando");
        }
        
        return opcion;
    }
    
    public static boolean comprobarResultado(int bola, int num_apostado){
        if (bola==num_apostado) 
        {
            return true;
        }
        else if (bola%2==0 && num_apostado==37) 
        {
            return true;
        }
        else if (bola%2==1 && num_apostado==37) 
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public static boolean continuarJugando(char respuesta, int dinero){
        boolean correcto = false;
        if ((respuesta=='s' || respuesta=='S') && dinero>0) 
        {
            return true;
        }
        
        return correcto;
        
    }
}

