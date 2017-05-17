<?php
	require "Tarefa.class.php";
	session_start();

	for($i = 0; $i < sizeof($_SESSION["tarefas"]);){
		if($_SESSION["tarefas"][$i] !== NULL){
			echo "<div id='dadosTarefas'><p>Tarefa: " . $_SESSION["tarefas"][$i]-> getNomeTarefa() . "</p>";
			echo "<p>Data: " . $_SESSION["tarefas"][$i]-> getData() . "</p>";
			echo "<p>Hora: " . $_SESSION["tarefas"][$i]-> getHora() . "</p>";
			echo "<p>Status: " . $_SESSION["tarefas"][$i]-> getStatusAtual() . "</p></div><br>";
			$i++;
		}
		else{
			$i++;
		}
	}
	echo "<div style='text-align:center'><a href='index.php' class='link'>Retornar ao menu</a></div>";
?>