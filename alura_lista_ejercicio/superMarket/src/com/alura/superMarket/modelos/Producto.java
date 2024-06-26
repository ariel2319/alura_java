package com.alura.superMarket.modelos;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

   /*  public void setPrecio(double precio) {
        this.precio = precio;
    } */

    @Override
    public String toString() {
        return "Producto: " + nombre + " - Valor: $" + precio + ";";
    }
/* 
    @Override
    public int compareTo(Producto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public int compareTo(Producto otroProducto) {
        // TODO Auto-generated method stub
        return this.getPrecio().compareTo(otroProducto.getPrecio());
    } */

    @Override
    public int compareTo(Producto o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}
