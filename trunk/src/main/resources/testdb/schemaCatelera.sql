drop table T_USUARIO if exists;
create table T_USUARIO( idUsuario bigint generated by default as identity (start with 1), 
						login varchar(20) not null ,
						password varchar(10) not null, 
						estado char(1) not null,
						nombre varchar(50) not null,
						apellido varchar(100) not null,
						puesto varchar(50) null,
						fec_Creacion varchar(10) not null,
						fec_Caducidad varchar(10) not null,
						telefono varchar(20) not null,
						email varchar(50) not null,
						dni varchar(20) not null,
						tipo char(1) not null,
						unique(login),
						primary key (idUsuario));		
						
drop table T_PERFIL if exists;
create table T_PERFIL( idPerfil bigint generated by default as identity (start with 1), 
						nomPerfil varchar(20) not null ,
						estado char(1) not null,
						primary key (idPerfil));	
						
drop table T_PERFIL_USUARIO if exists;
create table T_PERFIL_USUARIO( idPerfil integer not null,
							idUsuario integer not null,
						estado char(1) not null,
						primary key (idPerfil,idUsuario));						

drop table T_PELICULA if exists;
create table T_PELICULA( idPelicula bigint generated by default as identity (start with 1), 
						nomPelicula varchar(100) not null ,
						anioProduccion varchar(4) not null, 
						duracion varchar(50) not null,
						paisOrigen varchar(50) not null,
						genero varchar(50) not null,
						tipoEmision varchar(50) null,
						flagSubtitulo char(1) not null,
						flagComentario integer not null,
						publicoObjetivo varchar(100) not null,
						sinopsis varchar(1000) not null,
						fecIniCartelera date not null,
						fecFinCartelera date not null,
						estado varchar(50) not null,
						poster varchar(100) not null,
						trailer varchar(100) not null,
						unique(idPelicula),
						primary key (idPelicula));		

drop table T_SALA if exists;
create table T_SALA( idSala bigint generated by default as identity (start with 1), 
						numAsiento int not null ,
						estado varchar(50) not null,
						unique(idSala),
						primary key (idSala));		

drop table T_PRODUCTO if exists;
create table T_PRODUCTO( idProducto bigint generated by default as identity (start with 1), 
						nomProducto varchar(100) not null ,
						descProducto varchar(500) not null, 
						precioProducto integer not null,
						stockProducto integer not null,
						caracteristicasProducto varchar(500) not null,
						rutaImagenProducto varchar(100) null,
						estadoProducto varchar(50) not null,
						unique(idProducto),
						primary key (idProducto));		
						

drop table T_MERCHANDIZING if exists;
create table T_MERCHANDIZING( idPelicula integer not null,
						idProducto integer not null,
						fecInicioVigencia date not null,
						fecFinVigencia date not null,
						estadoMerchandizing varchar(50) not null,
						unique(idPelicula, idProducto),
						primary key (idPelicula, idProducto));
drop table T_RESERVA if exists;
create table T_RESERVA( idReserva bigint generated by default as identity (start with 1), 
						cliente varchar(150) not null ,
						pelicula varchar(200) not null, 
						sala varchar(100) not null,
						horario varchar(150) not null,
						nroEntradas integer not null,
						tipoPago varchar(150) null,
						direccionEnvio varchar(250) not null,
						fecha date not null,
						unique(idReserva),
						primary key (idReserva));		
						
						