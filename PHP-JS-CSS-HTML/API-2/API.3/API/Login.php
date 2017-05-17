<?php 
	require_once "sql/PDO.php";

	class Login{
		/*protected $user;

		public function __construct($user){
			$this->user = $user;
		}

		public function getUser(){
			$find = ' ';
			$i = strpos($this->user->getAtributos(1), $find);
			$palavra = substr($this->user->getAtributos(1), 0, $i);
			return $palavra;
		}

		public function checkUser(){
			
		}*/

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
	}
?>