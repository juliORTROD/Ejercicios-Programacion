/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex17;

import java.util.Scanner;

/**
 *
 * @author juor7066
 */
public class Ex17 {
//En una ampliación del programa calcularemos la retención de impuesto que tiene nuestra nomina.
//•	Las tasas de impuestos son:
//•	Los primeros 500 euros son libres de impuestos.
//•	El resto tienen un 25% de impuestos. Para calcular impuestos que deberán restarse, son la cantidad(resto) que sea multiplicada por 25 y dividirlo por 100.
//Escribir nombre, salario bruto, tasas y salario neto(salario bruto-tasas).

    public static void main(String[] args) {
        int horas,hextra;
        double precio_horas;
        double salario=0, salario_horasnormales,salario_extra, impuestos;
        final int HORASNORMALES = 35, SALARIO_SINIMPUESTOS = 500;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Posa les hores treballades ");
        horas = sc.nextInt();
        
        System.out.println("Posa el preu que cobra per hores ");
        precio_horas = sc.nextDouble();
        
            if (horas > 35 )
            {
                salario_horasnormales = HORASNORMALES*precio_horas;
                hextra = horas - HORASNORMALES;
                salario_extra = precio_horas * hextra * 1.2;
                salario = salario_horasnormales + salario_extra;
            }
          
            else 
            {
                salario = horas * precio_horas;
            }
        
        System.out.println("Su salario será de " + salario + " €uros.");
        
        //impuestos
           double salario_final, salario_aplicat_impuestos;
           
           
            if (salario>SALARIO_SINIMPUESTOS) 
            {
                salario_aplicat_impuestos = salario - SALARIO_SINIMPUESTOS;
                impuestos = salario_aplicat_impuestos * 0.25;
                salario_final = salario_aplicat_impuestos - impuestos;
            }
            
            else 
            {
                salario_final=salario;
            }
            }
    }

