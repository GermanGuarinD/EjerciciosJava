/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sentenciascondicionales;

import java.util.Scanner;

/**
 * Ejercicio 7 Realiza un programa que calcule la media de tres notas.
 *
 * @author German G
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        System.out.println("Por favor la primer nota");
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        
        System.out.println("Por favor la segunda nota");        
        double nota2 = sc.nextDouble();
        
        System.out.println("Por favor la tercer nota");       
        double nota3 = sc.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("La media es " + media);
        
    }

}
