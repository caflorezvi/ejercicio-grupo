package modelo;

public class Producto {
    
    private String codigo, nombre;
    private int unidades;
    private float precio;

    public Producto(String codigo, String nombre, int unidades, float precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidades = unidades;
        this.precio = precio;
    }

}
