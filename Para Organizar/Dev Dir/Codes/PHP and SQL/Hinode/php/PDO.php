<?php
		try{ 
	 		$GLOBALS["PDO"] = new PDO( 'mysql:host=localhost ;dbname=hinode', 'root', ''); 
	 		
	 		function insert($tabela, $colunas, $valores){
	 			$GLOBALS["PDO"]->query("INSERT INTO " . $tabela . "(" . $colunas . ")
																			 VALUES(" . $valores . ");");
	 		}
	 	}
	 	catch(PDOException $e){ 
	 		echo 'Erro ao conectar com o MySQL: ' . $e->getMessage(); 
	 	}
?>