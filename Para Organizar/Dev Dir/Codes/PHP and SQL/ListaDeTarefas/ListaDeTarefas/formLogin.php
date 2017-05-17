<!DOCTYPE html>
<html>
	<head>
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="css/estilo.css">
		<script src="js/jquery-3.1.1.js"></script>
	</head>
	<body>
		<form action="checkLogin.php" method="POST" class="form">
			<h3>Entrar</h3>
			<h4>Login</h4>
			<input type="text" name="login" required placeholder="Login" class="input"/>
			<h4>Senha</h4>
			<input type="password" name="senha" required placeholder="Password" class="input"/>
			<div>
				<input type="submit" value="Entrar" class="botao"/>
			</div>
			<a href="index.php">Cadastrar-se</a>
		</form>
		<script src="js/script.js"></script>
	</body>
</html>