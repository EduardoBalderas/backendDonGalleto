package dongalleto.modelo;

public class MermaGalleta {
    private int idMermaGalleta;
    private int idGalleta;
    private String tipo;
    private String descripcion;
    private int cantidad;
    
    // Constructor vacío
    public MermaGalleta() {
    }
    
    // Constructor con parámetros
    public MermaGalleta(int idMermaGalleta, int idGalleta, String tipo, String descripcion, int cantidad) {
        this.idMermaGalleta = idMermaGalleta;
        this.idGalleta = idGalleta;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }
    
    // Getters y Setters
    public int getIdMermaGalleta() {
        return idMermaGalleta;
    }

    public void setIdMermaGalleta(int idMermaGalleta) {
        this.idMermaGalleta = idMermaGalleta;
    }

    public int getIdGalleta() {
        return idGalleta;
    }

    public void setIdGalleta(int idGalleta) {
        this.idGalleta = idGalleta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
}
