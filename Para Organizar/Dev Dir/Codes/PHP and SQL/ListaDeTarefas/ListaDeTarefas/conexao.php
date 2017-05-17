<?php  
	$GLOBALS['link'] = $link = mysqli_connect("localhost", "root", "", "listadetarefas");

	if(!$link){
		echo "<script>alert('Impossível conectar.');</script>";
	}

	function select($coluna = '*', $tabela, $condicao = ';'){
		$data = mysqli_query($GLOBALS['link'], "SELECT " . $coluna . " FROM " . $tabela . " " . $condicao);
		
		return $data;
	}

	function insert($tabela, $colunas, $valores){
		mysqli_query($GLOBALS['link'], "INSERT INTO " . $tabela . "(" . $colunas . ") VALUES(" . $valores . ");");
	}

	function delete($id){
		mysqli_query($GLOBALS['link'], "DELETE FROM tarefas WHERE tf_codigo = " . $id);
	}
	
	function update($modificarDados, $condicao = ";"){
		mysqli_query($GLOBALS['link'], "UPDATE tarefas SET " . $modificarDados . " " . $condicao);
	}
?>