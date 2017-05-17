<?php
	require_once "../../PDO.php";
	session_start();

	$colunas = "cl_nome, cl_sobrenome, cl_idade, cl_email, cl_telefone, cl_us_codigo";
	$valores = "'" . $_POST['nome'] . "','" . $_POST['sobrenome'] . "','" .$_POST['idade'] . "','" . $_POST['email'] . "','" . $_POST['telefone'] . "','" . $_SESSION['uid'] . "'";
	insert("cliente", $colunas, $valores);
	
	header("Location: ../menuCliente.php");
?>