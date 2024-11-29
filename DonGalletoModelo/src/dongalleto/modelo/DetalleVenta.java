package dongalleto.modelo;

import java.time.LocalDateTime;

public class DetalleVenta {
    private int detalleVentaId;
    private int ventaId;
    private int galletaId;
    private int cantidad;

    // Constructor vacío
    public DetalleVenta() {
    }

    // HOLA

    // Constructor con parámetros
    public DetalleVenta(int detalleVentaId, int ventaId, int galletaId, int cantidad) {
        this.detalleVentaId = detalleVentaId;
        this.ventaId = ventaId;
        this.galletaId = galletaId;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public int getDetalleVentaId() {
        return detalleVentaId;
    }

    public void setDetalleVentaId(int detalleVentaId) {
        this.detalleVentaId = detalleVentaId;
    }

    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public int getGalletaId() {
        return galletaId;
    }

    public void setGalletaId(int galletaId) {
        this.galletaId = galletaId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" +
                "detalleVentaId=" + detalleVentaId +
                ", ventaId=" + ventaId +
                ", galletaId=" + galletaId +
                ", cantidad=" + cantidad +
                '}';
    }
}
