<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link
 href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
 rel="stylesheet" id="bootstrap-css">
<script
 src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script
 src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link
 href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
 rel="stylesheet"
 integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
 crossorigin="anonymous">
<script
 src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"
 integrity="sha384-W8fXfP3gkOKtndU4JGtKDvXbO53Wy8SZCQHczT5FMiiqmQfUpWbYdTil/SxwZgAN"
 crossorigin="anonymous"></script>
<script
 src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js"
 integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/"
 crossorigin="anonymous"></script>
<body>

 <div style="text-align: left;">
  <label>Patente</label> <input type="text" id="patente" name="patente" size="50" required="required"
    />
</div>

 <div style="text-align: left;">
  <label>Marca</label> <input type="text" id="marca" name="marca" size="50" required="required"
    />
</div>

 <div style="text-align: left;">
  <label>Modelo</label> <input type="text" id="modelo" name="modelo" size="50" required="required"
    />
</div>

 <div style="text-align: left;">
  <label>Capacidad del tanque de nafta</label> <input type="text" id="tanqueNafta" name="tanqueNafta" size="50" required="required"
    />
</div>

 <div style="text-align: left;">
  <label>Peso maximo</label> <input type="text" id="pesoMax" name="pesoMax" size="50" required="required"
    />
</div>

 <div style="text-align: left;">
  <label>Consumo de litros de nafta por kilometro</label> <input type="text" id="litrosxKm" name="litrosxKm" size="50" required="required"
    />
</div>

 
  <p style="text-align: left;">
   <button type="submit" class="btn btn-light">Ingresar</button>
  </p>
  
  <a type="button" class="btn btn-dark" href="http://localhost:8080/AvanzadaSeg/perfilAdmin.jsp">Volver</a>
  
  

</body>
</html>