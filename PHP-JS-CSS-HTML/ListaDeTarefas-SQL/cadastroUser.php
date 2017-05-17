<?php
	require_once "conexao.php";
	
	$condicao = " WHERE us_login='" . $_POST['login'] . "'";
	$checkLogin = select("*", "users", $condicao);
	
	if(mysqli_fetch_array($checkLogin)){
		header("refresh:0; url=index.php");
		echo "<script>alert('Este usuário já existe.');</script>";
	}
	else{
		$colunas = "us_login, us_senha";
		$pass = md5($_POST["senha"]);
		$valores = "'" . $_POST["login"]. "', '" . $pass . "'";
		insert("users", $colunas, $valores);
		header("refresh:0; url=formLogin.php");
		echo "<script>alert('Usuário " . $_POST['login'] . " cadastrado com sucesso.');</script>";
	}
?>