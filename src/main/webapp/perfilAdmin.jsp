<jsp:include page="/Fran/header.jsp"></jsp:include>
<jsp:include page="/Fran/navbar.jsp"></jsp:include>

<div class="container" style="padding: 20px">
	<form method="post" action="">

	<div style="text-align: left;">
		<label>Patente</label> <input type="text" id="patente" name="patente" size="50" required="required" />
	</div>

	<p style="text-align: left;">
		<button type="submit" class="btn btn-light">Ingresar</button>
	</p>

	<a type="button" class="btn btn-dark" href="http://localhost:8080/AvanzadaSeg/perfilAdmin.jsp">Volver</a>


	</form>
</div>

<jsp:include page="/Fran/footer.html"></jsp:include>