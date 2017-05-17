<?php  
	class Form{
		public static function create($values = array()){
			$form = "<form ";
			
			foreach ($values as $index => $value) {
				$form .= $index . "=" . $value . " ";
			}
			
			return $form . ">";
		}

		public static function end(){
			return "</form>";
		}

		public static function input($especify = array()){
			$input = "<input ";

			foreach ($especify as $index => $value) {
				$input .= $index . "=" . $value . " "; 
			}
			return $input . ">";
		}
	}
?>