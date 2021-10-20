<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="navbar.jsp"></jsp:include>

<div class="container" style="padding: 20px">
	<form method="post" action="ViajesController">

		<div style="text-align: left;">
			<label>Patente</label>
			<input type="text" id="patente" name="patente" required="required" />
		</div>


		<input id="accion" name="accion" type="hidden" value="alta">

		<div style="text-align: left; padding: 30px;">
			<button type="submit" class="btn btn-light">Ingresar</button>
			<button class="btn btn-dark" onclick="window.location.href='http://localhost:8080/AvanzadaSeg/perfilAdmin.jsp'">Volver</button>
		</div>
	</form>
</div>

<jsp:include page="footer.html"></jsp:include>