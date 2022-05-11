/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.sentenciascondicionales;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 * Ejercicio 8 Amplía el programa anterior para que diga la nota del boletín
 * (insuficiente, suficiente, bien, notable o sobresaliente).
 *
 * @author German G
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        System.out.println("Por favor la primer nota");
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();

        System.out.println("Por favor la segunda nota");
        double nota2 = sc.nextDouble();

        System.out.println("Por favor la tercer nota");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        
        if (media <= 1) {
            System.out.println("La media es " + media + " su calificacion es insuficiente");
        }
        if (media > 1 && media<=2) {
            System.out.println("La media es " + media + " su calificacion es suficiente");
        }
        if (media > 2 && media <=3) {
            System.out.println("La media es " + media + " su calificacion es bien");
        }
        if (media > 3 && media <=4) {
            System.out.println("La media es " + media + " su calificacion es notable");
        }
        if (media > 4) {
            System.out.println("La media es " + media + " su calificacion es sobresaliente");
        }
    }

}
