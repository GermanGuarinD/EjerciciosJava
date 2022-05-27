/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author User
 */
public class Ejercicio2 {

  /**
   * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
   * elementos según la tabla que se muestra a continuación. Muestra el
   * contenido de todos los elementos del array. ¿Qué sucede con los valores de
   * los elementos que no han sido inicializados?
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    char[] caracteres = new char[10];
    caracteres[0] = 'a';
    caracteres[1] = 'x';
    caracteres[4] = '@';
    caracteres[6] = ' ';
    caracteres[7] = '+';
    caracteres[8] = 'Q';
    
    for (int i = 0; i < 10; i++) {
      System.out.println("" + caracteres[i]);
    }    
  }
}
