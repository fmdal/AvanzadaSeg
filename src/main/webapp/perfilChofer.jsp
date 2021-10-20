<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="navbar.jsp"></jsp:include>

<div class="container" style="padding: 20px">
	<form method="post" action="">
		<div style="text-align: left;">
			<label>Patente</label>
			<input type="text" id="patente" name="patente" required="required" />
		</div>

		<div style="text-align: left;">
			<label>Viaje1</label>
			<p style="text-align: center;">
				<button type="submit" class="btn btn-light">Finalizar</button>
			</p>
		</div>

<form method="GET" action="ViajesController">
	<td id="viajesID" name="viajesID">ID</td>
		<% for (int i=0;i<ViajesController.getCh().getListaViaje().size(); i++ ){ %>
	<td><%= sl.getCh().getListaViaje().get(i).getIdViaje()  %></td>
	<td><%= sl.getCh().getListaViaje().get(i).getDestino()  %></td>
<%} %>
</form>



		<p style="text-align: left;">
			<button type="submit" class="btn btn-light">Ingresar</button>
		</p>

		<a type="button" class="btn btn-dark" href="http://localhost:8080/AvanzadaSeg/perfilAdmin.jsp">Volver</a>



	</form>
</div>

<jsp:include page="footer.html"></jsp:include>