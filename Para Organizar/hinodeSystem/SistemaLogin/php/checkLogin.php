<?php  
	require_once "../sql/SqlPDO.php";
	require_once "../class/UserActions.php";

	$pdo = new SqlPDO("localhost", "13306", "test", "root", "");
	$condicao = "WHERE user_login = ? AND user_password = ?";
	$password = md5($_POST["user_password"]);
	$dados = $pdo->select("user_id, user_login, user_password", "users", $condicao, array($_POST["user_login"], $password));

	if(!$dados){
		UserActions::loginIsNotAuthorized("../../index.html");
	}
	else{
		UserActions::loginIsAuthorized($dados, "../../userHome/home.php");
	}
?>