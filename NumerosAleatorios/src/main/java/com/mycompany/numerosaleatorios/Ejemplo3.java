/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.numerosaleatorios;

/**
 * Generar 20 números enteros aleatorios entre 50 y 60 ambos incluidos.
 *
 * @author User
 */
public class Ejemplo3 {

  public static void main(String[] args) {
    // System.out.println("20 números aleatorios entre 50 y 60 (sin decimales):");
    for (int i = 1; i <= 20; i++) {
      System.out.print(((int) (Math.random() * 11) + 50) + " ");
    }
    System.out.println();
  }
}
