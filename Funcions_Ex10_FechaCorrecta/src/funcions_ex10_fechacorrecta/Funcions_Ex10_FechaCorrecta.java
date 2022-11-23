/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions_ex10_fechacorrecta;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Funcions_Ex10_FechaCorrecta {

    //La funcion nos dirá si la fecha es correcta o incorrecta
    //Se usa un boolean
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dia, mes y año: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int año = sc.nextInt();
        
        boolean correcte = fechaCorrecta(dia,mes,año);
        if (correcte = true){
            System.out.println("FECHA CORRECTA");
        }
        else if (correcte = false) {
            System.out.println("FECHA INCORRECTA");
        }
    }
    
    
    public static boolean fechaCorrecta (int dia, int mes, int año){
        boolean correcte = true;
        if (año<1900) {
            correcte = false;
        }
        if (mes<1 || mes>12) {
            correcte = false;
        }
        if (dia<1 || dia>31) {
            correcte = false;
        }
       
        return correcte = false;
    }
    

