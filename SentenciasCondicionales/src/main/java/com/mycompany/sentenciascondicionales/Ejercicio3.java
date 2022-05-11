/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sentenciascondicionales;

import java.util.Scanner;

/**
 * Ejercicio 3 Escribe un programa en que dado un número del 1 a 7 escriba el
 * correspondiente nombre del día de la semana.
 *
 * @author German G
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Por favor un numero del 1 al 7");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        if (numero >= 1 && numero <= 7) {
            String diaSemana = null;
            switch (numero) {
                case 1:
                    diaSemana = "Lunes";
                    break;
                case 2:
                    diaSemana = "Martes";
                    break;
                case 3:
                    diaSemana = "Miercoles";
                    break;
                case 4:
                    diaSemana = "Jueves";
                    break;
                case 5:
                    diaSemana = "Viernes";
                    break;
                case 6:
                    diaSemana = "Sabado";
                    break;
                case 7:
                    diaSemana = "Domingo";
                    break;            
            }
            System.out.println(diaSemana);

        }else{
            System.out.println("Dia no valido");
        }
    }

}
