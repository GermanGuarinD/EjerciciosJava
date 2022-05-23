/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.bucles;

import java.util.Scanner;

/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un número
 * de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y
 * si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author User
 */
public class Ejercicio7 {

  public static void main(String[] args) {
    int intentos = 4;
    int numeroIntroducido;
    boolean acertado = false;
    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      Scanner sc = new Scanner(System.in);
      numeroIntroducido = sc.nextInt();
      if (numeroIntroducido == 8888) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      intentos--;
    } while ((intentos > 0) && (!acertado));
    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
    }
  }
}
