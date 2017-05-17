<?php
		try{ 
	 		$GLOBALS["PDO"] = new PDO('mysql:host=localhost;port=13306;dbname=forca', 'root', ''); 
	 		
			$GLOBALS["PDO"]->query("CREATE TABLE IF NOT EXISTS JOGADOR(
																		CODIGO INTEGER(7) NOT NULL PRIMARY KEY AUTO_INCREMENT,
																		USUARIO VARCHAR(20) NOT NULL,
																		SENHA VARCHAR(32) NOT NULL,
																		NOME VARCHAR(20) NOT NULL,
																		SOBRENOME VARCHAR(20) NOT NULL,
																		IDADE INTEGER(3) NOT NULL,
																		PONTUACAO INTEGER NOT NULL
																	   );");
			
			$GLOBALS["PDO"]->query("CREATE TABLE IF NOT EXISTS ITEM(
																	 CODIGO INTEGER(7) NOT NULL PRIMARY KEY AUTO_INCREMENT,
																	 DICA VARCHAR(100) NOT NULL,
																	 PALAVRA VARCHAR(40) NOT NULL
																	);");
																				
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