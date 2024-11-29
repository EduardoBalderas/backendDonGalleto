/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongalleto.dao;

import com.mysql.cj.jdbc.CallableStatement;
import dongalleto.modelo.Galleta;
import dongalleto.bd.ConexionMySQL;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DaoGalleta {

    public  List<Galleta> getAllG() throws ClassNotFoundException, SQLException, IOException {
        //Generar la consulta
        String query = "SELECT * FROM Galleta";

        //Conectarse a la BD
        ConexionMySQL connMySQL = new ConexionMySQL();

        //Abrir la conexion
        Connection conn = connMySQL.abrirConexion();
        //Crear el objeto que lleva la sentencia a la BD
        PreparedStatement pstmt = conn.prepareStatement(query);
        //Se ejecuta la sentencia y se recibe el resultado
        ResultSet rs = pstmt.executeQuery();

        List<Galleta> galleta = new ArrayList<>();
        //Se recorre el resultado de la consulta - rs
        while (rs.next()) {

            Galleta g = new Galleta();
            g.setId_galleta(rs.getInt("id_galleta"));
            g.setTipo(rs.getString("tipo"));
            g.setCantidad(rs.getInt("cantidad"));
            g.setDescripcion(rs.getString("descripcion"));

            galleta.add(g);
            System.out.println(galleta);

        }
        
        rs.close();
        pstmt.close();
        conn.close();
        connMySQL.cerrarConexion(conn);

        return galleta;

    }
    
    // Nuevo método para obtener la venta y sus detalles
    public List<Galleta> getVentaDetalles(int ventaId) throws ClassNotFoundException, SQLException, IOException {
        List<Galleta> detallesVenta = new ArrayList<>();
        ConexionMySQL connMySQL = new ConexionMySQL();
        Connection conn = connMySQL.abrirConexion();

        // Preparar llamada al procedimiento almacenado
        String sql = "{CALL usp_GalletaVenta_Seleccionar(?)}";
        CallableStatement cstmt = (CallableStatement) conn.prepareCall(sql);
        cstmt.setInt(1, ventaId);

        // Ejecutar el procedimiento
        boolean hasResults = cstmt.execute();
        
        if (hasResults) {
            ResultSet rsVenta = cstmt.getResultSet();
            if (rsVenta.next()) {
                // Aquí podrías procesar los datos de la venta si es necesario
                // Por ejemplo, imprimir información de la venta
                System.out.println("Venta ID: " + rsVenta.getInt("Venta_Id"));
                System.out.println("Fecha: " + rsVenta.getDate("Fecha"));
                System.out.println("Descripción: " + rsVenta.getString("Descripcion"));
                System.out.println("Total: " + rsVenta.getDouble("VentaTotal"));
            }
            // Obtener detalles de la venta
            if (cstmt.getMoreResults()) {
                ResultSet rsDetalles = cstmt.getResultSet();
                while (rsDetalles.next()) {
                    Galleta g = new Galleta();
                    g.setId_galleta(rsDetalles.getInt("Galleta_Id")); // Ajustar según tu modelo
                    g.setCantidad(rsDetalles.getInt("Cantidad")); // Ajustar según tu modelo
                    detallesVenta.add(g);
                }
                rsDetalles.close();
            }
            rsVenta.close();
        }
        
        cstmt.close();
        conn.close();
        connMySQL.cerrarConexion(conn);

        return detallesVenta;
    }
}
