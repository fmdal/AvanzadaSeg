<jsp:include page="/Fran/header.jsp"></jsp:include>
<jsp:include page="/Fran/navbar.jsp"></jsp:include>

<div class="container" style="padding: 20px">
	<form method="post" action="">
	<div style="text-align: left;">
		<label>Patente</label> <input type="text" id="patente" name="patente" size="50" required="required" />
	</div>

	<div style="text-align: left;">
		<label>Marca</label> <input type="text" id="marca" name="marca" size="50" required="required" />
	</div>

	<div style="text-align: left;">
		<label>Modelo</label> <input type="text" id="modelo" name="modelo" size="50" required="required" />
	</div>

	<div style="text-align: left;">
		<label>Capacidad del tanque de nafta</label> <input type="text" id="tanqueNafta" name="tanqueNafta" size="50" required="required" />
	</div>

	<div style="text-align: left;">
		<label>Peso maximo</label> <input type="text" id="pesoMax" name="pesoMax" size="50" required="required" />
	</div>

	<div style="text-align: left;">
		<label>Consumo de litros de nafta por kilometro</label> <input type="text" id="litrosxKm" name="litrosxKm" size="50" required="required" />
	</div>


	<p style="text-align: left;">
		<button type="submit" class="btn btn-light">Ingresar</button>
	</p>

	<a type="button" class="btn btn-dark" href="http://localhost:8080/AvanzadaSeg/perfilAdmin.jsp">Volver</a>


	</form>
</div>

<jsp:include page="/Fran/footer.html"></jsp:include>