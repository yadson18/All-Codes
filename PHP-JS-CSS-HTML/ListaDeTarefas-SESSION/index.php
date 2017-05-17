<?php 
	require "Tarefa.class.php";
	session_start();
	//session_destroy();
?>
<!DOCTYPE html>
<html>
	<head>
		<title>Menu Lista de Tarefas</title>
		<link href="css/estilo.css" rel="stylesheet">
		<script src="js/jquery-3.1.1.js"></script>
	</head>
	<body>
		<div id="menu">
			<h1>Lista de Tarefas</h1>
			<p class="opt1"><a href="#">Cadastrar Tarefa</a></p>
			<p class="opt2"><a href="#">Tarefas Salvas</a></p>
			<p class="opt3"><a href="#">Modificar Tarefa</a></p>
			<p class="opt4"><a href="#">Excluir Tarefa</a></p>
		</div>
		<div id="cont"></div>
		<script>
			$(".opt1").on("click", function(){
				$("body").load("cadastroTarefa.php");
			});
			$(".opt2").on("click", function(){
				$("body").load("tarefasSalvas.php");
			});
			$(".opt3").on("click", function(){
				$("body").load("modificarTarefa.php");
			});
			$(".opt4").on("click", function(){
				$("body").load("excluirTarefa.php");
			});
		</script>
	</body>
</html>
