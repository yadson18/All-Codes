<?php
		try{ 
	 		$GLOBALS["PDO"] = new PDO( 'mysql:host=localhost;port=3306;dbname=hinode', 'root', ''); 
	 		
	 		function insert($tabela, $colunas, $valores){
	 			$GLOBALS["PDO"]->query("INSERT INTO " . $tabela . "(" . $colunas . ")
																			 VALUES(" . $valores . ");");
	 		}
			
			function select($colunas, $tabelas, $condicao = null){
				return $GLOBALS["PDO"]->query("SELECT " . $colunas . " FROM " . $tabelas . $condicao . ";");
			}
			
	 	}
	 	catch(PDOException $e){ 
	 		echo 'Erro ao conectar com o MySQL'; 
	 	}
?>