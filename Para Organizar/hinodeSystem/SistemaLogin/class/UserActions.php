<?php
	session_start();
	
	class UserActions{
		public static function cannotRegister($link){
			return header("Location: {$link}");
		}

		public static function canRegister($link){
			return header("Location: {$link}");
		}
		
		public static function loginIsNotAuthorized($link){
			return header("Location: {$link}");
		}
		
		public static function loginIsAuthorized($dados, $link){
			foreach ($dados as $user) {
				$_SESSION["user_id"] = $user["user_id"];
			}
			
			return header("Location: {$link}");
		}
	}
?>