<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<title>Cadastro Hinode</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta charset="utf-8"/>
		<link rel="stylesheet" type="text/css" href="../css/estilo.css"/>
	</head>
	<body>
		<form action="php/login.php" method="POST" class="login-form">
			<label>Usuário:</label>
			<input type="text" name="user" required placeholder="Usuário">
			<label>Senha:</label>
			<input type="password" name="pass" required placeholder="Senha">
			<div class="btn">
				<input type="submit" value="Entrar">
			</div>
			<div class="link">
				<a href="../index.php">Sing In</a>
			</div>
		</form>
	</body>
</html>