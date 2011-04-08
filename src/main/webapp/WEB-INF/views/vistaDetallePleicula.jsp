<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Inicio| Cine - Catelera6</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="description" content="Place your description here" />
<meta name="keywords" content="put, your, keyword, here" />
<meta name="author" content="Templates.com - website templates provider" />
<link href="resources/style.css" rel="stylesheet" type="text/css" />
<script src="resources/js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script src="resources/js/cufon-yui.js" type="text/javascript"></script>
<script src="resources/js/cufon-replace.js" type="text/javascript"></script>
<script src="resources/js/Gill_Sans_400.font.js" type="text/javascript"></script>
<script src="resources/js/script.js" type="text/javascript"></script>
<!--[if lt IE 7]>
	<script type="text/javascript" src="resources/js/ie_png.js"></script>
	<script type="text/javascript">
		 ie_png.fix('.png, .link1 span, .link1');
	</script>
	<link href="resources/ie6.css" rel="stylesheet" type="text/css" />
<![endif]-->
</head>
<body id="page1">
<div class="tail-top">
	<div class="tail-bottom">
		<div id="main">
<!-- HEADER -->
			<div id="header">
				<div class="row-1">
					<div class="fleft"><a href="index.html">Cartelera<span>6</span></a></div>
					<ul>
						<li><a href="inicio"><img src="resources/images/icon1-act.gif" alt="" /></a></li>
						<li><a href="contactanos"><img src="resources/images/icon2.gif" alt="" /></a></li>
						<li><a href="nosotros"><img src="resources/images/icon3.gif" alt="" /></a></li>
					</ul>
				</div>
				<div class="row-2">
					<ul>
						<li><a href="inicio" class="active">Inicio</a></li>
						<li><a href="nosotros">Nosotros</a></li>
						<li><a href="articulos">Articulos</a></li>
						<li><a href="contactanos">Contáctanos</a></li>
						<li class="last"><a href="Salas">Administracion</a></li>
					</ul>
				</div>
			</div>
<!-- CONTENT -->
			<div id="content"><div class="inner_copy">More <a href="http://www.templatemonster.com/">Website Templates</a> at TemplateMonster.com!</div>
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3>Detalle</b> <span>Pelicula</span></h3>
								<table width=90% border =1>
									<tr width=100%>
										<td width=100%>
											<table border=1  >
												<c:forEach items="${data}" var="pelicula">
													<tr valign=top>
														<td width=40%><h4><c:out value="${pelicula.nomPelicula}"/></h4><img src=<c:out value="${pelicula.poster}"/> alt="" /></td>
														<td>
															<br><br>
															<p>
															Genero:<c:out value="${pelicula.genero}"/><br>
															Año:<c:out value="${pelicula.anioProduccion}"/><br>
															Duracion:<c:out value="${pelicula.duracion}"/><br>
															Pais:<c:out value="${pelicula.paisOrigen}"/><br>
															</p>
														</td>
													</tr>
													<tr>
														<td colspan=2><p><c:out value="${pelicula.sinopsis}"/></p></td>
													</tr>
												</c:forEach>					
											</table>
										</td>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
				<div class="content">
					<h3>Souvenirs</span></h3>
					<table border=1  >
						<c:forEach items="${data1}" var="producto">
						<tr valign=top>
							<td width=40%><h4><c:out value="${producto.nomProducto}"/></h4><img src=<c:out value="${producto.rutaImagenProducto}"/> alt="" /></td>
							<td>
								<br><br>
								<p>
								Precio:<c:out value="${producto.precioProducto}"/><br>
								</p>
							</td>
						</tr>
						<tr>
							<td colspan=2><p><c:out value="${producto.caracteristicasProducto}"/></p></td>
						</tr>
						</c:forEach>					
					</table>
				</div>
			</div>
<!-- FOOTER -->
			<div id="footer">
				<div class="left">
					<div class="right">
						<div class="inside">Copyright - Type in your name here<br />
							<a href="http://www.templatemonster.com/" class="new_window">Website template</a> designed by TemplateMonster.com<br />
							<a href="http://www.templates.com/product/3d-models/" class="new_window">3D Models</a> provided by Templates.com 
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>