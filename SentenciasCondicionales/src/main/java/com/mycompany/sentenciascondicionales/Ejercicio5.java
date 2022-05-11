/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sentenciascondicionales;

import java.util.Scanner;

/**
 * Ejercicio 5 Realiza un programa que resuelva una ecuación de primer grado
 * (del tipo ax+b = 0).
 *
 * @author German G
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Por favor, introduzca el valor de a:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        
        System.out.println("Por favor, introduzca el valor de b:");
        double b = sc.nextDouble();
        double x = (0 - b) / a;        
        System.out.println("x = "+ x);
    }

}
