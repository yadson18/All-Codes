<?php
	require_once "../sql/PDO.php";

	$user = $_POST["usuario"];
	$pass = md5($_POST["senha"]);
	$condicao = " WHERE USUARIO = '" . $user . "' AND SENHA = '" . $pass . "'";
	$check = select("CODIGO", "JOGADOR", $condicao);
	
	$dados = $check->fetch(PDO::FETCH_ASSOC);
	
	if(!$dados){
		$colunas = "USUARIO, SENHA, NOME, SOBRENOME, IDADE";
		$dados = "'" . $user . "','" . $pass ."','" . $_POST['nome'] . "','" . $_POST['sobrenome'] . "','" . $_POST['idade'] . "'";
		insert("JOGADOR", $colunas, $dados);
		
		header("Location: ../index.html");
	}
	else{
		header("Location: ../cadastroJogador.html");
	}
?>