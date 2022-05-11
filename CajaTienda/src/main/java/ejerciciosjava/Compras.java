/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

/**
 *
 * @author GermanG
 */
public class Compras {

    public void comprasTienda(double total, double importeEntregado) {
        System.out.println("El total de la compra es"+total);
        if (importeEntregado == total) {
            System.out.println("Compra realizada con exito");
        } else if (importeEntregado < total) {
            System.out.println("Favor de efectuar el pago completo");
        } else {
            System.out.println("Compra Exitosa su cambio es:" + (importeEntregado - total));
        }
    }
}
