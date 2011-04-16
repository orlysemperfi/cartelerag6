<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

			<div id="content">
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3><b>Lista de</b> <span>Salas</span></h3>
								<table width=100% border=0>
									<tr>
										<tr style="width:100%">
											<td width=50%>
												<table border=0  cellspacing=1 style="background:silver;">
													<tr style="font-weight:bold; font-family:arial; background-color: white;">
														<td align=center width=100px height=25>Sala Nro</td>
														<td align=center width=100px>Nro Asientos</td>
														<td align=center width=150px>Estado</td>
													</tr>
													<c:forEach items="${data}" var="sala">
														<tr style="background-color: white;">
															<td align=center><c:out value="${sala.idSala}"/></td>
															<td align="center"><c:out value="${sala.numAsiento}"/>&nbsp;</td>
															<td align=center><c:out value="${sala.estado}"/></td>
														</tr>
													</c:forEach>
												</table>
												<div class="wrapper"><br><a href='<c:url value="/Lpeliculas"/>' class="link2"><span><span>Peliculas</span></span></a></div>
											</td>
											<td width=50%>
											<form method="post" name="frmGraba" id="frmGraba">
												<table border=1  >
													<tr>
														<td align=center >Nro. Asientos</td>
														<td ><input type="text" id=txtAsientos name=txtAsientos></td>
													</tr>
													<tr>
														<td align=center >Estado</td>
														<td >	<select id =cboEstado name=cboEstado rows=5>
																	<option value ="Activa">Activa</option>
																	<option value ="Eliminada">Eliminada</option>
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



