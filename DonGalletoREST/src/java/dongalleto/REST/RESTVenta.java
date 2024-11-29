package dongalleto.REST;

import com.google.gson.Gson;
import dongalleto.controller.ControllerGalleta;
import dongalleto.controller.ControllerVenta;
import dongalleto.modelo.Galleta;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author checo
 */
public class RESTVenta {
     // Nuevo endpoint para obtener detalles de una venta específica
    @Path("getVentaDetalles/{ventaId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getVentaDetalles(@PathParam("ventaId") int ventaId) throws SQLException {
        String out = "";
        ControllerVenta controller = new ControllerVenta();
        
        List<Galleta> listaDetalles = controller.getVentaDetalles(ventaId);
        
        Gson objGson = new Gson();
        out = objGson.toJson(listaDetalles);
        
        return Response.ok(out).build();
    }
}
