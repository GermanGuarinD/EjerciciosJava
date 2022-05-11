/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sentenciascondicionales;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 * Ejercicio 6 Realiza un programa que calcule el tiempo que tardará en caer un
 * objeto desde una altura h. Aplica la fórmula t = √ 2h g siendo g = 9:81m/s2
 *
 * @author German G
 */
public class Ejercicio6 {

    public static void main(String[] args) {
      System.out.println("Por favor, introduzca el valor de la altura");
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();        
        double t = sqrt((2*h)/9.81);
        System.out.println("El tiempo que tarda en caer el objeto es de " + t + " m/s");
    }

}
