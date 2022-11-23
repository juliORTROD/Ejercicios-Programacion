/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba3metodosstring;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Prueba3MetodosString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CONCATENAR STRINGS
//        String f1 = "Hola que tal?";
//        
//        String f2 = "Com estas?";
//        
//        String f3 = f1.concat(f2);
//        System.out.println(f3);
//        
//        // SI LA FRASE EMPIEZA POR:
//        if (f1.startsWith("Hola")) 
//        {
//            System.out.println("Empieza por Hola");
//        }
//        else
//        {
//            System.out.println("No empieza por Hola");
//        }
//        
//        //
//        System.out.println("ToUpperCase:::::" + f1.toUpperCase());
//        System.out.println("REPLACE::::" + f1.replace('a', 'e'));
//        System.out.println("REPEAT::::" + f1.repeat(4));
//        System.out.println("COMPARE::::" + f1.compareTo(f2));
        Scanner sc = new Scanner(System.in);
       String frase= sc.nextLine();
       contarVocales(frase);
    

    }
    
    public static int contarCaracteres (int caracteres)
    {
        System.out.println("Introduce una palabra o frase para saber el numero de caracteres: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        caracteres = s1.length();
        return caracteres;   
    }
    
    public static void FraseMayMin (String frase){ //VOID PORQUE SOLO MUESTRA,NO RETORNA
        System.out.println("Introduce una frase para mostrarla en MINUSCULAS y MAYUSCULAS");
        Scanner sc = new Scanner(System.in);
        
        frase = sc.nextLine();
        
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }
    
    public static void muestraFraseHor (String letra){ 
        //3.-Funcion que muestra una frase que recibe por
        //parámetros en vertical, una letra por linea
        Scanner sc = new Scanner(System.in);
        letra = sc.nextLine();
    }
    private static int contarA (String frase){
        int contA=0;
        for (int i = 0; i < frase.length(); i++) 
        {
            System.out.println("Posicion" + i + "caracter:");
            if (frase.charAt(i)=='a') 
            {
                System.out.println("ES UNA A");
                contA++;
            } 
        }
        return contA;
    }
    private static int contarVocales(String frase){
        int contadorVocales=0;
        for (int i = 0; i < frase.length(); i++) 
        {
            if (frase.charAt(i)=='A'
                ||frase.charAt(i)=='E'
                ||frase.charAt(i)=='I'
                ||frase.charAt(i)=='O'
                ||frase.charAt(i)=='U')
            {
            contadorVocales++;
            System.out.println("VOCAL");
            
            }
            System.out.println("Hay: " + contadorVocales + "vocales.");
        }
        return contadorVocales;
    }
    private static int contarCaracterFrase(String frase,char letra){
        int numCaracters=0;
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==letra) 
            {
                numCaracters++;
            }
            
        }
        return numCaracters;
    }
    
    private static void FraseSinEspacio(String frase){
        System.out.println("SOLUCION 1: ");
        System.out.println(frase.replace(" ",""));
        //TAMBIÉN SE PUEDE HACER: 
        System.out.println("SOLUCION 2: ");
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)!=' ') 
            {
                System.out.println(frase.charAt(i));
            }
        }
    }
}

    
