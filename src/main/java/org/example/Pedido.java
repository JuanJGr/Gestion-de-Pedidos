package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String numeropedido;
    private String cliente;

    private List<Producto> productos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(String numeropedido, String cliente) {
        this.numeropedido = numeropedido;
        this.cliente = cliente;
        this.productos = productos;
    }

    public String getNumeropedido() {
        return numeropedido;
    }

    public void setNumeropedido(String numeropedido) {
        this.numeropedido = numeropedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void mostrarDetalles() {

        System.out.println("Numero de Pedido: " + numeropedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Productos:");

        for (Producto producto : productos) {
            System.out.println("Codigo: " + producto.getCodigo()
                    + " | Nombre: " + producto.getNombre()
                    + " | Precio: " + producto.getPrecio());
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeropedido='" + numeropedido + '\'' +
                ", cliente='" + cliente + '\'' +
                ", productos=" + productos +
                '}';
    }
}
