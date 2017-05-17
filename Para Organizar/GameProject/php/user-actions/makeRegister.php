<?php  
	require_once "../pdo/SqlPDO.php";

	$pdo = new SqlPDO("localhost", "13306", "forca", "root", "");
	$getUserCondition = "WHERE usr_login = ?";
	$data = $pdo->select("usr_login", "users", $getUserCondition, [$_POST["usr_login"]]);

	if(!$data){
		$passwordMD5 = md5($_POST["usr_password"]);
		$userColumns = ["usr_login", "usr_password", "usr_name", "usr_age"];
		$userValues = [$_POST['usr_login'], $passwordMD5, $_POST['usr_name'], $_POST['usr_age']];
		$pdo->insert("users", $userColumns, $userValues);
		
		$getUserCondition = "WHERE usr_login = ? AND usr_password = ?";
		$usr_id = $pdo->select("usr_id", "users", $getUserCondition, [$_POST["usr_login"], $passwordMD5]);
		$statisticColumns = ["stc_victory", "stc_defeat", "stc_point", "stc_usr_id"];
		$statisticValues = [0, 0, 0, $usr_id[0]["usr_id"]];
		$pdo->insert("statistics", $statisticColumns, $statisticValues);
		
		header("Location: ../../index.html");
	}
	else{
		header("Location: ../../register.html");
	}
?>