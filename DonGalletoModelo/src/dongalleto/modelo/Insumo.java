/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongalleto.modelo;

/**
 *
 * @author Aaron
 */
public class Insumo {
    private int id_insumo;
    private String nombre;
    private String unidad;
    private String descripcion;
    private int cantidad;
    private String fecha_caducidad;

    public Insumo() {
    }

    public Insumo(String nombre, String unidad, String descripcion, int cantidad, String fecha_caducidad) {
        this.nombre = nombre;
        this.unidad = unidad;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fecha_caducidad = fecha_caducidad;
    }

    public Insumo(int id_insumo, String nombre, String unidad, String descripcion, int cantidad, String fecha_caducidad) {
        this.id_insumo = id_insumo;
        this.nombre = nombre;
        this.unidad = unidad;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fecha_caducidad = fecha_caducidad;
    }

    public int getId_insumo() {
        return id_insumo;
    }

    public void setId_insumo(int id_insumo) {
        this.id_insumo = id_insumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Insumo{");
        sb.append("id_insumo:").append(id_insumo);
        sb.append(", nombre:").append(nombre);
        sb.append(", unidad:").append(unidad);
        sb.append(", descripcion:").append(descripcion);
        sb.append(", cantidad:").append(cantidad);
        sb.append(", fecha_caducidad:").append(fecha_caducidad);
        sb.append('}');
        return sb.toString();
    }
    
    
}
