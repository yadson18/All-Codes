<?php  
	require "Tarefa.class.php";
	session_start();

	$data = $_POST["dia"] . " de " . $_POST["mes"] . " de " . $_POST["ano"];
	$hora = $_POST["hora"] . ":" . $_POST["minuto"];
	$indice = $_POST["tarefaParaModificar"];

	$dadosTarefa = new Tarefa($_POST["nomeT"], $data , $hora);
	$dadosTarefa-> setStatusAtual($_POST["status"]);
	$_SESSION["tarefas"][$indice] = $dadosTarefa;
	
	header("Location: index.php");
?>