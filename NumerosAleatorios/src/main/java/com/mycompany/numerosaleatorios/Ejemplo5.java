/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.numerosaleatorios;

/**
 * Generar Aleatoriamente un dia de semana
 *
 * @author User
 */
public class Ejemplo5 {

  public static void main(String[] args) {
    int dia = (int) (Math.random() * 7 + 1);
    switch (dia) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("martes");
        break;
      case 3:
        System.out.println("miercoles");
        break;
      case 4:
        System.out.println("jueves");
        break;
      case 5:
        System.out.println("viernes");
        break;
      case 6:
        System.out.println("sábado");
        break;
      case 7:
        System.out.println("domingo");
        break;
      default:
    }
  }
}
