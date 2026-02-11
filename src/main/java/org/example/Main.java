package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Producto p1 = new Producto("1212", "Lapiz", 2000);
    Producto p2 = new Producto("1313", "Borrador", 1500);
    Producto p3 = new Producto("1414", "Cuaderno", 3500);
    Producto p4 = new Producto("1515", "Esfeero", 1200);


    Pedido ped1 = new Pedido("ped1", "Luis");

    // Agregar productos al pedido

    ped1.agregarProducto(p1);


    // Mostrar detalles del pedido

    ped1.mostrarDetalles();






    }
}