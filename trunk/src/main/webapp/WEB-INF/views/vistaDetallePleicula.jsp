<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

			<div id="content">
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3><b>Detalle</b> <span>Pelicula</span></h3>
								<table width=90% border =1 align="center">
									<tr style="width:100%">
										<td width=100%>
											<table border=1  >
												<c:forEach items="${data}" var="pelicula">
													<tr valign=top>
														<td width=40%><h4><c:out value="${pelicula.nomPelicula}"/></h4><img src=<c:out value="${pelicula.poster}"/> alt="" /></td>
														<td>
															<br><br>
															<p>
															Genero:&nbsp;<c:out value="${pelicula.genero}"/><br>
															A&ntilde;o:&nbsp;<c:out value="${pelicula.anioProduccion}"/><br>
															Duraci&oacute;n:&nbsp;<c:out value="${pelicula.duracion}"/><br>
															Pais:&nbsp;<c:out value="${pelicula.paisOrigen}"/><br>
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
					<h3>Souvenirs</h3>
					<table border=1  >
						<c:forEach items="${data1}" var="producto">
						<tr valign=top>
							<td width=50%>&nbsp;<h4><c:out value="${producto.nomProducto}"/></h4><img src=<c:out value="${producto.rutaImagenProducto}"/> alt="" />&nbsp;</td>
							<td>
								<br><br>
								<p>
								Precio:&nbsp;<c:out value="${producto.precioProducto}"/><br>
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
