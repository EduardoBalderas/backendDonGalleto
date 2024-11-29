package dongalleto.appservice;

import dongalleto.dao.DaoInsumo;
import dongalleto.modelo.Insumo;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class InsumoExternoAppService {

    private final DaoInsumo dao;

    public InsumoExternoAppService() {
        this.dao = new DaoInsumo();
    }

    public List<Insumo> getAllInsumos() {
        try {
            return dao.getAllInsumos();
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            ex.printStackTrace();
            return null;  // Maneja el error adecuadamente si es necesario
        }
    }
}