/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.numerosaleatorios;

/**
 * Generar aleatoriamente un piedra, papel o tijera
 *
 * @author User
 */
public class Ejemplo4 {
  
  public static void main(String[] args) {
    System.out.println("Genera al azar piedra, papel o tijera:");
    int mano = (int) (Math.random() * 3); // genera un número al azar entre 0 y 2 ambos incluidos
    switch (mano) {
      case 0:
        System.out.println("piedra");
        break;
      case 1:
        System.out.println("papel");
        break;
      case 2:
        System.out.println("tijera");
        break;
      default:
    }
  }
}
