<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Vendedor Hinode</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8"/>
		<link rel="stylesheet" type="text/css" href="css/estilo.css"/>
	</head>
	<body>
		<?php 
			require_once "menu/menu.php"; 
			require_once "php/PDO.php";
			menu("index.php", "#", "#");
			makeTables();
		?>
		<form action="php/vendedor/login.php" method="POST" class="login-form">
			<h1>Sing In</h1>
			<label>Usuário:</label>
			<input type="text" name="user" required placeholder="Usuário">
			<label>Senha:</label>
			<input type="password" name="pass" required placeholder="Senha">
			<div class="btn">
				<input type="submit" value="Entrar">
			</div>
			<div class="link">
				<a href="php/vendedor/cadastroVendedor.php">Cadastrar-se</a>
			</div>
		</form>
	</body>
</html>