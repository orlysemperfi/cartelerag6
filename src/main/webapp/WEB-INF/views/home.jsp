<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


			<div id="content"><div class="inner_copy">More <a href="http://www.templatemonster.com/">Website Templates</a> at TemplateMonster.com!</div>
				<div id="slogan">
					<div class="image png"></div>
					<div class="inside">
						<h2>Rompemos<span>Todos los l&iacute;mites</span></h2>
						<p>Se parte de Cartelera6 y accede a muchos beneficios.</p>
						<div class="wrapper"><a href="registro.html" class="link1"><span><span>Registrarse</span></span></a></div>
					</div>
				</div>

				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3>Bienvenido a <b>Caterlera</b> <span>6</span></h3>
								<p>No te pierdas este estreno en nuestras salas. </p>
							</div>
						</div>
					</div>
				</div>
				<div class="content">
					<h3>Peliculas  <span>en Cartelera</span></h3>
					<ul class="movies">
						<c:forEach items="${data}" var="pelicula">
							<li>
								<h4><c:out value="${pelicula.nomPelicula}"/></h4><img src=<c:out value="${pelicula.poster}"/> alt="" />
								<p><c:out value="${pelicula.sinopsis}"/></p>
								<div class="wrapper"><a href='<c:url value="/detalle?id=${pelicula.idPelicula}"/>' class="link2"><span><span>Ver Mas</span></span></a></div>
							</li>
						</c:forEach>					
						<li class="clear">&nbsp;</li>
					</ul>
				</div>
			</div>
