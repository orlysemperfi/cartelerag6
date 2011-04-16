<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<script type="text/javascript">
	
	function onFormSubmit(){    		
		document.usuario.submit();    		
	}

	</script>
		
		<div id="content"><div class="inner_copy">More <a href="http://www.templatemonster.com/">Website Templates</a> at TemplateMonster.com!</div>
			<div id="slogan">
				<div class="image png"></div>
				<div class="inside">
				
				<form name="usuario" method="post" id="usuario" action="validarUsuario.html">
					<span style='font-family: arial; font-size:18px;'>Login</span>
					<p>
					
					<label>User:</label><input name="idUsuario" size="10" type="text" id="idUsuario" value="" maxlength="10"/>
					<label>Password:</label><input name="password" size="10" type="password"" id="password" value="" maxlength="10"/>
					</p>
					<div class="wrapper">
						<table>
						 <tr>
							<td>
							<a href="javascript:onFormSubmit();" class="link1"><span><span>Ingresar</span></span></a>
							</td>
							<td>
							<a href="registro.html" class="link1"><span><span>Registrarse</span></span></a>
							</td>
						 </tr>
						 </table>
					 </div>		
				 </form>
                 </div>
                
			</div>
			<div class="box">
				
			<div class="content" >
				<h3>Fresh <span>Movies</span></h3>
				<ul class="movies">
					<li>
						<h4>Toy Story 3</h4><img src="<c:url value="/resources/images/1page-img2.jpg" />" alt="" />
						<p>Check out Disney-Pixar's official Toy Story site, watch the <span>Toy Story 3</span> trailer, and meet new characters. Remember, no toy gets left behind!</p>
						<div class="wrapper"><a href="#" class="link2"><span><span>Read More</span></span></a></div>
					</li>
					<li>
						<h4>Prince of Percia: Sands of Time</h4><img src="<c:url value="/resources/images/1page-img3.jpg" />" alt="" />
						<p>A young fugitive prince and princess must stop a villain who unknowingly threatens to destroy the world with a special dagger.</p>
						<div class="wrapper"><a href="#" class="link2"><span><span>Read More</span></span></a></div>
					</li>
					<li class="last">
						<h4>The Twilight Saga: Eclipse</h4><img src="<c:url value="/resources/images/1page-img4.jpg" />" alt="" />
						<p>As a string of mysterious killings grips Bella is forced to choose between her love for vampire Edward and her friendship with werewolf Jacob.</p>
						<div class="wrapper"><a href="#" class="link2"><span><span>Read More</span></span></a></div>
					</li>
					<li class="clear">&nbsp;</li>
				</ul>
			</div>
		</div>
	</div>
