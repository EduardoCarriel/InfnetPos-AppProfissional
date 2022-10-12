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
	  <h2>Cadastro de Serviço - Estética</h2>
	  
	  <form action="/estetica/incluir" method="POST">
	  	<div class="mb-3 mt-3">
	  		<label>Código:</label>
	  		<input type="text" class="form-control" placeholder="Informe o Código" name="codigo">
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Descrição:</label>
	  		<input type="text" class="form-control" placeholder="Informe a Descrição" name="descricao">
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Valor:</label>
	  		<input type="text" class="form-control" placeholder="Informe o Valor" name="valor">
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Dias Retorno:</label>
	  		<input type="number" class="form-control" placeholder="Informe os número de dias para retorno" name="diasRetorno">
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Facial?:</label>
	  		<label class="radio-inline">
	  			<input type="radio" name="facial" value="true"> Sim
	  		</label>
	  		<label class="radio-inline">
	  			<input type="radio" name="facial" value="false"> Não
	  		</label>
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Corporal?:</label>
	  		<label class="radio-inline">
	  			<input type="radio" name="corporal" value="true"> Sim
	  		</label>
	  		<label class="radio-inline">
	  			<input type="radio" name="corporal" value="false"> Não
	  		</label>
	  	</div>
	  	
	  	<div class="mb-3 mt-3">
	  		<label>Capilar?:</label>
	  		<label class="radio-inline">
	  			<input type="radio" name="capilar" value="true"> Sim
	  		</label>
	  		<label class="radio-inline">
	  			<input type="radio" name="capilar" value="false"> Não
	  		</label>
	  	</div>
	  	
	  	<button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>	
</body>
</html>