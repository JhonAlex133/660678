
-- prosedimientos
delimiter /
create procedure tiendaenlinea.crear_carritodecompras(
sub float, 
total float, 
imp float
)
Begin
INSERT INTO `tiendaenlinea`.`carritodecompras`
(`subtotal`,
`precioTotal`,
`impuestos`)
VALUES
(sub,
total,
imp);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_catalogo(
nomCat varchar(20),
descr varchar(300)
)
Begin
INSERT INTO `tiendaenlinea`.`catalogo`
(`nombreCatalogo`,
`descripcion`)
VALUES
(
nomCat,
descr);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_categoria(
idCat int,
nomCat varchar(100),
act boolean,
par int
)
begin
INSERT INTO `tiendaenlinea`.`categoria`
(`idCategoria`,
`nombreCategoria`,
`activa`,
`pariente`)
VALUES
(idCat,
nomCat,
act,
par);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_cuenta(
tipDocu varchar(10),
numDocu varchar(45),
priNom varchar(100),
segNom varchar(45),
priApe varchar(100),
segApe varchar(45),
contra varchar(45),
emai varchar(45),
usuIdUsu varchar(45)
)
begin
INSERT INTO `tiendaenlinea`.`cuenta`
(`tipoDocumento`,
`numeroDocumento`,
`primerNombre`,
`segundoNombre`,
`primerApellido`,
`segundoApellido`,
`contrasena`,
`email`,
`Usuario_idUsuario`)
VALUES
(tipDocu,
numDocu,
priNom,
segNom,
priApe,
segApe,
contra,
emai,
usuIdUsu);

end/

DELIMITER /
CREATE procedure tiendaenlinea.crear_departamento(
idDep varchar(2),
nom varchar(45)
)
Begin
INSERT INTO `tiendaenlinea`.`departamento`
(`idDepartamento`,
`nombre`)
VALUES
(idDep,
nom);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_domicilioCuenta(
tipDocu varchar(10),
numDocu varchar(45),
tel varchar(45),
dir varchar(200),
barr varchar(100),
locali varchar(100),
idMun varchar(4)
)
begin
INSERT INTO `tiendaenlinea`.`domicilio_cuenta`
(`Cuenta_tipoDocumento`,
`Cuenta_numeroDocumento`,
`telefono`,
`direccion`,
`barrio`,
`localidad`,
`Municipio_idMunicipio`)
VALUES
(tipDocu,
numDocu,
tel,
dir,
barr,
locali,
idMun);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_domicilioProveedor(
tipDocu varchar(10),
numDocu varchar(45),
tel varchar(45),
dir varchar(200),
barr varchar(100),
locali varchar(100),
idMun varchar(4)
)
begin
INSERT INTO `tiendaenlinea`.`domicilio_proveedor`
(`Proveedor_idProveedor`,
`Proveedor_tipoDeIdentificacion`,
`telefono`,
`direccion`,
`barrio`,
`localidad`,
`Municipio_idMunicipio`)
VALUES
(tipDocu,
numDocu,
tel,
dir,
barr,
locali,
idMun);

end/


DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_domicilioProveedor(
fech datetime,
total float,
tipDocu varchar(10),
numDocu varchar(45)
)
Begin
INSERT INTO `tiendaenlinea`.`factura`
(
`fecha`,
`total`,
`Cuenta_tipoDocumento`,
`Cuenta_numeroDocumento`)
VALUES
(fech,
total,
tipDocu,
numDocu);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_inventario(
fech date,
canti int,
idProd varchar(100),
idProv varchar(45),
tipIden varchar(20)
)
begin
INSERT INTO `tiendaenlinea`.`inventario`
(
`fecha`,
`cantidad`,
`Producto_idProducto`,
`Proveedor_idProveedor`,
`Proveedor_tipoDeIdentificacion`)
VALUES
(fech,
canti,
idProd,
idProv,
tipIden);

