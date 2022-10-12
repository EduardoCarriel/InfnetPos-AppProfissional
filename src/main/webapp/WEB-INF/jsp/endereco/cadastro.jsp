<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<title>AppProfissional</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastro de Endereço</h2>
	  
	  <form action="/endereco/incluir" method="POST">
	  	<div class="mb-3 mt-3">
	  		<label>CEP:</label>
	  		<input type="text" class="form-control" placeholder="Informe o CEP" name="cep">
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Logradouro:</label>
	  		<input type="text" class="form-control" placeholder="Informe o Logradouro" name="logradouro">
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Número:</label>
	  		<input type="number" class="form-control" placeholder="Informe o Número" name="numero">
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Bairro:</label>
	  		<input type="text" class="form-control" placeholder="Informe o Bairro" name="bairro">
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Cidade:</label>
	  		<input type="text" class="form-control" placeholder="Informe a Cidade" name="cidade">
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Estado:</label>
	  		<input type="text" class="form-control" placeholder="Informe o Estado" name="estado">
	  	</div>
	  	
	  	<button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>	
</body>
</html>