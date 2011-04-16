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
								<p>Cinema World Site is a free web template created by <a href="http://www.templatemonster.com/" class="new_window">TemplateMonster.com</a> team. This website template is optimized for 1024X768 screen resolution. It is also XHTML &amp; CSS valid.</p>
								<div class="img-box1"><img src="<c:url value="/resources/images/1page-img1.jpg" />" alt="" />This website template can be delivered in two packages - with PSD source files included and without them. If you need PSD source files, please go to the template download page at TemplateMonster to leave the e-mail address that you want the template ZIP package to be delivered to.</div>
								<p>This website template has several pages: <a href="index.html">Home</a>, <a href="about-us.html">About us</a>, <a href="articles.html">Articles</a> (with Article page), <a href="contact-us.html">Contact us</a> (note that contact us form – doesn’t work), <a href="sitemap.html">Site Map</a>.</p>
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
