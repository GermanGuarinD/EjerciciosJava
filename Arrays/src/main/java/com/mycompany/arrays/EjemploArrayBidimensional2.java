/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author User
 */
public class EjemploArrayBidimensional2 {

  public static void main(String[] args) throws InterruptedException {
    // Se añade esta línea para poder usar sleep
    int fila, columna;
    int[][] n = {{20, 4}, {67, 33}, {0, 7}};
    for (fila = 0; fila < 3; fila++) {
      System.out.print("Fila: " + fila);
      for (columna = 0; columna < 2; columna++) {
        System.out.printf("%10d ", n[fila][columna]);
        Thread.sleep(1000); // retardo de un segundo
      }
      System.out.println();
    }
  }
}
