<?php  
	session_start();

	class Login{
		public static function isNotAuthorized($link){
			return header("Location: {$link}");
		}
		
		public static function isAuthorized($dados, $link){
			foreach ($dados as $user) {
				$_SESSION["user_id"] = $user["user_id"];
			}
			
			return header("Location: {$link}");
		}
	}
?>