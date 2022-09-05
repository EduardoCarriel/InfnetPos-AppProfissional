<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<title>AppProfissional</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>AppProfissional</h2>
	  
	  <form action="/usuario/incluir" method="POST">
	  	<div class="mb-3 mt-3">
	  		<label>Nome:</label>
	  		<input type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
	  	</div>
	  
	  	<div class="mb-3 mt-3">
	  		<label>E-mail:</label>
	  		<input type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Senha:</label>
	  		<input type="password" class="form-control" placeholder="Entre com a sua senha" name="senha">
	  	</div>
	  	
	  	<button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>	
</body>
</html>