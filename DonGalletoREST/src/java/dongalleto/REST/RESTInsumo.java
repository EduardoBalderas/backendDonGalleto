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
import dongalleto.controller.ControllerInsumo;
import dongalleto.modelo.Insumo;
import java.util.List;

@Path("insumo")
public class RESTInsumo {

    @Path("getInsumos")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getInsumos() {
        String out;
        ControllerInsumo controller = new ControllerInsumo();
        List<Insumo> listaInsumos = controller.getAll();
        if (listaInsumos.isEmpty()) {
            out = "{\"message\":\"No se encontraron insumos\"}";
            return Response.status(Response.Status.NO_CONTENT).entity(out).build();
        }
        Gson gson = new Gson();
        out = gson.toJson(listaInsumos);
        return Response.ok(out).build();
    }
}