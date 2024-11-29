package dongalleto.modelo;

public class MermaInsumo {
    private int idMermaInsumo;
    private int idInsumo;
    private String unidad;
    private String descripcion;
    private int cantidad;
    
    // Constructor vacío
    public MermaInsumo() {
    }
    
    // Constructor con parámetros
    public MermaInsumo(int idMermaInsumo, int idInsumo, String unidad, String descripcion, int cantidad) {
        this.idMermaInsumo = idMermaInsumo;
        this.idInsumo = idInsumo;
        this.unidad = unidad;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }
    
    // Getters y Setters
    public int getIdMermaInsumo() {
        return idMermaInsumo;
    }

    public void setIdMermaInsumo(int idMermaInsumo) {
        this.idMermaInsumo = idMermaInsumo;
    }

    public int getIdInsumo() {
        return idInsumo;
    }

    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
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
}
