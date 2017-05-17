<?php  
	require_once "TabelaUser.php";
	require_once "PDO.php";

	// Método para a conexão com o banco de dados, valores necessários (Host, Base de dados, Usuário, Senha).
	//conn("localhost", "api", "root", "");
	
	// Aqui serão colocados o nome da base de dados e o nome da tabela.
	$user = new TabelaUser("api", "vendedor");

	// A tabela para o login tem como valores predefinidos (user_id, user_loin, user_password).
	// Aqui podem ser setados novos atributos para a tabela.
	$attr = array("user_name varchar(40) not null","user_lastName varchar(40) not null","user_old integer(3) not null");
	
	// Método para adicionar os novos atributos para a tabela.
	$user->setAtributos($attr);	
	
	//Método para criar a tabela.
	$user->createTable("localhost", "root", "");

	//var_dump(pdoInsert());
?>