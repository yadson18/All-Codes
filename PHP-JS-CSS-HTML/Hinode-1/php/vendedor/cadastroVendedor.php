<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Cadastro Vendedor Hinode</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8"/>
		<link rel="stylesheet" type="text/css" href="../../css/estilo.css"/>
	</head>
	<body>
		<?php 
			require_once "../../menu/menu.php"; 
			menu("../../index.php", "#", "#");
		?>
		<form action="submitCadastro.php" method="POST" class="login-form">
			<h1>Cadastro Vendedor</h1>
			<label>Usuário:</label>
			<input type="text" name="user" required placeholder="Usuário">
			<label>Senha:</label>
			<input type="password" name="pass" required placeholder="Senha">
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
			<div class="link">
				<a href="../../index.php">Sing In</a>
			</div>
		</form>
	</body>
</html>

