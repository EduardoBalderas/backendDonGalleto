CREATE DATABASE if not exists don_galleto;
USE don_galleto;
	

-- Tabla Proveedor (Si se requiere para Compra)
CREATE TABLE Proveedor (
    id_proveedor INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL
);

-- Tabla Compra
CREATE TABLE Compra (
    id_compra INT PRIMARY KEY AUTO_INCREMENT,
    fecha VARCHAR(30) NOT NULL,
    total VARCHAR(50) NOT NULL,
    id_proveedor INT,
    FOREIGN KEY (id_proveedor) REFERENCES Proveedor(id_proveedor)
);

-- Tabla Insumo
CREATE TABLE Insumo (
    id_insumo INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    unidad VARCHAR(50) NOT NULL,
    descripcion VARCHAR(30),
    cantidad INT NOT NULL,
    fecha_caducidad VARCHAR(30)
);

-- Tabla que relaciona Compra e Insumo (relación N:M)
CREATE TABLE Compra_Insumo (
    id_compra INT,
    id_insumo INT,
    PRIMARY KEY (id_compra, id_insumo),
    FOREIGN KEY (id_compra) REFERENCES Compra(id_compra),
    FOREIGN KEY (id_insumo) REFERENCES Insumo(id_insumo)
);

-- Tabla Merma_insumo
CREATE TABLE Merma_insumo (
    id_merma_insumo INT PRIMARY KEY AUTO_INCREMENT,
    id_insumo INT,
    unidad VARCHAR(50),
    descripcion VARCHAR(30),
    cantidad INT NOT NULL,
    FOREIGN KEY (id_insumo) REFERENCES Insumo(id_insumo)
);

-- Tabla Galleta
CREATE TABLE Galleta (
    id_galleta INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(200) NOT NULL,
    cantidad INT NOT NULL,
    descripcion VARCHAR(200),
    precio double not null
);

-- Relación Insumo -> Galleta (Produce, N:1)
CREATE TABLE Insumo_Galleta (
    id_insumo INT,
    id_galleta INT,
    PRIMARY KEY (id_insumo, id_galleta),
    FOREIGN KEY (id_insumo) REFERENCES Insumo(id_insumo),
    FOREIGN KEY (id_galleta) REFERENCES Galleta(id_galleta)
);

-- Tabla Merma_galleta
CREATE TABLE Merma_galleta (
    id_merma_galleta INT PRIMARY KEY AUTO_INCREMENT,
    id_galleta INT,
    tipo VARCHAR(100),
    descripcion VARCHAR(30),
    cantidad INT NOT NULL,
    FOREIGN KEY (id_galleta) REFERENCES Galleta(id_galleta)
);

CREATE TABLE Venta (
    Venta_Id INT AUTO_INCREMENT PRIMARY KEY,
    Fecha DATE,
    Descripcion VARCHAR(100),
    VentaTotal DECIMAL(10,2) NOT NULL
);

CREATE TABLE DetalleVenta (
    DetalleVenta_Id INT AUTO_INCREMENT PRIMARY KEY,
    Venta_Id INT,
    Galleta_Id INT,
    Cantidad INT,
    FOREIGN KEY (Venta_Id) REFERENCES Venta(Venta_Id)
);