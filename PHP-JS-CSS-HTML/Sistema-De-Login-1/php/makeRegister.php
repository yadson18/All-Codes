<?php  
	require_once "../sql/SqlPDO.php";
	require_once "../class/Register.php";

	$pdo = new SqlPDO("localhost", "13306", "test", "root", "");
	$condicao = "WHERE user_login = ? AND user_password = ?";
	$dados = $pdo->select("user_login, user_password", "users", $condicao, array($_POST["user_login"], $_POST["user_password"]));

	if(!$dados){
		$colunas = "user_login, user_password, user_name, user_email, user_phone";
		$password = md5($_POST["user_password"]);
		$pdo->insert("users", $colunas, array($_POST['user_login'], $password, $_POST['user_name'], $_POST['user_email'], $_POST['user_phone']));
		Register::registered("../index.html");
	}
	else{
		Register::userExists("../register.html");
	}
?>