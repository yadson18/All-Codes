<?php
	require_once "../sql/PDO.php";
	
	$pass = md5($_POST["senha"]);
	$condicao = " WHERE USUARIO='" . $_POST['usuario'] . "' AND SENHA='" . $pass . "'";
	$check = select("CODIGO, USUARIO, SENHA", "JOGADOR", $condicao);
	
	$dados = $check->fetch(PDO::FETCH_ASSOC);
	
	if(!$dados){
		echo "Fail";
	}
	else{
		echo "Oi";
	}
?>