/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sentenciascondicionales;

import java.util.Scanner;

/**
 * Ejercicio2 Realiza un programa que pida una hora por teclado y que muestre
 * luego buenos días, buenas tardes o buenas noches según la hora. Se utilizarán
 * los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen
 * en cuenta las horas, los minutos no se deben introducir por teclado.
 *
 * @author German G
 *
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese una hora sin minutos: ");
        Scanner sc = new Scanner(System.in);
        int hora = sc.nextInt();
        
        if (hora>=6 && hora<=12) {
            System.out.println("Buenos dias");
        }
        if (hora>=13 && hora<=20) {
            System.out.println("Buenos tardes");
        }
        if (hora>=21 && hora<=5) {
            System.out.println("Buenos tardes");
        }
    }

}
