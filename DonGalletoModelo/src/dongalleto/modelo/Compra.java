package dongalleto.modelo;

public class Compra {
    private int idCompra;
    private String fecha;
    private String total;
    private int idProveedor;
    
    // Constructor vacío
    public Compra() {
    }
    
    // Constructor con parámetros
    public Compra(int idCompra, String fecha, String total, int idProveedor) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.total = total;
        this.idProveedor = idProveedor;
    }
    
    // Getters y Setters
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
}
