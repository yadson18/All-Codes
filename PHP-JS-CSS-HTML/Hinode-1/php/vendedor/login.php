<?php
	require_once "../PDO.php";
	session_start();

	$user = $_POST["user"];
	$pass = md5($_POST["pass"]);
	$colunas = "us_codigo, us_login, us_senha";
	$condicao = " WHERE us_login='" . $user . "' AND us_senha='" . $pass . "'";
	
	$checkLogin = select($colunas, "user", $condicao);
	$dados = $checkLogin->fetch(PDO::FETCH_ASSOC);
	
	if(!$dados){
		header("Location: ../../index.php");
	}
	else{
		$_SESSION["uid"] = $dados["us_codigo"];
		header("Location: menuVendedor.php");
	}
?>