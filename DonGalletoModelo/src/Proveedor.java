public class Proveedor {
    private int idProveedor;
    private String nombre;
    
    // Constructor vacío
    public Proveedor() {
    }
    
    // Constructor con parámetros
    public Proveedor(int idProveedor, String nombre) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
    }
    
    // Getters y Setters
    public int getIdProveedor() {
        return idProveedor;
    }
    
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "Proveedor{" +
               "idProveedor=" + idProveedor +
               ", nombre='" + nombre + '\'' +
               '}';
    }
}
