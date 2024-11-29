DELIMITER //

CREATE PROCEDURE usp_GalletaVenta_Seleccionar(
    IN in_Venta_Id INT
)
BEGIN
    -- Seleccionar la información de la venta y sus detalles
    SELECT 
        v.Venta_Id,
        v.Fecha,
        v.Descripcion,
        v.VentaTotal,
        dv.Detalle_Id, -- Asegúrate de que este campo exista en tu tabla DetalleVenta
        dv.Galleta_Id,
        dv.Cantidad
    FROM 
        Venta v
    INNER JOIN 
        DetalleVenta dv ON v.Venta_Id = dv.Venta_Id
    WHERE 
        v.Venta_Id = in_Venta_Id;
END //

DELIMITER ;