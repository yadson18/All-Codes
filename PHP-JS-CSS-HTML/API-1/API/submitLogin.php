<?php 
	require_once "Login.php";

	$login = $_POST['user_login'];
	$password = $_POST['user_password'];
	
	// O método estático checkLogin, irá buscar pelo login e senha passados por parâmetro.                          
	if(!Login::checkLogin($login, $password)){
	// Para o método notAuthorized, será passado o caminho da página que o usuário não autorizado será redirecionado. 
	  	Login::notAuthorized("back.php");
	}
	else{
	// Para o método authorized, será passado o caminho da página que o usuário autorizado será redirecionado.
		Login::authorized("oi.php");
	}
?>