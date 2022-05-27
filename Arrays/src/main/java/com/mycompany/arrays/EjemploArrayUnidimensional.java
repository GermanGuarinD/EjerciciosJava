/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjemploArrayUnidimensional {

  public static void main(String[] args) {
    // Array que se llena elemento por elemento
    int[] ejemploArray1;
    ejemploArray1 = new int[5];
    ejemploArray1[0] = 10;
    ejemploArray1[1] = 22;
    ejemploArray1[2] = 34;
    ejemploArray1[3] = 66;
    ejemploArray1[4] = 22;
    System.out.println(ejemploArray1[3]);

    //Array que se crea y se inicializa en una sola linea.
    int ejemploArray2[] = {2, 4, 6, 8,};
    System.out.println(ejemploArray2[2]);

    //Recorremos una Array e imprimimos todos los valores de esta
    for (int i = 0; i < 5; i++) {
      System.out.println("Los datos del array ejemploArray1 es: " + ejemploArray1[i]);
    }

    // Array que almacena caracteres
    char[] caracter = new char[5];
    caracter[0] = 'R';
    caracter[1] = '%';
    caracter[2] = '?';
    caracter[3] = '1';
    caracter[4] = '#';
    System.out.println("El array caracter contiene los siguientes elementos:");
    for (int i = 0; i < 5; i++) {
      System.out.println(caracter[i]);
    }

    // Array para calcular la media de las notas de un alumno
    double[] nota = new double[4];
    System.out.println("Para calcular la nota media necesito saber la ");
    System.out.println("nota de cada uno de tus exámenes.");
    for (int i = 0; i < 4; i++) {
      System.out.print("Nota del examen nº " + (i + 1) + ": ");
      Scanner sc = new Scanner(System.in);
      nota[i] =  sc.nextDouble();
    }
    System.out.println("Tus notas son: ");
    double suma = 0;
    for (int i = 0; i < 4; i++) {
      System.out.print(nota[i] + " ");
      suma += nota[i];
    }
    System.out.println("\nLa media es " + suma / 4);
    
    
    //Array de colores El programa genera una bandera de colores aleatorios.    
    String[] color = {"rojo", "amarillo", "verde", "blanco", "azul", "negro"};
    System.out.println("Generador aleatorio de banderas");
    Scanner sc = new Scanner(System.in);
    System.out.println("Cuantas franjas quiere que tenga la bandera? ");
    int franjas = sc.nextInt();
    System.out.println("--------------");
    for (int i = 0; i < franjas; i++) {
      System.out.println(color[(int)(Math.random()*6)]);
      System.out.println("--------------");
    }    
  }
}
