package dongalleto.dao;

import dongalleto.bd.ConexionMySQL;
import dongalleto.modelo.Insumo;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoInsumo {

    private final ConexionMySQL conexionMySQL;

    public DaoInsumo() {
        this.conexionMySQL = new ConexionMySQL();
    }

    public List<Insumo> getAllInsumos() throws ClassNotFoundException, SQLException, IOException {
        List<Insumo> insumos = new ArrayList<>();
        String query = "SELECT * FROM Insumo";
        Connection conexion = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Abre la conexión a la base de datos
            conexion = conexionMySQL.abrirConexion();
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();

            // Procesa el resultado de la consulta
            while (rs.next()) {
                Insumo insumo = new Insumo(
                        rs.getInt("id_insumo"),
                        rs.getString("nombre"),
                        rs.getString("unidad"),
                        rs.getString("descripcion"),
                        rs.getInt("cantidad"),
                        rs.getString("fecha_caducidad")
                );
                insumos.add(insumo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new SQLException("Error al obtener los insumos: " + ex.getMessage(), ex);
        } finally {
            // Asegura el cierre de los recursos
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conexion != null) {
                conexionMySQL.cerrarConexion(conexion);
            }
        }

        return insumos;
    }
    
    
    public static void main(String[] args) {
        DaoInsumo dg=new DaoInsumo();
        try {
            System.out.println(dg.getAllInsumos());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoInsumo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoInsumo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DaoInsumo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}