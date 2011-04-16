<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<script type="text/javascript">
	
	function onFormSubmit(){    		
		document.usuario.submit();    		
	}

	</script>
			<div id="content"><div class="inner_copy">More <a href="http://www.templatemonster.com/">Website Templates</a> at TemplateMonster.com!</div>
				<div class="line-hor"></div>
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3><span>REGÍSTRATE</span></h3>
							  <div class="address">	
								</div>
								<form name="usuario" method="post" id="usuario" action="registrarUsuario.html">
								  <fieldset>
								   <table>
								   	<tr>
								   		<td><label>Usuario:</label></td>
								        <td><input type="text" value="" name="login" id="login"/></td>
								   	</tr>
								   	<tr></tr><tr></tr>
								   	<tr>
								   		<td><label>Contraseña:</label></td>
								        <td><input type="text" value="" name="password" id="password"/></td>
								   	</tr>
								   	<tr></tr><tr></tr>
								   	<tr>
								   		 <td><label>Nombre:</label></td>
								         <td><input type="text" value="" name="nombre" id="nombre"/></td>
								   	</tr>
								   	<tr></tr><tr></tr>
								   	<tr>
								   		 <td><label>Apellido:</label></td>
								         <td><input type="text" value="" name="apellido" id="apellido"/></td>
								   	</tr>
								   	<tr></tr><tr></tr>
								   	<tr>
								   		 <td><label>DNI:</label></td>
								         <td><input type="text" value="" name="dni" id="dni"/></td>
								   	</tr>
								   	<tr></tr><tr></tr>
								   	<tr>
								   		 <td><label>Telefono:</label></td>
								          <td><input type="text" value="" name="telefono" id="telefono"/></td>
								   	</tr>
								   	<tr></tr><tr></tr>
								   	<tr>
								   		 <td><label>Email:</label></td>
								          <td><input type="text" value="" name="email" id="email"/></td>
								   	</tr>
								   <tr></tr><tr></tr>
								   </table>
								   <div class="wrapper"> 
								   		<table>
										<tr>
											<td>
								        <a href="javascript:onFormSubmit();" class="link2" > <span> <span>ACEPTAR</span> </span> </a> 
								        	</td>
								        <td></td>
											<td>
								        <a href="#" class="link2" onclick="document.getElementById('contacts-form').submit()"> <span> <span>CANCELAR</span> </span> </a>
								    		</td>
								        </tr>
								        </table>
								    </div>
							      </fieldset>
							  </form>
                            </div>
						</div>
					</div>
				</div>
				
			</div>