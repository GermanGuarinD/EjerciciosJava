/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente,
 * con la salvedad de que el anterior estaba limitado a números de 5 dígitos
 * como máximo. En esta ocasión, hay que realizar el ejercicio utilizando
 * bucles; de esta manera, la única limitación en el número de dígitos la
 * establece el tipo de dato que se utilice (int o long).
 *
 * @author User
 */
public class Ejercicio9 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int numeroDeDigitos = 1, n, numeroIntroducido;
    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    Scanner sc = new Scanner(System.in);
    numeroIntroducido = sc.nextInt();
    n = numeroIntroducido;
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
  }

}
