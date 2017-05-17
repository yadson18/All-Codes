<?php
	require "Tarefa.class.php";
	session_start();

	if (!isset($_SESSION["tarefas"])) {
		$_SESSION["tarefas"] = array();
	}

	$data = $_POST["dia"] . " de " . $_POST["mes"] . " de " . $_POST["ano"];
	$hora = $_POST["hora"] . ":" . $_POST["minuto"];

	$dadosTarefa = new Tarefa($_POST["nomeT"], $data , $hora);
	array_push($_SESSION["tarefas"], $dadosTarefa);
	
	header("Location: index.php");
?>