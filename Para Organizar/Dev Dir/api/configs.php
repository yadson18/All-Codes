<?php  
	include "class/Form.php";
	/*function startBuffer(){
		ob_start();
	}*/
	
	function buffer($srcControllerFile){
		ob_start();

		include $srcControllerFile;

		return $content = ob_get_clean();

		//include "default.php";
	}

	/*function fetchAll(){
		foreach ($ as $key => $value) {
			# code...
		}
	}*/
?>