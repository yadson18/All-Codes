<?php
	$GLOBALS["link"] = mysqli_connect("localhost", "root", "", "user");
	
	if(!$GLOBALS["link"]){
		echo "Impossível conectar.";
	}
	else{
			/*$sql = "CREATE TABLE login(
				codigo INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, 
				login VARCHAR(40) NOT NULL,
				senha VARCHAR(40) NOT NULL
				);";
	@mysqli_query($GLOBALS["link"], $sql);*/
		function insert($tabela, $colunas, $valores){
		$values = mysqli_query($GLOBALS["link"], "INSERT INTO " . $tabela . "(" . $colunas . ") VALUES(" . $valores . ");");
		 }
		 
		 function select($colunas = "*", $tabela, $condicao = ";"){
		 		return mysqli_query($GLOBALS["link"], "SELECT " . $colunas . " FROM " . $tabela . $condicao);
		 }
	}
?>