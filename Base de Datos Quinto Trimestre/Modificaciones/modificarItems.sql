SELECT COUNT(*) FROM tiendaenlinea.item i where i.Pedido_Factura_idFactura=1;
 
SELECT sum(i.costoTotal) as totalFactura FROM tiendaenlinea.item i where i.Pedido_Factura_idFactura=1; 

delete FROM tiendaenlinea.item where Pedido_Factura_idFactura=1 and Producto_idProducto = 'A0001';

update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=1)where p.Factura_idFactura = 1;

update tiendaenlinea.pedido p set p.impuestos = p.subtotal*0.16 where p.Factura_idFactura = 1;

update tiendaenlinea.pedido p set p.total = p.subtotal + p.impuestos where p.Factura_idFactura=1;

update tiendaenlinea.pedido p set p.subtotal = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=10),p.impuestos = (SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=10)*0.16,p.total =(SELECT sum(i.costoTotal) FROM tiendaenlinea.item i 
where i.Pedido_Factura_idFactura=10)*1.16 where p.Factura_idFactura=10;

update tiendaenlinea.factura f set f.total = (select p.total from tiendaenlinea.pedido p where p.Factura_idFactura =10)
where f.idFactura =10;

select producto.nombre,  item.cantidad, item.costoUnitario, item.costoTotal
from tiendaenlinea.factura factura, tiendaenlinea.pedido pedido, tiendaenlinea.item item, tiendaenlinea.producto 
where factura.idFactura = pedido.Factura_idFactura and pedido.Factura_idFactura = item.Pedido_Factura_idFactura and 
	item.Producto_idProducto = producto.idProducto and factura.idFactura = 1;

select producto.nombre,  item.cantidad, item.costoUnitario, item.costoTotal
from tiendaenlinea.factura factura inner join tiendaenlinea.pedido pedido inner join tiendaenlinea.item item inner join tiendaenlinea.producto 
on factura.idFactura = pedido.Factura_idFactura and pedido.Factura_idFactura = item.Pedido_Factura_idFactura and 
	item.Producto_idProducto = producto.idProducto where factura.idFactura = 1;

select factura.idFactura, cuenta.primerNombre, cuenta.segundoNombre, cuenta.primerApellido, cuenta.segundoApellido, domicilio.direccion, domicilio.telefono, municipio.nombre 
from tiendaenlinea.cuenta cuenta, tiendaenlinea.domicilio_cuenta domicilio, tiendaenlinea.municipio municipio, tiendaenlinea.factura factura
where domicilio.Municipio_idMunicipio = municipio.idMunicipio and domicilio.Cuenta_numeroDocumento = cuenta.numeroDocumento
	and domicilio.Cuenta_tipoDocumento = cuenta.tipoDocumento and factura.Cuenta_numeroDocumento = cuenta.numeroDocumento
	and factura.Cuenta_tipoDocumento = cuenta.tipoDocumento and factura.idFactura = 1;

select factura.idFactura, cuenta.primerNombre, cuenta.segundoNombre, cuenta.primerApellido, cuenta.segundoApellido, domicilio.direccion, domicilio.telefono, municipio.nombre 
from tiendaenlinea.cuenta cuenta inner join tiendaenlinea.domicilio_cuenta domicilio inner join tiendaenlinea.municipio municipio inner join tiendaenlinea.factura factura
on domicilio.Municipio_idMunicipio = municipio.idMunicipio and domicilio.Cuenta_numeroDocumento = cuenta.numeroDocumento
	and domicilio.Cuenta_tipoDocumento = cuenta.tipoDocumento and factura.Cuenta_numeroDocumento = cuenta.numeroDocumento
	and factura.Cuenta_tipoDocumento = cuenta.tipoDocumento where factura.idFactura = 1;

select factura.idFactura, cuenta.primerNombre, cuenta.segundoNombre, cuenta.primerApellido, cuenta.segundoApellido,
	pedido.subtotal, pedido.impuestos, factura.total
from tiendaenlinea.factura factura, tiendaenlinea.cuenta cuenta, tiendaenlinea.pedido pedido
where pedido.Factura_idFactura = factura.idFactura and factura.Cuenta_numeroDocumento = cuenta.numeroDocumento
	and factura.Cuenta_tipoDocumento = cuenta.tipoDocumento 
	and factura.idFactura = 1;

select factura.idFactura, cuenta.primerNombre, cuenta.segundoNombre, cuenta.primerApellido, cuenta.segundoApellido,
	pedido.subtotal, pedido.impuestos, factura.total
from tiendaenlinea.factura factura inner join tiendaenlinea.cuenta cuenta inner join tiendaenlinea.pedido pedido
on pedido.Factura_idFactura = factura.idFactura and factura.Cuenta_numeroDocumento = cuenta.numeroDocumento
	and factura.Cuenta_tipoDocumento = cuenta.tipoDocumento 
	where factura.idFactura = 1;

select proveedor.nombre, inventario.fecha ,inventario.cantidad ,producto.nombre
from tiendaenlinea.producto producto, tiendaenlinea.inventario inventario, tiendaenlinea.proveedor proveedor
where proveedor.idProveedor = inventario.Proveedor_idProveedor and proveedor.tipoDeIdentificacion = inventario.Proveedor_tipoDeIdentificacion
	AND inventario.Producto_idProducto = producto.idProducto 
and inventario.fecha = '2015-02-20' and proveedor.idProveedor ='11119999' and proveedor.tipoDeIdentificacion ='CC';

select proveedor.nombre, inventario.fecha ,inventario.cantidad ,producto.nombre
from tiendaenlinea.producto producto inner join tiendaenlinea.inventario inventario inner join tiendaenlinea.proveedor proveedor
ON proveedor.idProveedor = inventario.Proveedor_idProveedor and proveedor.tipoDeIdentificacion = inventario.Proveedor_tipoDeIdentificacion
	AND inventario.Producto_idProducto = producto.idProducto 
WHERE inventario.fecha = '2015-02-20' and proveedor.idProveedor ='11119999' and proveedor.tipoDeIdentificacion ='CC';


