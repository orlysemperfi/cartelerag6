<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

			<div id="content"><div class="inner_copy">More <a href="http://www.templatemonster.com/">Website Templates</a> at TemplateMonster.com!</div>
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3>Reserva  de</b> <span>Boletos</span></h3>
								<table width=100% border =0>
										<tr width=100%>
											<td >
												<form method="post" name="frmGraba" id="frmGraba">
												<table border=1  cellspacing=1 width=100%>
													<tr>
														<td align=center ><font>Cliente</font></td>
														<td >	<select id =cboClientes name=cboClientes rows=5>
																	<option value ="JULIO VERA">JULIO VERA</option>
																	<option value ="MARIANO CARRANZA">MARIANO CARRANZA</option>
																	<option value ="ROBERTO MORA">ROBERTO MORA</option>
																</select>
														</td>
													</tr>
													<tr>
														<td align=center ><font>Pelicula</font></td>
														<td >	<select id =cboPelicula name=cboPelicula rows=5>
																	<c:forEach items="${dataPelicula}" var="peliculas">
																	<option value ='<c:out value="${peliculas.nomPelicula}"/>'><c:out value="${peliculas.nomPelicula}"/></option>
																	</c:forEach>
																</select>
														</td>
													</tr>
													<tr>
														<td align=center ><font>Sala</font></td>
														<td >	<select id =cboSala name=cboSala rows=5>
																<c:forEach items="${dataSala}" var="salas">
																	<option >SALA<c:out value="${salas.idSala}"/></option>
																</c:forEach>
																</select>
														</td>
													</tr>
													<tr>
														<td align=center ><font>Horario</font></td>
														<td >	<select id =cboHorario name=cboHorario rows=5>
																	<option value ="01">LUNES 26ABR-2:00 PM</option>
																	<option value ="02">LUNES 26ABR-6:00 PM</option>
																	<option value ="03">LUNES 26ABR-8:00 PM</option>
																</select>
														</td>
													</tr>
													<tr>
														<td align=center ><font>Nro. Entradas</font></td>
														<td ><input type="text" id=txtNro name=txtNro size=5 value="3"></td>
													</tr>
													<tr>
														<td align=center ><font>Tipo Pago</font></td>
														<td >	<select id =cboTipoPago name=cboTipoPago rows=5>
																	<option value ="EFECTIVO">EFECTIVO</option>
																	<option value ="VISA" >Credito VISA</option>
																	<option value ="MASTECARD">Credito MASTERCARD</option>
																</select>
														</td>
													</tr>
													<tr>
														<td align=center ><font>Dirección Envio</font></td>
														<td ><input type="text" id=txtDirecion name=txtDirecion size=80 value="AV. LOS CONDORES 459 SURCO"></td>
													</tr>
											</table>
												</form>
												<br><div class="link2" onclick="document.frmGraba.submit();" ><span><span>Reservar</span></span></div>
											</td>
										</tr>
								</table>
								<br>
								<h3><b>Lista</b> <span>Reservas</span></h3>
								<table border=0  cellspacing=1 style="background:silver;" width=95% align=center>
									<tr style="font-weight:bold; font-family:arial; font-size:10px; background-color: white;">
										<td align=center width=100px height=25>Nro</td>
										<td align=center width=100px>Cliente</td>
										<td align=center width=150px>Pelicula</td>
										<td align=center width=150px>Sala</td>
										<td align=center width=150px>Horario</td>
										<td align=center width=150px>Entradas</td>
										<td align=center width=150px>Tipo Pago</td>
										<td align=center width=150px>Fecha</td>
										<td align=center width=150px>Accion</td>
									</tr>
									<c:forEach items="${data}" var="reservas">
										<tr style="background-color: black; font-size:10px; font-color:white;" >
											<td align=center><c:out value="${reservas.idReserva}"/></td>
											<td align="center"><c:out value="${reservas.cliente}"/>&nbsp;</td>
											<td align=center><c:out value="${reservas.pelicula}"/></td>
											<td align="center"><c:out value="${reservas.sala}"/>&nbsp;</td>
											<td align=center><c:out value="${reservas.horario}"/></td>
											<td align="center"><c:out value="${reservas.nroEntradas}"/>&nbsp;</td>
											<td align=center><c:out value="${reservas.tipoPago}"/></td>
											<td align=center><c:out value="${reservas.fecha}"/></td>
											<td align=center><a href='Eliminaboletos?id=<c:out value="${reservas.idReserva}"/>'>Cancelar</a></td>
										</tr>
										<tr style="background-color: black; font-size:10px; font-color:white;" height=20px>
											<td colspan=9 align=left><c:out value="${reservas.direccionEnvio}"/></td>
										</tr>
									</c:forEach>
								</table>
								
							</div>
						</div>
					</div>
				</div>
			</div>



