/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrapapertissoracorreccio;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class PedrapapertissoraCorreccio {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       int player_choose, computer_choose, winner;
       int point_player=0, point_computer=0,jugadas=0;
       
       do{
           
       player_choose = jugada();
       System.out.print("Jugador");
       imp_jugada(player_choose);
       computer_choose = jugada_ordenador();
       System.out.print("Ordenador ");
       imp_jugada(computer_choose);
       winner = ganador(player_choose,computer_choose);
       imp_ganador(winner);
       if (winner==1) {
           point_player++;
       }
       else if (winner==2) {
           point_computer++;
       }
       jugadas++;
           System.out.println("***** RESULTATS *****");
       marcador(point_player,point_computer);
       }while(point_player<3 && point_computer<3);
   }
    public static int jugada(){
        Scanner sc = new Scanner(System.in); 

        int eleccionjugador;
        
        do{
            
            System.out.print("Introduce un valor piedra(0), papel(1), tijera(2): ");
            eleccionjugador=sc.nextInt();
            
         
            
        }while(eleccionjugador<0 || eleccionjugador>2);
        return eleccionjugador;
    }
         
        public static int jugada_ordenador(){
        Random rd = new Random();
        int jugadaordenador = rd.nextInt(2);
        
        return jugadaordenador;
           }
        
        
        
      public static void imp_jugada(int player){

        
        if(player==0){
            
        System.out.println("Ha escogido PIEDRA");
            
        }
        
        else if(player==1){
                        
            System.out.println("Ha escogido PAPEL");
                        
                }
                        
        else if(player==2){
                        
            System.out.println("Ha escogido TIJERA");
        }
        else
        {
            System.out.println("Ha escogido una opcion incorrecta");
        }
                        

      }
      
       //SEPARACION GANADOR
        public static int ganador(int choose_player1, int choose_player2){   
        int ganador=0;
        if(choose_player1==choose_player2){
            
            System.out.println("0");
        }
        
        else if(choose_player1==0 && choose_player2==1){
        
                    System.out.println("2");
                    ganador = 2;
        }
        
         else if(choose_player1==1 && choose_player2==0){
        
                    System.out.println("1");
                    ganador = 1;
        
        }
        
            else if(choose_player1==0 && choose_player2==2){
        
                    System.out.println("1");
                    ganador=1;
        
        }
            
           else if(choose_player1==2 && choose_player2==0){
        
                    System.out.println("2");
                    ganador=2;
        
        }
        
        
           else if(choose_player1==1 && choose_player2==1){
        
                    System.out.println("0");
        
        }
        
           else if(choose_player1==1 && choose_player2==2){
        
                    System.out.println("2");
                    ganador=2;
        
        }
        
           else if(choose_player1==2 && choose_player2==1){
        
                    System.out.println("1");
                    ganador=1;
        
        }
        
           else if(choose_player1==2 && choose_player2==2){
        
                    System.out.println("0");
        
        }
        return ganador;
       }
        
        public static void imp_ganador(int ganador){
            if (ganador==1) {
                System.out.println("JUGADOR 1 GANA");
            }
            else if (ganador==2) {
                System.out.println("JUGADOR 2 GANA");
                
            }
            else{
                System.out.println("EMPATE");
            }
            
        }
        
        //SEPARACION MARCADOR
        public static void marcador(int point_player1, int point_player2){
        int ganador=0;

            do {
                
               point_player1++;
                System.out.println("Jugador 1: " + point_player1);
               
            } while (ganador==1 );
            
            do {
                
               point_player2++;
                System.out.println("Jugador 2: " + point_player2);
            } while (ganador==2);
            
            
            System.out.println("Marcador: JUGADOR1 = "+point_player1+" JUGADOR2= "+point_player2);
            
        }
     }