<?php 
	require_once "sql/PDO.php";

	class Login{
		public static function checkLogin($login, $password){
			$condicao = " WHERE user_login='" . $login . "' AND user_password='" . $password . "'";
               
			$dados = pdoSelect("*", "vendedor", $condicao);
			return $dados->fetch(PDO::FETCH_ASSOC);
		}

		public static function authorized($homeLink){
			header("Location: " . $homeLink);
		}

		public static function notAuthorized($indexLink){
			header("Location: " . $indexLink);
		}

		public static function setUser($user){
			$GLOBALS["user"] = $user;
		}
	}
?>