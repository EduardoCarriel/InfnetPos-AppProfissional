<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<nav class="navbar navbar-expand-sm bg-success navbar-dark">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="/">AppProfissional</a>
      </li>
      <c:if test="${not empty user}">
	      <li class="nav-item">
	        <a class="nav-link" href="/musculacao/lista">Musculação</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/saude/lista">Saude</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/estetica/lista">Estética</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/profissional/lista">Profissional</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/endereco/lista">Endereço</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/usuario/lista">Usuário</a>
	      </li>
      </c:if>
    </ul>
    
    <ul class="navbar-nav">
    	<c:if test="${empty user}">
	      <li class="nav-item">
	        <a class="nav-link" href="/usuario">Signup</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/login">Login</a>
	      </li>
      	</c:if>
      	
      	<c:if test="${not empty user}">
	      <li class="nav-item">
	        <a class="nav-link" href="">Logout, ${user.nome}</a>
	      </li>
      	</c:if>
    </ul>
  </div>
</nav>