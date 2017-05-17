<?php
	require_once "../sql/PDO.php";
	session_start();
	
	$user = $_POST["usuario"];
	$pass = md5($_POST["senha"]);
	$condicao = " WHERE USUARIO = '" . $user . "' AND SENHA = '" . $pass . "'";
	$check = select("CODIGO", "JOGADOR", $condicao);
	
	$id = $check->fetch(PDO::FETCH_ASSOC);
	
	if(!$id){
		header("Location: ../index.html");
	}
	else{
		$_SESSION["userId"] = $id;
		header("Location: game.php");
	}
?>