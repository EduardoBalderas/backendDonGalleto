package dongalleto.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author Sergio Esteban Vázquez Rizo
 */

public class Venta {
    private int ventaId;
    private LocalDate fecha;
    private String descripcion;
    private List<DetalleVenta> detalles;
    private double ventaTotal;
    
    // Constructores
    public Venta() {
    }
    
    public Venta(int ventaId, LocalDate fecha, String descripcion, List<DetalleVenta> detalles, double ventaTotal) {
        this.ventaId = ventaId;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.detalles = detalles;
        this.ventaTotal = ventaTotal;
    }
    
    // Getters y Setters
    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }

    public double getVentaTotal() {
        return ventaTotal;
    }

    public void setVentaTotal(double ventaTotal) {
        this.ventaTotal = ventaTotal;
    }
}
