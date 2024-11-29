package dongalleto.modelo;

public class CompraInsumo {
    private int idCompra;
    private int idInsumo;
    private int cantidad;
    
    // Constructor
    public CompraInsumo(int idCompra, int idInsumo, int cantidad) {
        this.idCompra = idCompra;
        this.idInsumo = idInsumo;
        this.cantidad = cantidad;
    }
    
    // Constructor vacío
    public CompraInsumo() {
    }
    
    // Getters y Setters
    public int getIdCompra() {
        return idCompra;
    }
    
    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
    
    public int getIdInsumo() {
        return idInsumo;
    }
    
    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
