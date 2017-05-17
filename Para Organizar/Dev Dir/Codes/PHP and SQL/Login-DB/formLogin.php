<html>
	<head>
		<title>Login</title>
		<style>
			h3{
				margin: 0;
				padding: 3px;
			}
			form{
				border: solid 3px black;
				padding: 7px;
				width: 70%;
				margin: auto;
				text-align: center;
			}
			body, body input{
				font-size: 40px;
			}
			form div{
				margin-top: 20px;
			}
		</style>
	</head>
	<body>
		<form action="checkLogin.php" method="POST">
			<h3>Sing In</h3>
			<input type="text" name="login"/>
			<h3>Senha</h3>
			<input type="password" name="senha"/>
			<div>
				<input type="submit" value="Salvar"/>
			</div>
		</form>
	</body>
</html>