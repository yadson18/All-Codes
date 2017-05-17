<?php  
	/*function startBuffer(){
		ob_start();
	}*/
	
	function buffer($srcControllerFile){
		ob_start();
		
		include $srcControllerFile;

		$content = ob_get_clean();

		include "default.php";
	}
?>