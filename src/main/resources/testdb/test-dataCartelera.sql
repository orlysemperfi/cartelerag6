insert into T_USUARIO (login ,password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad, telefono, email, dni, tipo) 
values ('40404040', '4040','A','Keith','Donald', 'Administrador','01/01/2011', '01/01/2020','987668789','donalk@mail.com','40404040', 'I' );

insert into T_USUARIO (login ,password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad, telefono, email, dni, tipo) 
values ('50505050', '50505050','A','Felix','Car', null,'01/01/2011', '01/01/2020','948787574','carf@mail.com','50505050', 'C' ); 

insert into T_PELICULA(nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo,flagComentario, publicoObjetivo, sinopsis,fecIniCartelera, fecFinCartelera, estado,poster, trailer) values ('Toy Story 3', '2007','50 min', 'EEUU', 'Infantil','Sala','S', 1, 'Apta para todos', 
'Toy Story 3 es la �ltima pel�cula de la trilog�a Toy Story. La pel�cula ha sido distribuida en cines en formato anal�gico, digital y Disney Digital 3D. 
El filme fue producido por Pixar Animation Studios y lanzada al mercado por Walt Disney Pictures. 
Obtuvo dos premios �scar en las categor�as de Mejor Pel�cula Animada y Mejor Canci�n Original. 
Adem�s, fue nominada como Mejor Pel�cula, Mejor Mezcla de Sonido y Mejor Gui�n Adaptado. 
Tambi�n logr� ganar el Globo de Oro como Mejor Pel�cula Animada.','2011-01-01', '2011-01-01', 'Activo', 'resources/images/1page-img2.jpg', 'ruta trailer');		
insert into T_PELICULA(nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo,flagComentario, publicoObjetivo, sinopsis,fecIniCartelera, fecFinCartelera, estado,poster, trailer) values ('Principe de Persia', '2007','50 min', 'EEUU', 'Accion','Sala','S', 1, 'Apta para todos', 'El Pr�ncipe de Persia: Las arenas del tiempo nos presenta al hijo del Rey Sharaman, el Pr�ncipe de Persia, 
derrotando al todopoderoso Maharaj� de la India en una portentosa batalla. 
Tras la victoria lleg� el saqueo de sus posesiones. Y entre ellas se llevaron un par de objetos misteriosos: 
una daga y un reloj de arena. Adem�s de ello, capturaron a la bella hija del Maharaj�. 
Un traidor del reino del Maharah�, y que ayud� al Pr�ncipe en su conquista, enga�a a �ste para 
que rompa el misterioso reloj de arena. 
Desde ese momento se desatar�n las temidas "arenas del tiempo". Y la aventura comenzar�. 
La pel�cula est� basada en el videojuego "El Pr�ncipe de Persia: Las arenas del tiempo", uno de los 
que marc� el resurgimiento de la saga de todo un cl�sico del inicio del ocio inform�tico en los a�os ochenta.','2011-01-01', '2011-01-01', 'Activo', 'resources/images/1page-img3.jpg', 'ruta trailer');		
insert into T_PELICULA(nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo,flagComentario, publicoObjetivo, sinopsis,fecIniCartelera, fecFinCartelera, estado,poster, trailer) values ('Crep�sculo', '2007','50 min', 'EEUU', 'Suspenso','Sala','S', 1, 'Apta para todos', 'Cuando la madre de Bella Swan (Kristen Stewart) empieza a viajar con su nuevo marido, la joven de 17 a�os 
no tiene m�s remedio que abandonar su hogar en Phoenix y volver a vivir con su padre 
en la min�scula localidad de Forks, en el estado de Washington. 
Tras el incesante sol de Arizona, el brumoso clima gris de Forks resulta bastante ex�tico para Bella, 
al igual que sus nuevos compa�eros de clase, la familia Cullen. Incre�blemente atractivos y sumamente reservados, 
no se parecen a nadie que haya conocido, en m�s sentidos de lo que imagina
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
