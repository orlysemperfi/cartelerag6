<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

			<div id="content">
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3><b>Mantenimiento</b> <span>Peliculas</span></h3>
								<table width=90% border =0 align="center">
									<tr style="width:100%">
										<td width=100%>
											<table border=0  width="100%">
													<tr valign=top style="background: silver; color: white; font-family:arial; font-size: 16px; font-weight:bold; height:25px; text-align: middle;">
														<td width=60% align="center">Titulo</td>
														<td align="center">Genero</td>
														<td align="center">Duraci&oacute;n</td>
														<td align="center">Elim</td>
													</tr>
												<c:forEach items="${peliculas}" var="pelicula">
													<tr valign=top>
														<td width=60%><h4><c:out value="${pelicula.nomPelicula}"/></h4></td>
														<td align="center"><c:out value="${pelicula.genero}"/></td>
														<td align="center"><c:out value="${pelicula.duracion}"/></td>
														<td align="center"><input type="checkbox" name="chkEliminar" id="chkEliminar" /></td>
													</tr>
												</c:forEach>					
											</table>
										</td>
									</tr>
								</table>
								<table width=90% border =0 align="center">
									<tr>
										<td><input type="button" id="btnNuevo" name="btnNuevo" value="Nuevo" />&nbsp;&nbsp;<input type="button" id="btnEliminar" name="btnEliminar" value="Eliminar" /></td>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
