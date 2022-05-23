/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 *
 * @author User
 */
public class Ejercicio10 {

  public static void main(String[] args) {
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;
    System.out.println("Este programa calcula la media de los números positivos introducidos.");
    System.out.println("Vaya introduciendo números (puede parar introduciendo un número negativo");
    Scanner sc = new Scanner(System.in);
    while (numeroIntroducido >= 0) {
      numeroIntroducido = sc.nextDouble();
      numeros++;
      suma += numeroIntroducido;
    }
    System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido) / (numeros - 1));
  }

}
