<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

			<div id="content"><div class="inner_copy">More <a href="http://www.templatemonster.com/">Website Templates</a> at TemplateMonster.com!</div>
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3>Lista de</b> <span>Peliculas</span></h3>
								<table width=100% border =0>
									<tr>
										<tr width=100%>
											<td width=50%>
												<table border=0 cellspacing=1 style="background:silver;"  >
													<tr style="font-weight:bold; font-family:arial; background-color: white;">
														<td align=center width=50px><font>IdPelicula</font></td>
														<td align=center width=100px>Nombre Pelicula</td>
														<td align=center width=150px>Pais</td>
													</tr>
													<c:forEach items="${data}" var="Lpeliculas">
														<tr style="background-color: white;">
															<td align=center><c:out value="${Lpeliculas.idPelicula}"/></td>
															<td align="right"><c:out value="${Lpeliculas.nomPelicula}"/>&nbsp;</td>
															<td align=center><c:out value="${Lpeliculas.paisOrigen}"/></td>
														</tr>
													</c:forEach>
												</table>
												<div class="wrapper"><br><a href='<c:url value="/Salas"/>' class="link2"><span><span>Salas</span></span></a></div>
											</td>
											<td width=50%>
												<form method="post" name="frmGraba" id="frmGraba">
												<table border=1  >
													<tr>
														<td align=center ><font>Nombre</font></td>
														<td ><input type="text" id=txtNombre name=txtNombre value="Los Intocables"></td>
													</tr>
													<tr>
														<td align=center ><font>Año</font></td>
														<td ><input type="text" id=txtAnio name=txtAnio size=5 value="1987"></td>
													</tr>
													<tr>
														<td align=center ><font>Duracion</font></td>
														<td ><input type="text" id=txtDuracion name=txtDuracion size=5 value ="119 min."></td>
													</tr>
													<tr>
														<td align=center ><font>Sinopsis</font></td>
														<td ><input type="text" id=txtSinopsis name=txtSinopsis size=40 value="Chicago, años 30. Época de la Ley Seca. El idealista agente federal Eliot Ness persigue implacablemente al gángster Al Capone. La falta de pruebas le impide acusarlo de asesinato, extorsión y comercio ilegal de alcohol, pero encontrará un medio para inculparlo por otra clase de delitos. (FILMAFFINITY)"></td>
													</tr>
													<tr>
														<td align=center ><font>Ruta Imagen</font></td>
														<td ><input type="text" id=txtRutaImagen name=txtRutaImagen size=40 value ="resources/images/nueva_pelicula.jpg"></td>
													</tr>
													<tr>
														<td align=center ><font>Ruta Trailer</font></td>
														<td ><input type="text" id=txtRutaTrailer name=txtRutaTrailer size=40 value="resources/movies/nueva_pelicula.wma"></td>
													</tr>
													<tr>
														<td align=center ><font>Pais</font></td>
														<td >	<select id =cboPais name=cboPais rows=5>
																	<option value ="PE">PERU</option>
																	<option value ="USA" SELECTED>USA</option>
																	<option value ="CANADA">CANADA</option>
																</select>
														</td>
													</tr>
													<tr>
														<td align=center ><font>Genero</font></td>
														<td >	<select id =cboGenero name=cboGenero rows=5>
																	<option value ="ACCION">ACCION</option>
																	<option value ="DRAMA" SELECTED>DRAMA</option>
																	<option value ="COMEDIA">COMEDIA</option>
																</select>
														</td>
													</tr>
												</table>
												</form>
												<br><div class="link2" onclick="document.frmGraba.submit();" ><span><span>Grabar</span></span></div>
											</td>
										</tr>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>



