<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

			<div id="content">
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3><b>B&uacute;squeda</b> <span>Peliculas</span></h3>
								<table width=90% border =0 align="center">
								<form method="post" name="frmBusqueda" id="frmBusqueda">
									<tr>
										<td>Titulo:&nbsp;<input type="text" name="txtBusqueda" id="txtBusqueda">&nbsp;&nbsp;<input type="button" name="btnBuscar" id="BtnBuscar" value="Buscar" onclick="document.frmBusqueda.submit();" /></td>
										<td>&nbsp;&nbsp;</td>
										<td>Genero:&nbsp;
										<select name="cboGenero" id="cboGenero">
											<option value="">seleccione</option>
											<option value="Infantil">Infantil</option>
											<option value="Accion">Accion</option>
											<option value="Suspenso">Suspenso</option>
										</select>
										</td>
									</tr>
								</form>
									<tr><td colspan="3">&nbsp;</td></tr>
									<tr style="width:100%">
										<td width=100% colspan="3">
											<table border=0  width="100%">
													<tr valign=top style="background: silver; color: white; font-family:arial; font-size: 16px; font-weight:bold; height:25px; text-align: middle;">
														<td width=60% align="center">Titulo</td>
														<td align="center">Genero</td>
														<td align="center">Duraci&oacute;n</td>
														<!-- td align="center">Elim</td>  -->
													</tr>
												<c:forEach items="${peliculas}" var="pelicula">
													<tr valign=top>
														<td width=60%><h4><a href='<c:url value="/detalle.htm?id=${pelicula.idPelicula }"/>'>${pelicula.nomPelicula}<br></a></h4></td>
														<td align="center"><c:out value="${pelicula.genero}"/></td>
														<td align="center"><c:out value="${pelicula.duracion}"/></td>
														<!-- td align="center"><input type="checkbox" name="chkEliminar" id="chkEliminar" /></td> -->
													</tr>
												</c:forEach>					
											</table>
										</td>
									</tr>
								</table>
								<!-- 
								<table width=90% border =0 align="center">
									<tr>
										<td><input type="button" id="btnNuevo" name="btnNuevo" value="Nuevo" onclick="window.location='mnt_pelicualas.htm?metodo=insertar'"/>&nbsp;&nbsp;<input type="button" id="btnEliminar" name="btnEliminar" value="Eliminar" /></td>
									</tr>
								</table>
								 -->
							</div>
						</div>
					</div>
				</div>
			</div>
			<script language="javascript">
			function validaFormulario(){
				if (document.frmBusqueda.txtBusqueda.value==""){
					return false;
				}	
				document.frmBusqueda.submit();
			}
			</script>
