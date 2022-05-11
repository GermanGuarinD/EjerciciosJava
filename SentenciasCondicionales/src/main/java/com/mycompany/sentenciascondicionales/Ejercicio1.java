/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sentenciascondicionales;

import java.util.Scanner;

/*
Ejercicio 1
Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.

@author German G

 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese un dia de la semana");
        Scanner sc = new Scanner(System.in);
        String diaSemana = sc.nextLine();
        String asignatura;

        switch (diaSemana) {
            case "lunes":
                asignatura = "Matematicas";
                break;
            case "martes":
                asignatura = "Ingles";
                break;
            case "miercoles":
                asignatura = "Español";
                break;
            case "jueves":
                asignatura = "Sociales";
                break;
            case "viernes":
                asignatura = "Biologia";
                break;
            case "sabado":
                asignatura = "No hay clase";
                break;
            case "domingo":
                asignatura = "No hay clase";
                break;
            default:
                asignatura = "Ese dia de la semana no existe";
                break;
        }
        System.out.println("El dia " + diaSemana + " toca " + asignatura);
    }

}
