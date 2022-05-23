/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bucles;

/**
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 *
 * @author User
 */
public class Ejercicio1 {

  public static void main(String[] args) {
    for (int i = 0; i < 101; i++) {
      if (i % 5 == 0) {
        System.out.println(i);
      }
    }
  }
}
