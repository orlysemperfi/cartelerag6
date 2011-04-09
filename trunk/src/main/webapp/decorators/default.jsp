<%@page contentType="text/html;charset=iso-8859-1"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Home - Home Page | Cinema - Free Website Template from Templates.com</title>
<!-- meta http-equiv="Content-Type" content="text/html; charset=utf-8" /-->
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<meta name="description" content="Place your description here" />
<meta name="keywords" content="put, your, keyword, here" />
<meta name="author" content="Templates.com - website templates provider" />
 
<link href="<c:url value="resources/css/style.css" />" rel="stylesheet" type="text/css" />
<script src="<c:url value="resources/js/jquery-1.4.2.min.js" />" type="text/javascript"></script>
<script src="<c:url value="resources/js/cufon-yui.js" />" type="text/javascript"></script>
<script src="<c:url value="resources/js/cufon-replace.js" />" type="text/javascript"></script>
<script src="<c:url value="resources/js/Gill_Sans_400.font.js" />" type="text/javascript"></script>
<script src="<c:url value="resources/js/script.js" />" type="text/javascript"></script>
<!--[if lt IE 7]>
	<script src="<c:url value="resources/js/ie_png.js" />" type="text/javascript" />
	<script type="text/javascript">
		 ie_png.fix('.png, .link1 span, .link1');
	</script>
	<link href="<c:url value="resources/css/ie6.css" />" rel="stylesheet" type="text/css" />
<![endif]-->

 
</head>
<body id="page1">
<div class="tail-top">
	<div class="tail-bottom">
		<div id="main">
<!-- HEADER -->
			<div id="header">
				<div class="row-1">
					<div class="fleft"><a href="index.html">Cinema <span>World</span></a></div>
					<ul>
					<!-- 
						<li><a href="index.html"><img src="<c:url value="/resources/images/icon1-act.gif" />" alt="" /></a></li>
						<li><a href="contact-us.html"><img src="<c:url value="/resources/images/icon2.gif" />" alt="" /></a></li>
						<li><a href="sitemap.html"><img src="<c:url value="/resources/images/icon3.gif" />" alt="" /></a></li>
 					-->
 						<li><a href="/cartelerag6"><img src="<c:url value="/resources/images/icon1-act.gif" />" alt="" /></a></li>
						<li><a href="#"><img src="<c:url value="/resources/images/icon2.gif" />" alt="" /></a></li>
						<li><a href="#"><img src="<c:url value="/resources/images/icon3.gif" />" alt="" /></a></li>
 											
					</ul>
				</div>
				<div class="row-2">
					<ul>
					<!-- 
						<li><a href="index.html" class="active">Home</a></li>
						<li><a href="about-us.html">About</a></li>
						<li><a href="articles.html">Articles</a></li>
						<li><a href="contact-us.html">Contacts</a></li>
						<li class="last"><a href="sitemap.html">Sitemap</a></li>
					 -->
						<li><a href="/cartelerag6" class="active">Inicio</a></li>
						<li><a href="Salas.htm">Salas</a></li>
						<li><a href="peliculas.htm">Peliculas</a></li>
						<li><a href="#">Contacts</a></li>
						<li class="last"><a href="#">Sitemap</a></li>
					</ul>
				</div>
			</div>
			
    <!--  BODY -->
    
    <decorator:body/>
    
    <!--  Fin de BODY -->    
    			
<!-- FOOTER -->
			<div id="footer">
				<div class="left">
					<div class="right">
						<div class="inside">Copyright - Type in your name here<br />
							<a href="http://www.templatemonster.com/" class="new_window">Website template</a> designed by TemplateMonster.com<br />
							<a href="http://www.templates.com/product/3d-models/" class="new_window">3D Models</a> provided by Templates.com 
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>