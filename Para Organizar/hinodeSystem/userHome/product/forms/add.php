<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Cadastrar Produto</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="../../SistemaLogin/css/estilo.css">
		<script src="../../SistemaLogin/js/jquery-3.1.1.js"></script>
	</head>
	<body>
		 <form action="submitCadastro.php" method="POST" class="login-form formStyle">
			<h1>Cadastro Cliente</h1>
			<label>Nome</label>
			<input type="text" name="nome" required placeholder="Nome">
			<label>Sobrenome</label>
			<input type="text" name="sobrenome" required placeholder="Sobrenome">
			<label>Idade</label>
			<select name="idade"> 
				<?php 
					for($i = 18; $i < 100; $i++){
						echo "<option value='" . $i . "'>" . $i ."</option>";
					} 
				?> 
			</select>
			<br>
			<label>Email</label>
			<input type="email" name="email" required placeholder="Email">
			<label>Telefone</label>
			<input type="tel" name="telefone" required placeholder="Telefone">
			<div class="btn">
				<input type="submit" value="Cadastrar">
			</div>
		</form>
	</body>
</html>