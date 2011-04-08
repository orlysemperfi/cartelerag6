<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

<c:forEach items="${data}" var="pelicula">
	Película:  <c:out value="${pelicula.nomPelicula}"/>  <br/>
	<hr/>
</c:forEach>

