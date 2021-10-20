<jsp:include page="/Fran/header.jsp"></jsp:include>
<jsp:include page="/Fran/navbar.jsp"></jsp:include>

<div class="container" style="padding: 20px">
	<form method="post" action="">
		<div style="text-align: center;">
			<label>DNI</label> <input type="text" id="user" name="user" size="50" required="required" />
		</div>
		<div style="text-align: center;">
			<br /> <label>Contraseña</label> <input type="password" id="pass" name="pass" size="50" required="required" />
		</div>

		<p style="text-align: center;">
			<button type="submit" class="btn btn-primary">Ingresar</button>
		</p>
	</form>
</div>

<jsp:include page="/Fran/footer.html"></jsp:include>