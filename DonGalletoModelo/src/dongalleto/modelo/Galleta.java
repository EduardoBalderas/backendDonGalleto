/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongalleto.modelo;

/**
 *
 * @author Eduardo Balderas
 */
public class Galleta {
    private int id_galleta;
    private String tipo;
    private int cantidad;
    private String descripcion;

    public Galleta() {
    }

    public Galleta(String tipo, int cantidad, String descripcion) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public Galleta(int id_galleta, String tipo, int cantidad, String descripcion) {
        this.id_galleta = id_galleta;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public int getId_galleta() {
        return id_galleta;
    }

    public void setId_galleta(int id_galleta) {
        this.id_galleta = id_galleta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Galleta{");
        sb.append("id_galleta:").append(id_galleta);
        sb.append(", tipo:").append(tipo);
        sb.append(", cantidad:").append(cantidad);
        sb.append(", descripcion:").append(descripcion);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
