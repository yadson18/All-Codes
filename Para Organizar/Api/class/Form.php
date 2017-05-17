<?php  
	class Form{
		public static function create($array){
			$form = "<form ";
			
			foreach($array as $index => $data){
				$form .= $index . "=" . $data . " ";
			}
			
			return $form . ">";
		}
		
		public function end(){
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