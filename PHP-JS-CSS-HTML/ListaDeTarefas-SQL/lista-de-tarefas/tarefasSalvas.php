<?php
	session_start();
	require_once "../conexao.php";
	
	$colunas = "tf_nome, tf_data, tf_hora, tf_status";
	$tabelas = "users, tarefas";
	$userId = $_SESSION["id"];
	$condicao = "WHERE us_codigo =" . $userId . " AND tf_us_cod = us_codigo";
	$dados = select($colunas, $tabelas, $condicao);
	foreach ($dados as $tarefa) {
		$status;
		if($tarefa["tf_status"] == 1){
			$status = "Concluida";
		}
		else{
			$status = "Não Concluída";
		}
		echo "<div id='dadosTarefas'>
				<p>Tarefa: " . $tarefa["tf_nome"] . "</p>
				<p>Data: " . $tarefa["tf_data"] . "</p>
				<p>Hora: " . $tarefa["tf_hora"] . "</p>
				<p>Situação: " . $status . "</p>
			  </div><br>";
	}
	
	
	echo "<div style='text-align:center'><a href='home.php' class='link'>Retornar ao menu</a></div>";
?>