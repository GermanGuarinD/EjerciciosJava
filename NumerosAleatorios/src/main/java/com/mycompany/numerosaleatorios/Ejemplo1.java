/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.numerosaleatorios;

/** Generar 20 numeros aleatorios entre 0 y 9
 *
 * @author User
 */
public class Ejemplo1 {

  public static void main(String[] args) {
    System.out.println("20 números aleatorios entre 0 y 9 (sin decimales):");
    for (int i = 1; i <= 20; i++) {
      System.out.print((int) (Math.random() * 10) + " ");
    }
    System.out.println();
  }
}
