<?php
	require_once "User.php";
	require_once "sessao.php";

	$user = new User($_POST["login"], $_POST["pass"]);
	
	if(logar($user) == true){
		//echo "<h1 style='text-align: center'>Bem vindo " . $_POST["login"] . ".</h1>";
		header("Location: home.html");
	}
	else{
		//echo "<h1 style='text-align: center'>Usuário ou senha incorreto.</h1>";
		header("Location: index.html");
	}
?>