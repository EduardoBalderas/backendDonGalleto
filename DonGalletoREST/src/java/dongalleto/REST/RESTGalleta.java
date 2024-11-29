/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dongalleto.REST;

import com.google.gson.Gson;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import dongalleto.controller.ControllerGalleta;
import dongalleto.modelo.Galleta;
import jakarta.ws.rs.PathParam;

/**
 *
 * @author Aaron
 */
@Path("galleta")
public class RESTGalleta {
    @Path("getGalleta")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGalleta() {
        String out = "";
        ControllerGalleta galleta = new ControllerGalleta();
        List<Galleta> listaGalleta = galleta.getAll();
        Gson objGson = new Gson();
        out = objGson.toJson(listaGalleta);
        System.out.println(listaGalleta);
        return Response.ok(out).build();
    }
    
    // Nuevo endpoint para obtener detalles de una venta específica
    @Path("getVentaDetalles/{ventaId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVentaDetalles(@PathParam("ventaId") int ventaId) {
        String out = "";
        ControllerGalleta controller = new ControllerGalleta();
        
        List<Galleta> listaDetalles = controller.getVentaDetalles(ventaId);
        
        Gson objGson = new Gson();
        out = objGson.toJson(listaDetalles);
        
        return Response.ok(out).build();
    }
}

