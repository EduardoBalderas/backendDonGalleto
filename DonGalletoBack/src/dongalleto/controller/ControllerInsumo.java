/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongalleto.controller;

import dongalleto.modelo.Insumo;
import java.util.List;
import dongalleto.appservice.InsumoExternoAppService;
import dongalleto.dao.DaoInsumo;
import java.io.IOException;
import java.sql.SQLException;

public class ControllerInsumo {

    static DaoInsumo di=new DaoInsumo();
    
    public List<Insumo> getAllInsumo() throws ClassNotFoundException, SQLException, IOException {
        
            return di.getAllInsumos();
       
    }
    
}
