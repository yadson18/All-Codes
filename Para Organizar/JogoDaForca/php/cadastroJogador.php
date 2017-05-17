<?php
	require_once "../sql/PDO.php";
	
	$colunas = "USUARIO, SENHA, NOME, SOBRENOME, IDADE";
	$pass = md5($_POST['senha']);
	$dados = "'" . $_POST['usuario'] . "','" . $pass ."','" . $_POST['nome'] . "','" . $_POST['sobrenome'] . "','" . $_POST['idade'] . "'";
	insert("JOGADOR", $colunas, $dados);
	
	header("Location: ../index.html");
?>