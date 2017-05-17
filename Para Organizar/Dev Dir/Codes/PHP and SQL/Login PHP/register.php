<?php
	require_once "User.php";
	
	if(!isset($_SESSION["users"])){
		$_SESSION["users"] = array();
	}
	
	$user = new User($_POST["login"], $_POST["pass"]);
	array_push($_SESSION["users"], $user);
	echo "<a href='index.html'>Fazer o login.</a>"
?>