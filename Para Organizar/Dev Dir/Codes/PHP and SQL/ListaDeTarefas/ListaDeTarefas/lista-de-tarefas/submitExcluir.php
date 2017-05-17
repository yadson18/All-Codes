<?php  
	require "../conexao.php";
	
	$indice = (int) $_POST["tarefaParaDeletar"];

	delete($indice);

	header("Location: home.php");
?>