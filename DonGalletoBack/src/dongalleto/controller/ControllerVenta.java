/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongalleto.controller;

import dongalleto.dao.DaoVenta;
import dongalleto.modelo.Galleta;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author checo
 */
public class ControllerVenta {
    static DaoVenta d= new DaoVenta();
     // Nuevo método para obtener una venta y sus detalles
    public List<Galleta> getVentaDetalles(int ventaId) throws SQLException {
        try {
            return d.getVentaDetalles(ventaId);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            
            return new ArrayList<>();
        }
    }
    
}
