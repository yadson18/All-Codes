<?php
	 require_once "PDO.php";
	 try{ 
	 		$GLOBALS["PDO"] = $PDO = new PDO( 'mysql:host=' . MYSQL_HOST . ';dbname=' . MYSQL_DB_NAME, MYSQL_USER, MYSQL_PASSWORD ); 
	 		echo "<h1 style='text-align:center'>Conectado...</h1>";
	 		
	 		function create($tabela, $atributos){
	 			$GLOBALS["PDO"]->query("CREATE TABLE " . $tabela . " IF NOT EXISTS(" . $atributos . ");");
	 		}
	 	}
	 		
	 		/*$query ="CREATE TABLE clientes IF NOT EXISTS(
	 			id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	 			nome VARCHAR(40) NOT NULL,
	 			idade INTEGER(3) NOT NULL
	 		);";
	   $PDO-> query($query);
	   
	   $dados = "INSERT INTO clientes(nome, idade) VALUES('<script> alert('Oi!'); </script>', 18)";
	   $PDO-> query($dados);
	   
	   $select = "SELECT * FROM clientes";
	   $data = $PDO-> query($select);
	   $dados = $data->fetchAll();
	   foreach($dados as $d){
	   	echo "<h1 style='text-align:center'>" . $d["nome"] . "</h1>";
	   }
	   //print_r($dado
	 	} 
	 	*/catch(PDOException $e){ 
	 		echo 'Erro ao conectar com o MySQL: ' . $e->getMessage(); 
	 	}
?>