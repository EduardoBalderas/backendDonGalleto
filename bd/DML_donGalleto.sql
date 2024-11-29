USE don_galleto;

INSERT INTO Galleta (tipo,cantidad,descripcion)VALUES('Sorpresa de nuez Don galleto',750,'Galleta horneada sabor a nuez');
-- usp_GalletaVenta --
SET @out_Venta_Id = 0; -- Inicializamos el ID de la venta

CALL usp_Venta_Guardar(
    @out_Venta_Id,
    '2024-11-28', -- Fecha
    'Venta de galletas', -- Descripción
    JSON_ARRAY(
        JSON_OBJECT('Galleta_Id', 1, 'Cantidad', 5),
        JSON_OBJECT('Galleta_Id', 2, 'Cantidad', 3)
    ) -- Detalles de la venta en formato JSON
);

-- Verificar el ID de la venta insertada
SELECT @out_Venta_Id AS Nueva_Venta_Id;
/*
**
*/
-- usp_GalletaVenta_Seleccionar --
CALL usp_GalletaVenta_Seleccionar(1); -- Reemplaza 1 con el ID de la venta que deseas consultar
/*
**
*/
