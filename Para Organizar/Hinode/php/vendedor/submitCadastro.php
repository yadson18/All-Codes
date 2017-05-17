<?php
	require_once "../PDO.php";

	$colunas = "us_nome, us_sobrenome, us_idade, us_email, us_telefone, us_login, us_senha";
	$pass = md5($_POST['pass']);
	$valores = "'" . $_POST['nome'] . "','" . $_POST['sobrenome'] . "','" .$_POST['idade'] . "','" . $_POST['email'] . "','" . $_POST['telefone'] . "','" . $_POST['user'] . "','" . $pass . "'";
	insert("user", $colunas, $valores);
	
	header("Location: ../../index.php");
?>