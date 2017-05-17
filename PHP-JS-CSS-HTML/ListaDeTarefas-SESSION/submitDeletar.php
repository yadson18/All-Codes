<?php  
	require "Tarefa.class.php";
	session_start();

	$indice = (int) $_POST["tarefaParaDeletar"];

	unset($_SESSION["tarefas"][$indice]);

	for($i = $indice; $i < sizeof($_SESSION["tarefas"]); $i++){
		$_SESSION["tarefas"][$i] = $_SESSION["tarefas"][$i + 1];
	}

	header("Location: index.php");
?>