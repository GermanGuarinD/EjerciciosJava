/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author User
 */
public class Ejercicio8 {

  public static void main(String[] args) {
    System.out.print("Introduzca un numero: ");
    Scanner sc = new Scanner(System.in);
    int numeroIntroducido = sc.nextInt();
    System.out.println("La tabla de Multiplicar del " + numeroIntroducido + " es: ");
    for (int i = 1; i < 11; i++) {
      System.out.println(numeroIntroducido + " x " + i + " = " + (numeroIntroducido * i));
    }
  }

}
