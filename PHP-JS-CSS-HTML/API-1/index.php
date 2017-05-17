<?php require_once "API/config.php"; ?>
<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>
	<?php 
		require_once "API/telaDeLogin.html"; 
		require_once "API/Form.php";
	?>

	<?= Form::input("radio", "nome", "radioY", "Yadson", "checked"); ?> Yadson.
	<?= Form::input("radio", "nome", "radioI", "Izabelly"); ?> Izabelly.
</body>
</html>