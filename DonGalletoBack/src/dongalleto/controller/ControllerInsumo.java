/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongalleto.controller;

import dongalleto.modelo.Insumo;
import java.util.List;
import dongalleto.appservice.InsumoExternoAppService;

public class ControllerInsumo {
    private final InsumoExternoAppService appService;

    public ControllerInsumo() {
        this.appService = new InsumoExternoAppService();
    }

    public List<Insumo> getAll() {
    try {
        return appService.getAllInsumos();
    } catch (Exception ex) {
        ex.printStackTrace();
        return null;  // Puedes retornar una lista vacía o un mensaje de error más específico
    }
}
}