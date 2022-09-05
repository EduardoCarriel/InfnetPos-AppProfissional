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
	  <p>Projeto de cadastro de servi�os</p>
	  
	  <h3>Classe: Profissional</h3>	
	  <table class="table table-bordered">
	    <thead>
	      <tr>
	      	<th>ID</th>
	        <th>C�digo</th>
	        <th>Data Cadastro</th>
	        <th>Nome</th>
	        <th>Celular</th>
	        <th>Email</th>
	        <th>Endere�o</th>
	        <th>Servi�os</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
		    <c:forEach var="i" items="${listagem}">
		      <tr>
		      	<td>${i.id}</td>
		        <td>${i.codigo}</td>
		        <td>${i.getDataCadastroFormatada()}</td>
		        <td>${i.nome}</td>
		        <td>${i.telefoneCelular}</td>
		        <td>${i.email}</td>
		        <td>${i.endereco.cep} | ${i.endereco.logradouro} | ${i.endereco.numero} | ${i.endereco.bairro} | ${i.endereco.cidade} | ${i.endereco.estado}</td>
		        <td>${i.servicos.size()}</td>
		        <td><a href="/profissional/${i.id}/excluir">excluir</a></td>
		      </tr>
		      </c:forEach>
	    </tbody>
	  </table>
	</div>	
</body>
</html>