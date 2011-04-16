insert into T_USUARIO (login ,password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad, telefono, email, dni, tipo) 
values ('40404040', '4040','A','Keith','Donald', 'Administrador','01/01/2011', '01/01/2020','987668789','donalk@mail.com','40404040', 'I' );

insert into T_USUARIO (login ,password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad, telefono, email, dni, tipo) 
values ('50505050', '50505050','A','Felix','Car', null,'01/01/2011', '01/01/2020','948787574','carf@mail.com','50505050', 'C' ); 

insert into T_PELICULA(nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo,flagComentario, publicoObjetivo, sinopsis,fecIniCartelera, fecFinCartelera, estado,poster, trailer) values ('Toy Story 3', '2007','50 min', 'EEUU', 'Infantil','Sala','S', 1, 'Apta para todos', 
'Toy Story 3 es la última película de la trilogía Toy Story. La película ha sido distribuida en cines en formato analógico, digital y Disney Digital 3D. 
El filme fue producido por Pixar Animation Studios y lanzada al mercado por Walt Disney Pictures. 
Obtuvo dos premios Óscar en las categorías de Mejor Película Animada y Mejor Canción Original. 
Además, fue nominada como Mejor Película, Mejor Mezcla de Sonido y Mejor Guión Adaptado. 
También logró ganar el Globo de Oro como Mejor Película Animada.','2011-01-01', '2011-01-01', 'Activo', 'resources/images/1page-img2.jpg', 'ruta trailer');		
insert into T_PELICULA(nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo,flagComentario, publicoObjetivo, sinopsis,fecIniCartelera, fecFinCartelera, estado,poster, trailer) values ('Principe de Persia', '2007','50 min', 'EEUU', 'Accion','Sala','S', 1, 'Apta para todos', 'El Príncipe de Persia: Las arenas del tiempo nos presenta al hijo del Rey Sharaman, el Príncipe de Persia, 
derrotando al todopoderoso Maharajá de la India en una portentosa batalla. 
Tras la victoria llegó el saqueo de sus posesiones. Y entre ellas se llevaron un par de objetos misteriosos: 
una daga y un reloj de arena. Además de ello, capturaron a la bella hija del Maharajá. 
Un traidor del reino del Maharahá, y que ayudó al Príncipe en su conquista, engaña a éste para 
que rompa el misterioso reloj de arena. 
Desde ese momento se desatarán las temidas "arenas del tiempo". Y la aventura comenzará. 
La película está basada en el videojuego "El Príncipe de Persia: Las arenas del tiempo", uno de los 
que marcó el resurgimiento de la saga de todo un clásico del inicio del ocio informático en los años ochenta.','2011-01-01', '2011-01-01', 'Activo', 'resources/images/1page-img3.jpg', 'ruta trailer');		
insert into T_PELICULA(nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo,flagComentario, publicoObjetivo, sinopsis,fecIniCartelera, fecFinCartelera, estado,poster, trailer) values ('Crepúsculo', '2007','50 min', 'EEUU', 'Suspenso','Sala','S', 1, 'Apta para todos', 'Cuando la madre de Bella Swan (Kristen Stewart) empieza a viajar con su nuevo marido, la joven de 17 años 
no tiene más remedio que abandonar su hogar en Phoenix y volver a vivir con su padre 
en la minúscula localidad de Forks, en el estado de Washington. 
Tras el incesante sol de Arizona, el brumoso clima gris de Forks resulta bastante exótico para Bella, 
al igual que sus nuevos compañeros de clase, la familia Cullen. Increíblemente atractivos y sumamente reservados, 
no se parecen a nadie que haya conocido, en más sentidos de lo que imagina
','2011-01-01', '2011-01-01', 'Activo', 'resources/images/1page-img4.jpg', 'ruta trailer');		

insert into T_SALA( numAsiento, estado) values(56, 'Activa');
insert into T_SALA( numAsiento, estado) values(129, 'Activa');
insert into T_SALA( numAsiento, estado) values(104, 'Activa');

insert into T_PRODUCTO (nomProducto,descProducto,precioProducto,stockProducto,caracteristicasProducto,rutaImagenProducto,estadoProducto)
values ('Bolsos para ninos', 'Bolsos para ninos', 20,50,'Edicion limitada', 'resources/images/bolsos_ts3.jpg', 'A');

insert into T_PRODUCTO (nomProducto,descProducto,precioProducto,stockProducto,caracteristicasProducto,rutaImagenProducto,estadoProducto)
values ('Etiquetas decorativas', 'Etiquetas decorativas', 5.00,50,'Edicion limitada', 'resources/images/Woody.jpg', 'A');

insert into T_PRODUCTO (nomProducto,descProducto,precioProducto,stockProducto,caracteristicasProducto,rutaImagenProducto,estadoProducto)
values ('Muneco Pincipe Persia', 'Muneco Pincipe Persia', 8.00,50,'Edicion limitada', 'resources/images/principe.jpg', 'A');

insert into T_MERCHANDIZING (idPelicula,idProducto,fecInicioVigencia,fecFinVigencia,estadoMerchandizing)
values (1, 1, '2011-01-01','2012-01-01', 'A');

insert into T_MERCHANDIZING (idPelicula,idProducto,fecInicioVigencia,fecFinVigencia,estadoMerchandizing)
values (1, 2, '2011-01-01','2012-01-01', 'A');

insert into T_MERCHANDIZING (idPelicula,idProducto,fecInicioVigencia,fecFinVigencia,estadoMerchandizing)
values (2, 3, '2011-01-01','2012-01-01', 'A');
