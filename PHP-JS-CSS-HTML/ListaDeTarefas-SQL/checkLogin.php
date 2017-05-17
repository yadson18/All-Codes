<?php
	require_once "conexao.php";
	
	$pass = md5($_POST['senha']);
	$condicao = " WHERE us_login='" . $_POST['login'] . "' AND us_senha='" . $pass . "'";
	$check = select("*", "users", $condicao);

	if(!mysqli_fetch_array($check)){
		echo "<script> alert('Usuário ou senha incorretos.'); </script>";
		header("refresh:0; url=formLogin.php");
	}
	else{
		session_start();
		
		foreach ($check as $id) {
			$_SESSION["id"] = $id["us_codigo"];
		}

		header("Location: lista-de-tarefas/home.php");
	}
?>