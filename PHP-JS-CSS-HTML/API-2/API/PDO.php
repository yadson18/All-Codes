<?php
	try {
		$PDO = new PDO("mysql:host=localhost;port=13306;dbname=api", "root", "");
		
		//function pdoInsert(){
		//	return $GLOBALS["PDO"];
		//}
		var_dump($PDO);
	}
	catch (PDOException $e) {
		echo "Error.";
	}
?>