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
    
    public List<Galleta> getAll() throws ClassNotFoundException, SQLException, IOException {
        
            return d.getAllG();
       
    }
    
   
}
