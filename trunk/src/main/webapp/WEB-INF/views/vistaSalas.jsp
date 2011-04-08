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
						<li ><a href="Salas" class="active">Administracion</a></li>
						<li><a href="inicio" >Inicio</a></li>
						<li><a href="nosotros">Nosotros</a></li>
						<li><a href="articulos">Articulos</a></li>
						<li class="last"><a href="contactanos">Contactanos</a></li>
					</ul>
				</div>
			</div>
<!-- CONTENT -->
			<div id="content"><div class="inner_copy">More <a href="http://www.templatemonster.com/">Website Templates</a> at TemplateMonster.com!</div>
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3>Lista de</b> <span>Salas</span></h3>
								<table width=100% border =0>
									<tr>
										<tr width=100%>
											<td width=50%>
												<table border=1  >
													<tr>
														<td align=center width=50px><font>Id</font></td>
														<td align=center width=100px>Nro Asientos</td>
														<td align=center width=150px>Estado</td>
													</tr>
													<c:forEach items="${data}" var="sala">
														<tr>
															<td align=center><c:out value="${sala.idSala}"/></td>
															<td align="right"><c:out value="${sala.numAsiento}"/>&nbsp;</td>
															<td align=center><c:out value="${sala.estado}"/></td>
														</tr>
													</c:forEach>
												</table>
											</td>
											<td width=50%>
												<table border=1  >
													<tr>
														<td align=center width=150px><font>Id</font></td>
														<td ><input type="text" id=txtId name=txtId ></td>
													</tr>
													<tr>
														<td align=center ><font>Nro. Asientos</font></td>
														<td ><input type="text" id=txtId name=txtId></td>
													</tr>
													<tr>
														<td align=center ><font>Estado</font></td>
														<td >	<select rows=5>
																	<option>Activo</option>
																	<option>Eliminado</option>
																</select>
														</td>
													</tr>
												</table>
											</td>
										</tr>
									</tr>
								</table>
							</div>
						</div>
					</div>
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