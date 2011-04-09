<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

			<div id="content">
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3><b>Lista de</b> <span>Peliculas</span></h3>
								<table width=100% border=0>
									<tr>
										<tr style="width:100%">
											<td width=100%>
<c:forEach items="${data}" var="pelicula">
	<table border="0" cellspacing="0">
		<tr>
			<td><img src=<c:out value="${pelicula.poster}"/> alt="" width="90" /></td>
			<td style="text-align:top;">
				<span style='font-family: arial; font-size:14px;'>
				<b>Pel&iacute;cula:</b>&nbsp;<a href='<c:url value="/detalle.htm?id=${pelicula.idPelicula }"/>'>${pelicula.nomPelicula}<br></a>
				<b>Genero:</b>&nbsp;${pelicula.genero}<br>
			</td>
		</tr>
	</table>

	<hr/>
</c:forEach>
											</td>
										</tr>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>




