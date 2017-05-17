<?php
	require_once("Connect.php");
	
	$connect = new Connect("localhost", "root", "", "test");
	
	$colunas = "nome, idade";
	$dados = ["nome" => "Yadson", "idade" => 18];
	$connect-> insert("item", $dados);
	var_dump($connect);
?>
