/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongalleto.controller;

import dongalleto.dao.DaoGalleta;
import dongalleto.modelo.Galleta;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
public class ControllerGalleta {
    static private DaoGalleta d = new DaoGalleta();
    
    public List<Galleta> getAll() {
        try {
            return d.getAllG();
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(ControllerGalleta.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
    
    // Nuevo método para obtener una venta y sus detalles
    public List<Galleta> getVentaDetalles(int ventaId) {
        try {
            return d.getVentaDetalles(ventaId);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(ControllerGalleta.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }
}
