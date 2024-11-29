/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongalleto.dao;

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
}
