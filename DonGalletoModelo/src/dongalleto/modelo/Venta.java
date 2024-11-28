/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongalleto.modelo;

/**
 *
 * @author Usuario
 */
public class Venta {
 private int id_venta;
 private String fecha;
 private String descrpcion;

    public Venta() {
    }

    public Venta(String fecha, String descrpcion) {
        this.fecha = fecha;
        this.descrpcion = descrpcion;
    }

    public Venta(int id_venta, String fecha, String descrpcion) {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.descrpcion = descrpcion;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta{");
        sb.append("id_venta:").append(id_venta);
        sb.append(", fecha:").append(fecha);
        sb.append(", descrpcion:").append(descrpcion);
        sb.append('}');
        return sb.toString();
    }
 
 
}
