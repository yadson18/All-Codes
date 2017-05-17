<html>
	<head>
		<title>Make Class</title>
		<meta charset="utf-8">
	</head>
	<body>
		<form action="create.php" method="POST">
			<p>
				Acesso à classe:
				<select name="acess">
				 	<option value="1">PUBLIC</option>
				 	<option value="2">PRIVATE</option>
				 	<option value="3">PROTECTED</option>
				</select>
			</p>
			<p>
				Nome da Classe: 
				<input type="text" required>
			</p>
			<p>
				Quantidade de atributos:
				<input type="date">
			</p>
		</form>
	</body>
</html>