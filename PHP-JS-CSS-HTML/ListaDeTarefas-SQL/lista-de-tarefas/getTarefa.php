<?php  
	session_start();
	require_once "../conexao.php";

	$id = $_POST["acc"];
	$userId = $_SESSION["id"];

	$colunas = "tf_codigo, tf_nome, tf_data, tf_hora, tf_status, tf_us_cod";
	$tabelas = "users, tarefas";
	$condicao = "WHERE tf_codigo=" . $id . " AND tf_us_cod=" . $userId;
	$json = select($colunas, $tabelas, $condicao);
	$obj = array();
	foreach ($json as $j) {
		$obj = [
					"codigo" => $j["tf_codigo"],
					"nome" => $j["tf_nome"],
					"data" => $j["tf_data"],
					"hora" => $j["tf_hora"],
					"status" => $j["tf_status"],
					"userId" => $j["tf_us_cod"]
			   ];
	}

	echo "<script> var json =" .json_encode($obj) . "; </script>";
?>