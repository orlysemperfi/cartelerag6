insert into T_USUARIO (login ,password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad, telefono, email, dni, tipo) 
values ('40404040', '40404040','A','Keith','Donald', 'Administrador','01/01/2011', '01/01/2020','987668789','donalk@mail.com','40404040', 'I' ); -- usuario interno

insert into T_USUARIO (login ,password, estado, nombre, apellido, puesto, fec_Creacion, fec_Caducidad, telefono, email, dni, tipo) 
values ('50505050', '50505050','A','Felix','Car', null,'01/01/2011', '01/01/2020','948787574','carf@mail.com','50505050', 'C' ); -- usuario  externo - cliente

insert into T_SUGERENCIA (descripcion,estado,fecha_registro,fecha_atencion,flag_atencion)
values ('Sugerencia inicial','Habilitado','01/01/2011','01/01/2011','Atendido');

insert into T_PELICULA(nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo,flagComentario, publicoObjetivo, sinopsis,fecIniCartelera, fecFinCartelera, estado,poster, trailer)
values ('La vida es sueño', '2011','50 min', 'Chile', 'Drama','Sala','S', 1, 'Apta para todos', 'Sinopsis','2011-01-01', '2011-01-01', 'Activo', 'ruta poster', 'ruta trailer');		

insert into T_PELICULA(nomPelicula,anioProduccion, duracion, paisOrigen,genero, tipoEmision, flagSubtitulo,flagComentario, publicoObjetivo, sinopsis,fecIniCartelera, fecFinCartelera, estado,poster, trailer)
values ('ContraCara', '2007','50 min', 'EEUU', 'Acción','Sala','S', 1, 'Apta para todos', 'Sinopsis','2011-01-01', '2011-01-01', 'Inactivo', 'ruta poster', 'ruta trailer');		
