<?php  
	require_once "TableUser.php";
	require_once "Login.php";

	// Inicializando a classe que será usada para a API de login.
	// A tabela para o login tem como valores predefinidos (user_id, user_login, user_password).
	$user = new TableUser();

	
	// Criando novos atributos para a tabela.
	$attr = array("user_name varchar(40) not null","user_lastName varchar(40) not null","user_age integer(3) not null");
	
	// Método para definir o nome da tabela, e se preciso, os atributos adicionais.
	$user->defineTable("vendedor", $attr);	
	
	//	Método para criar a tabela, é preciso o host/ base de dados/ usuário do sql/ e a senha do sql.
	$user->createTable("localhost", "api", "root", "");

	// Método para definir o usuário que será usado na api de login.
	Login::setUser($user);

	//var_dump($user->getTypeAttribute());
?>