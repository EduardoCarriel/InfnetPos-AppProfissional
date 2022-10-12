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
	  
	  <h3>Classe: Profissional</h3>	              
	  <table class="table table-bordered">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>id</td>
	        <td>int</td>
	        <td>Identificador único.</td>
	      </tr>
	      <tr>
	        <td>codigo</td>
	        <td>int</td>
	        <td>Código do profissional.</td>
	      </tr>
	      <tr>
	        <td>dataCadastro</td>
	        <td>LocalDateTime</td>
	        <td>Data e hora do cadastro do profissional.</td>
	      </tr>
	      <tr>
	        <td>nome</td>
	        <td>String</td>
	        <td>Nome do profissional.</td>
	      </tr>
	      <tr>
	        <td>telefoneCelular</td>
	        <td>String</td>
	        <td>Telefone celular de contato.</td>
	      </tr>
	      <tr>
	        <td>email</td>
	        <td>String</td>
	        <td>E-mail de contato.</td>
	      </tr>
	    </tbody>
	  </table>

	  <h3>Classe: Endereco</h3>	              
	  <table class="table table-bordered">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>id</td>
	        <td>int</td>
	        <td>Identificador único.</td>
	      </tr>
	      <tr>
	        <td>cep</td>
	        <td>int</td>
	        <td>Cep do estabelecimento.</td>
	      </tr>
	      <tr>
	        <td>logradouro</td>
	        <td>String</td>
	        <td>Rua do estabelecimento.</td>
	      </tr>
	      <tr>
	        <td>numero</td>
	        <td>int</td>
	        <td>Número do estabelecimento.</td>
	      </tr>
	      <tr>
	        <td>bairro</td>
	        <td>String</td>
	        <td>Bairro do estabelecimento.</td>
	      </tr>
	      <tr>
	        <td>cidade</td>
	        <td>String</td>
	        <td>Cidade do estabelecimento.</td>
	      </tr>
	      <tr>
	        <td>estado</td>
	        <td>String</td>
	        <td>Estado do estabeleicmento.</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  <h3>Classe: Servico</h3>	
	  <table class="table table-bordered">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
    	  <tr>
	        <td>id</td>
	        <td>int</td>
	        <td>Identificador único.</td>
	      </tr>
	      <tr>
	        <td>codigo</td>
	        <td>int</td>
	        <td>Código do serviço cadastrado.</td>
	      </tr>
	      <tr>
	        <td>descricao</td>
	        <td>String</td>
	        <td>Descrição do serviço cadastrado.</td>
	      </tr>
	      <tr>
	        <td>tipoCobranca</td>
	        <td>EnumTipoCobranca</td>
	        <td>Indicador do tipo de cobrança. Ex: Dia, Mês, Quantidade, etc.</td>
	      </tr>
	      <tr>
	        <td>valor</td>
	        <td>float</td>
	        <td>Valor do serviço cadastrado.</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  <h3>Classe: Estetica</h3>	
	  <table class="table table-bordered">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>id</td>
	        <td>int</td>
	        <td>Identificador único.</td>
	      </tr>
	      <tr>
	        <td>diasRetorno</td>
	        <td>int</td>
	        <td>Número do dias de retorno após a realização do serviço.</td>
	      </tr>
	      <tr>
	        <td>facial</td>
	        <td>Boolean</td>
	        <td>Indica se o serviço é do tipo facial.</td>
	      </tr>
	      <tr>
	        <td>corporal</td>
	        <td>Boolean</td>
	        <td>Indica se o serviço é do tipo corporal.</td>
	      </tr>
	      <tr>
	        <td>capilar</td>
	        <td>Boolean</td>
	        <td>Indica se o serviço é do tipo capilar.</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  <h3>Classe: Saude</h3>	
	  <table class="table table-bordered">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>id</td>
	        <td>int</td>
	        <td>Identificador único.</td>
	      </tr>
	      <tr>
	        <td>especialidade</td>
	        <td>String</td>
	        <td>Nome da especialidade do serviço prestado.</td>
	      </tr>
	      <tr>
	        <td>idadeMinima</td>
	        <td>int</td>
	        <td>Idade mínima permitida para prestação de serviço.</td>
	      </tr>
	      <tr>
	        <td>idadeMaxima</td>
	        <td>int</td>
	        <td>Idade máxima permitida para prestação de serviço.</td>
	      </tr>
	      <tr>
	        <td>retornoProximoMes</td>
	        <td>Boolean</td>
	        <td>Indica se o serviço terá consulta de retorno no próximo mês para verificação.</td>
	      </tr>
	    </tbody>
	  </table>
	  
	  <h3>Classe: Musculacao</h3>	
	  <table class="table table-bordered">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>id</td>
	        <td>int</td>
	        <td>Identificador único.</td>
	      </tr>
	      <tr>
	        <td>personalTrainer</td>
	        <td>boolean</td>
	        <td>Indica se irá ter acompanhamento do Personal Trainer.</td>
	      </tr>
	      <tr>
	        <td>dieta</td>
	        <td>boolean</td>
	        <td>Indica se irá ter o plano de dieta.</td>
	      </tr>
	      <tr>
	        <td>avaliacaoFisica</td>
	        <td>boolean</td>
	        <td>Indica se irá ter acompanhamento / avaliação física.</td>
	      </tr>
	    </tbody>
	  </table>
	</div>	
</body>
</html>