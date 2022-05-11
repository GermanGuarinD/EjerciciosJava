/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sentenciascondicionales;

import java.util.Scanner;

/**
 * Ejercicio 4 
 * Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
 *
 * @author German G
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Por favor digite el numero de horas trabajadas");
        Scanner sc = new Scanner(System.in);
        int horasTrabajadas = sc.nextInt();
        
        if (horasTrabajadas<=40) {
            System.out.println("El salario de la semana es de: " + (horasTrabajadas*12));
        } else{            
            System.out.println("El salario de la semana es de: " + ( (40*12)+ (horasTrabajadas - 40)*16));
        }
            
    }

}
