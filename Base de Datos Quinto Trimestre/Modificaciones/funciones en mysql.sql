create function tiendaenlinea.text6(s varchar(20))
returns char (50)
return concat('Hola ', s, '!');

show create function tiendaenlinea.text6;

select tiendaenlinea.text6(' Jhon Alex');

drop function tiendaenlinea.text6;

create function tiendaenlinea.iva(iva float, valor float)
returns float
return valor/100*iva;

select tiendaenlinea.iva(16,1000);
