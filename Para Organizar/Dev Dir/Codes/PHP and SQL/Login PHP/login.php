<?php
	require_once "User.php";
	var_dump($_SESSION["users"]);
	
	$login = $_POST["login"];
	$pass = $_POST["pass"];
	for($i = 0; $i < sizeof( $_SESSION["users"]);){
		if($login == $_SESSION["users"][$i]-> getLogin() && $pass == $_SESSION["users"][$i]-> getPass()){
			echo "<h1 style='text-align: center'>Bem vindo $login</h1>";
			break;
		}
		else{
			$i++;
			if($i > sizeof($_SESSION["users"])){
				 echo "<h1 style='text-align: center'>Falha no login</h1>";
			}
		}
	}
?>