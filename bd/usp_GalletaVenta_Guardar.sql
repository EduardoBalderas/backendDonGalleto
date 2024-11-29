DELIMITER //

CREATE PROCEDURE usp_Venta_Guardar(
    IN out_Venta_Id INT,
    IN in_Fecha DATE,
    IN in_Descripcion VARCHAR(100),
    IN in_DetallesVenta JSON
)
BEGIN
    DECLARE exit handler for SQLEXCEPTION
    BEGIN
        -- Rollback en caso de error
        ROLLBACK;
    END;

    START TRANSACTION;

    -- Si es un nuevo registro
    IF out_Venta_Id = 0 THEN
        -- Insertar la venta principal
        INSERT INTO Venta (
            Fecha,
            Descripcion,
            VentaTotal
        )
        VALUES (
            in_Fecha,
            in_Descripcion,
            0 -- Inicializar con 0, se actualizará después
        );

        -- Obtener el ID de la venta generada
        SET out_Venta_Id = LAST_INSERT_ID();

        -- Insertar los detalles de la venta
        INSERT INTO DetalleVenta (Venta_Id, Galleta_Id, Cantidad)
        SELECT 
            out_Venta_Id,
            JSON_UNQUOTE(JSON_EXTRACT(detail, '$.Galleta_Id')),
            JSON_UNQUOTE(JSON_EXTRACT(detail, '$.Cantidad'))
        FROM JSON_TABLE(in_DetallesVenta, '$[*]' COLUMNS (
            detail JSON PATH '$'
        )) AS jt;

    ELSE
        -- Actualizar la venta existente
        UPDATE Venta
        SET Fecha = GETDATE(),
            Descripcion = in_Descripcion
        WHERE Venta_Id = out_Venta_Id;

        -- Eliminar los detalles existentes
        DELETE FROM DetalleVenta
        WHERE Venta_Id = out_Venta_Id;

        -- Insertar los nuevos detalles
        INSERT INTO DetalleVenta (Venta_Id, Galleta_Id, Cantidad)
        SELECT 
            out_Venta_Id,
            JSON_UNQUOTE(JSON_EXTRACT(detail, '$.Galleta_Id')),
            JSON_UNQUOTE(JSON_EXTRACT(detail, '$.Cantidad'))
        FROM JSON_TABLE(in_DetallesVenta, '$[*]' COLUMNS (
            detail JSON PATH '$'
        )) AS jt;
    END IF;

    COMMIT;
END //

DELIMITER ;