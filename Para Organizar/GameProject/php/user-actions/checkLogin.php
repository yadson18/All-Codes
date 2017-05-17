<?php  
	session_start();
	require_once "../pdo/SqlPDO.php";

	$pdo = new SqlPDO("localhost", "13306", "forca", "root", "");
	$checkUser = "WHERE usr_login = ? AND usr_password = ?";
	$password = md5($_POST["usr_password"]);
	$data = $pdo->select("usr_id, usr_login, usr_password", "users", $checkUser, [$_POST["usr_login"], $password]);

	if(!$data){
		header("Location: ../../index.html");
	}
	else{
		$userData = ["logged" => true, "usr_id" => $data[0]["usr_id"]];
		$_SESSION["user"] = $userData;
		header("Location: ../game/game.php");
	}
?>