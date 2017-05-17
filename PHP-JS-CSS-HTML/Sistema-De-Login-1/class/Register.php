<?php  
	class Register{
		public static function userExists($link){
			return header("Location: {$link}");
		}

		public static function registered($link){
			return header("Location: {$link}");
		}
	}
?>