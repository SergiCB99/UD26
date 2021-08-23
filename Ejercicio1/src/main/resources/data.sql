
DROP TABLE IF EXISTS articulos;
DROP TABLE IF EXISTS fabricantes;

CREATE TABLE fabricantes(
id int AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) not null
);

CREATE TABLE articulos(
id int AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) not null,
precio int(5) not null,
nombre_fabricante int ,
FOREIGN KEY (nombre_fabricante) REFERENCES fabricantes (id) on delete cascade on update cascade
);

insert into fabricantes (nombre) values ('Fabricante1');
insert into fabricantes (nombre) values ('Fabricante2');
insert into fabricantes (nombre) values ('Fabricante3');
insert into fabricantes (nombre) values ('Fabricante4');
insert into fabricantes (nombre) values ('Fabricante5');

insert into articulos (nombre, precio, nombre_fabricante) values ('Articulo 1',25,5);
insert into articulos (nombre, precio, nombre_fabricante) values ('Articulo 2',75,3);
insert into articulos (nombre, precio, nombre_fabricante) values ('Articulo 3',55,2);
insert into articulos (nombre, precio, nombre_fabricante) values ('Articulo 4',205,4);
insert into articulos (nombre, precio, nombre_fabricante) values ('Articulo 5',115,1);