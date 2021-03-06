insert into regiones (nombre) values ('Sudamerica');
insert into regiones (nombre) values ('Centroamerica');
insert into regiones (nombre) values ('Norteamerica');
insert into regiones (nombre) values ('Europa');
insert into regiones (nombre) values ('Asia');
insert into regiones (nombre) values ('Africa');
insert into regiones (nombre) values ('Oceania');


insert into clientes (region_id, nombre, apellido, email, create_at) values (1, 'Julian', 'Mora', 'jmora29@correo.com', '2018-01-01');
insert into clientes (region_id, nombre, apellido, email, create_at) values (2, 'Sergio', 'Mora', 'smora29@correo.com', '2018-02-01');
insert into clientes (region_id, nombre, apellido, email, create_at) values (3, 'Esteban', 'Mora', 'emora29@correo.com', '2018-03-01');
insert into clientes (region_id, nombre, apellido, email, create_at) values (4, 'Felipe', 'Carrs', 'fcars@correo.com', '2018-04-01');
insert into clientes (region_id, nombre, apellido, email, create_at) values (5, 'Carlos', 'Figues', 'cfyssd29@correo.com', '2018-05-01');
insert into clientes (region_id, nombre, apellido, email, create_at) values (6, 'Edwin', 'Arias', 'eartsas@correo.com', '2018-06-01');
insert into clientes (region_id, nombre, apellido, email, create_at) values (7, 'Lucia', 'Avila', 'lactas@correo.com', '2018-07-01');
insert into clientes (region_id, nombre, apellido, email, create_at) values (2, 'Dasis', 'Dassa', 'dassrs@correo.com', '2018-08-01');
insert into clientes (region_id, nombre, apellido, email, create_at) values (1, 'Danna', 'Cardona', 'dcarsf4@correo.com', '2018-09-01');

insert into usuarios (username, password, enabled, nombre, apellido, email) values ('julian', '$2a$10$0lyszm4TuXRmnBoeh.ynuewml9IU6dNRoIHDMTgAayl/bd/WdGMN6', 1, 'Julian','Hank','hnsa@correo.com');
insert into usuarios (username, password, enabled, nombre, apellido, email) values ('admin', '$2a$10$SFhzb4uh4aVgg/mG7QH.COaiZxv7cDlpyTwzIcY97N4GJy4zNsBX.', 1, 'Dann','Hank','dasr@correo.com');

insert into roles (nombre) values ('ROLE_USER');
insert into roles (nombre) values ('ROLE_ADMIN');

insert into usuarios_roles (usuario_id, roles_id) values (1, 1);
insert into usuarios_roles (usuario_id, roles_id) values (2, 2);
insert into usuarios_roles (usuario_id, roles_id) values (2, 1);

insert into productos (nombre, precio, create_at) values ('Camara', 345678, NOW());
insert into productos (nombre, precio, create_at) values ('Televisor', 245678, NOW());
insert into productos (nombre, precio, create_at) values ('Audifonos', 145678, NOW());
insert into productos (nombre, precio, create_at) values ('Pantalla PC',675678, NOW());
insert into productos (nombre, precio, create_at) values ('Teclado', 985678, NOW());
insert into productos (nombre, precio, create_at) values ('Mouse',445678, NOW());
insert into productos (nombre, precio, create_at) values ('Bocinas', 995678, NOW());

insert into facturas (descripcion, observacion, cliente_id, create_at) values ('Factura equipos para oficina', null, 1, NOW());
insert into facturas_items (cantidad, factura_id, producto_id) values (2, 1, 6);
insert into facturas_items (cantidad, factura_id, producto_id) values (4, 1, 3);
insert into facturas_items (cantidad, factura_id, producto_id) values (5, 1, 5);
insert into facturas_items (cantidad, factura_id, producto_id) values (2, 1, 2);

insert into facturas (descripcion, observacion, cliente_id, create_at) values ('Factura camara', 'ok camara', 1, NOW());
insert into facturas_items (cantidad, factura_id, producto_id) values (3, 2, 1);