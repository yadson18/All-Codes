<?php 
	session_start(); 
	require_once "../conexao.php";
	require "Tarefa.php";
	
	$state = (int) $_POST["status"];
	if($state == 1){
		$state = "true";
	}
	else{ 
		$state = "false";
	}
	$dadosTarefa = new Tarefa($_POST["nomeT"], $_POST["data"], $_POST["hora"]);
	$dadosTarefa-> setStatusAtual($state);
	$nome = $dadosTarefa-> getNomeTarefa();
	$data = $dadosTarefa-> getData();
	$hora = $dadosTarefa-> getHora();
	$status = $dadosTarefa-> getStatusAtual();
	$userId = $_SESSION["id"];
	$modificar = "tf_nome = '$nome', tf_data = '$data', tf_hora = '$hora', tf_status = $status";
	$condicao = "WHERE tf_codigo = " . $_POST["id"] . " AND tf_us_cod = " . $userId;
	update($modificar, $condicao);

	header("Location: home.php");
?>