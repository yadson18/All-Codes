<?php  
	require_once "../sql/SqlPDO.php";
	require_once "../class/UserActions.php";

	$pdo = new SqlPDO("localhost", "13306", "test", "root", "");
	$condicao = "WHERE user_login = ?";
	$dados = $pdo->select("user_login", "users", $condicao, array($_POST["user_login"]));

	if(!$dados){
		$password = md5($_POST["user_password"]);

		$colunas = array("user_login", "user_password", "user_name", "user_email", "user_phone", "user_age");
		$valores = array($_POST['user_login'], $password, $_POST['user_name'], $_POST['user_email'], $_POST['user_phone'], $_POST['user_age']);

		$pdo->insert("users", $colunas, $valores);
		UserActions::canRegister("../../index.html");
	}
	else{
		UserActions::cannotRegister("../register.html");
	}
?>