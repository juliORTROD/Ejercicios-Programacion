/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenrecursiu;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class ExamenRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = llegirNumero(0);
        System.out.println("Indica també el teu any de naixement: ");
        int anyNaixement = sc.nextInt();

        System.out.println("Coneixes la teva contrasenya?: ");
        char opcioContrasenya = sc.nextLine().charAt(0);

        switch (opcioContrasenya) {
            case 'S':
            case 's':
                verificarCredencials(id, 0);
                if (verificarCredencials(anyNaixement, anyNaixement)==true) {
                    System.out.println("Totes les dades son correctes");
                    
                    System.out.println("0. Sortir"
                            + "1. Mostrar perfil d'usuari. ");
                    int eleccio = sc.nextInt();
                    if (eleccio==1) {
                        mostrarPerfilUsuari(id);
                    }
                    else if (eleccio==0) {
                        System.out.println("Fins aviat.");
                    }
                }
                else{
                    System.out.println("Dades incorrectes.");
                }
                break;

            case 'N':
            case 'n':
                int generacioContrasenya = generarContrasenya(llegirNumero(id));
                System.out.println("La teva contrasenya es: " + generacioContrasenya);
                break;
        }
        
    }
            
        
    

    public static int llegirNumero(int numero) {
//        Aquesta funció demana un número identificatiu que ha d'estar entre el 1001 i el 9999, si no, repetira la pregunta
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introdueix un numero id valid: ");
            numero = sc.nextInt();
        } while (numero < 1001 || numero > 9999);

        return numero;
    }

    public static int generarContrasenya(int identificador) {
        //Aquesta funció genera la contrasenya aplicant: (id * anyNaixement) / 10000

        Scanner sc = new Scanner(System.in);

        identificador = llegirNumero(identificador);
        System.out.print("Introdueix el teu any de naixement: (4 digits) ");
        int anyNaixement = sc.nextInt();

        int contrasenya = (identificador * anyNaixement) / 10000;
        System.out.println("La contrasenya es: " + contrasenya);
        return contrasenya;
    }
    
    public static boolean verificarCredencials(int identificador,  int contrasenya){
        // Aquest metode te la funcio de comprobar si la contrasenya coincideix amb la contrasenya que 
        boolean contrasenyaCorrecta=false;
        System.out.println("Introdueixi la contrasenya: ");
        Scanner sc = new Scanner(System.in);
        contrasenya = sc.nextInt();
        
        if (contrasenya==generarContrasenya(identificador)) {
            contrasenyaCorrecta = true;
            return contrasenyaCorrecta; 
        }
            
            return contrasenyaCorrecta; 
        }
    
    public static void mostrarPerfilUsuari(int id){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix el teu any de naixement per mostrar el perfil: ");
    
        int anyNaixement = sc.nextInt();
        int edat= anyNaixement - 2022;
        id = llegirNumero(id);
        int contrasenya =generarContrasenya(id);
        System.out.println("***************************");
        System.out.println(id + " - " + edat + " - " + contrasenya);
        System.out.println("***************************");
}
}

