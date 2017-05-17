<?php
	session_start();
	require_once "../conexao.php";
	require "Tarefa.php";
	
	$dadosTarefa = new Tarefa($_POST["nomeT"], $_POST["data"], $_POST["hora"]);

	$nome = $dadosTarefa-> getNomeTarefa();
	$data = $dadosTarefa-> getData();
	$hora = $dadosTarefa-> getHora();
	$status = $dadosTarefa-> getStatusAtual();
	$userId = $_SESSION["id"];

	$colunas = "tf_nome, tf_data, tf_hora, tf_status, tf_us_cod";
	$tarefa = "'$nome', '$data', '$hora', '$status', '$userId'";
	insert("tarefas", $colunas, $tarefa);

	header("Location: home.php");
?>