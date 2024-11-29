package dongalleto.modelo;

public class InsumoGalleta {
    private int idInsumo;
    private int idGalleta;
    
    // Constructores
    public InsumoGalleta() {
    }
    
    public InsumoGalleta(int idInsumo, int idGalleta) {
        this.idInsumo = idInsumo;
        this.idGalleta = idGalleta;
    }
    
    // Getters y Setters
    public int getIdInsumo() {
        return idInsumo;
    }
    
    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }
    
    public int getIdGalleta() {
        return idGalleta;
    }
    
    public void setIdGalleta(int idGalleta) {
        this.idGalleta = idGalleta;
    }
}
