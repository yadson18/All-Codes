<?php
	try {
		$GLOBALS["PDO"] = new PDO("mysql:host=localhost;port=13306;dbname=api", "root", "");
		
		function pdoInsert($tabela, $colunas, $valores){
			$GLOBALS["PDO"]->query("INSERT INTO " . $tabela . "(" . $colunas . ") 
						 			VALUES(" . $valores . ");");
		}
		function pdoSelect($colunas, $tabela, $condicao = null){
			return $GLOBALS["PDO"]->query("SELECT " . $colunas . " FROM " . $tabela . $condicao . ";");
		}
	}
	catch (PDOException $e) {
		echo "Error.";
	}
?>