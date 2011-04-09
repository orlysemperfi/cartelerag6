<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

			<div id="content">
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3>Lista de</b> <span>Peliculas</span></h3>
								<table width=100% border=0>
									<tr>
										<tr width=100%>
											<td width=100%>
<c:forEach items="${data}" var="pelicula">
	Pel&iacute;cula:  <c:out value="${pelicula.nomPelicula}"/>  <br/>
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




