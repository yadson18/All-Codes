<?php
	require_once "User.php";
	require_once "sessao.php";
	
	$user = new User($_POST["login"], $_POST["pass"]);
	inserirUser($user);

	echo "<div style='text-align: center; font-size: 20px'><a href='index.html'>Fazer o login.</a></div>";
?>