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
	  <p>Projeto de cadastro de serviços</p>
	  
	  <h3>Classe: Estetica</h3>
	  
	  <h4><a href="/estetica">Novo</a></h4>
	  	
	  <table class="table table-bordered">
	    <thead>
	      <tr>
	      	<th>ID</th>
	        <th>Código</th>
	        <th>Descrição</th>
	        <th>Tipo de Cobrança</th>
	        <th>Valor Unitário</th>
	        <th>Dias retorno</th>
	        <th>Facial</th>
	        <th>Corporal</th>
	        <th>Capilar</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		    <c:forEach var="i" items="${listagem}">
		      <tr>
		      	<td>${i.id}</td>
		        <td>${i.codigo}</td>
		        <td>${i.descricao}</td>
		        <td>${i.tipoCobranca}</td>
		        <td>${i.valor}</td>
		        <td>${i.diasRetorno}</td>
		        <td>${i.facial}</td>
		        <td>${i.corporal}</td>
		        <td>${i.capilar}</td>
		        <td><a href="/estetica/${i.id}/excluir">excluir</a></td>
		      </tr>
		      </c:forEach>
	    </tbody>
	  </table>
	</div>	
</body>
</html>