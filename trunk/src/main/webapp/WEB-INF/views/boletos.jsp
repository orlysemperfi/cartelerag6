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
												<table border=1   width=100%>
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
																	<option value ="TOY STORY">TOY STORY</option>
																	<option value ="PRINCIPE DE PERSIA" >PRINCIPE DE PERSIA</option>
																	<option value ="CREPUSCULO">CREPUSCULO</option>
																</select>
														</td>
													</tr>
													<tr>
														<td align=center ><font>Sala</font></td>
														<td >	<select id =cboSala name=cboSala rows=5>
																	<option value ="SALA 1">SALA 1</option>
																	<option value ="SALA 2">SALA 2</option>
																	<option value ="SALA 3">SALA 3</option>
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
														<td ><input type="text" id=txtNro name=txtNro size=5 vaue="1987"></td>
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
														<td ><input type="text" id=txtDirecion name=txtDirecion size=80 value="Chicago, años 30. Época de la Ley Seca. El idealista agente federal Eliot Ness persigue implacablemente al gángster Al Capone. La falta de pruebas le impide acusarlo de asesinato, extorsión y comercio ilegal de alcohol, pero encontrará un medio para inculparlo por otra clase de delitos. (FILMAFFINITY)"></td>
													</tr>
											</table>
												</form>
												<br><div class="link2" onclick="document.frmGraba.submit();" ><span><span>Reservar</span></span></div>
											</td>
										</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>



