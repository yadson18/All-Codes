<?php
	try {
		$PDO = new PDO("mysql:host=localhost;port=13306;dbname=api", "root", "");
		
		function pdoInsert($PDO){
			$PDO->query("INSERT INTO vendedor(user_login, user_password, user_name, user_lastName, user_old) 
						 VALUES('yadson', '1234', 'Yadson', 'Matheus', 18);";
		}
	}
	catch (PDOException $e) {
		echo "Error.";
	}
?>