<?php  
	session_start();

	if(!isset($_SESSION["users"]) || !isset($_SESSION["logado"])){
		$_SESSION["users"] = array();
		$_SESSION["logado"] = false;
	}

	function inserirUser($user){
		array_push($_SESSION["users"], $user);
	}

	function logar($user){
		$check = false;
		for($i = 0; $i < sizeof($_SESSION["users"]); $i++){
			if($user-> getLogin() == $_SESSION["users"][$i]-> getLogin() && $user-> getPass() == $_SESSION["users"][$i]-> getPass()){
				$check = true;
				$_SESSION["logado"] = true;
				break;
			}
		}

		return $check;
	}

	function deslogar(){
		$_SESSION["logado"] = false;
	}
?>