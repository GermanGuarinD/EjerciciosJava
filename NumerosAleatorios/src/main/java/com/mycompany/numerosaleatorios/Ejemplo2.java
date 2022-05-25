/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.numerosaleatorios;

/**
 * Generar numeros aleatorios entre 1 y 10
 *
 * @author User
 */
public class Ejemplo2 {

  public static void main(String[] args) {
    System.out.println("20 números aleatorios entre 1 y 10 (sin decimales):");
    for (int i = 1; i <= 20; i++) {
      System.out.print((int) (Math.random() * 10 + 1) + " ");
    }
    System.out.println();
  }
  
 

}