end/


DELIMITER /
CREATE PROCEDURE tiendaenlinea.producto_crear(
idprodu varchar(100),
idfac int,
cant int,
costUn float,
costTot float
)
begin
INSERT INTO `tiendaenlinea`.`item`
(`Producto_idProducto`,
`Pedido_Factura_idFactura`,
`cantidad`,
`costoUnitario`,
`costoTotal`)
VALUES
(idprodu,
idfac,
cant,
costUn,
costTot);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_item_carrito(
idProd varchar(100),
idCarr int,
cant int,
conUni float,
cosTot float
)
begin
INSERT INTO `tiendaenlinea`.`item_carrito`
(`Producto_idProducto`,
`CarritoDeCompras_idCarritoDeCompras`,
`cantidad`,
`costoUnitario`,
`costoTotal`)
VALUES
(idProd,
idCarr,
cant,
conUni,
cosTot);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_municipio(
idMun varchar(4),
nom varchar(45),
depat varchar(2)
)
begin
INSERT INTO `tiendaenlinea`.`municipio`
(`idMunicipio`,
`nombre`,
`Departamento_idDepartamento`)
VALUES
(idMun,
nom,
depat);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_pago(
idFac int,
tarCred varchar(45),
banc varchar(100),
tipCuenta varchar(20),
tipotrans varchar(10)
)
begin 
INSERT INTO `tiendaenlinea`.`pago`
(`Factura_idFactura`,
`numTarCredito`,
`banco`,
`tipoCuentaTar`,
`tipoTransaccion`)
VALUES
(idFac,
tarCred,
banc,
tipCuenta,
tipotrans);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_pedido(
idFac int,
tot float,
sub float,
imp float
)
begin
INSERT INTO `tiendaenlinea`.`pedido`
(`Factura_idFactura`,
`total`,
`subtotal`,
`impuestos`)
VALUES
(idFac,
tot,
sub,
imp
);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.producto_crear(
id varchar(20), 
nom varchar(300), 
mar varchar(500), 
refer varchar(500), 
descrpcion varchar(500), 
materia varchar(30),
colo varchar(10), 
fot longblob, 
canti int, 
acti boolean,
precioUni float, 
descu float, 
idCate int, 
idCata int)
begin
insert into `tiendaenlinea`.`producto`
(
 `idProducto`,
`nombre`,
`marca`,
`referencia`,
`descripcion`,
`material`,
`color`,
`foto`,
`cantidad`,
`activo`,
`precioUnitario`,
`descuento`,
`Categoria_idCategoria`,
`Catalogo_idCatalogo`)
VALUES
(id,
nom,
mar,
refer,
descrpcion,
materia,
colo,
fot,
canti,
acti,
precioUni,
descu,
idCate,
idCata);

end/

call `tiendaenlinea`.`producto_crear`
('1234',
'Guitar',
'Fander',
'Es una guitarra electrica',
'Roja con franjas azules en los bordes',
'Caoba',
'Rojo',
"C:/Imagenes/Acustica/descarga.jpg",
2,
true,
200000,
10000,
1,
1);

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_proveedor(
idprov varchar(45),
tipIden varchar(20),
nom varchar(200),
tel varchar(20),
emai varchar(45)
)
begin
INSERT INTO `tiendaenlinea`.`proveedor`
(`idProveedor`,
`tipoDeIdentificacion`,
`nombre`,
`telefono`,
`email`)
VALUES
(idprov,
tipIden,
nom,
tel,
emai);

end/

DELIMITER /
CREATE PROCEDURE tiendaenlinea.crear_proveedor(
idUsu varchar(20),
contra varchar(45),
roll varchar(45),
esta varchar(20)
)
begin
INSERT INTO `tiendaenlinea`.`usuario`
(`idUsuario`,
`contrasena`,
`rol`,
`estado`)
VALUES
(idUsu,
contra,
roll,
esta);

end/
